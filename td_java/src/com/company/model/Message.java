package com.company.model;

import com.company.tool.Transcoder;
import org.germain.tool.ManaBox;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Message {
    private Boolean encoded;
    private List<String> msgClear;
    private List<String> msgEncoded;
    private Path msgClearPath;
    private Path msgEncodedPath;
    private Path keyPath;
    private String key;
    private Transcoder transcoder;

    /**
     * constructeur
     *
     * @param b  true pour fichier codé, false pour fichier non codé
     * @param p1 chemin pour le fichier message décodé
     * @param p2 chemin pour le fichier message codé
     * @param p3 chemin pour le fichier de la clé
     */
    public Message(Boolean b, Path p1, Path p2, Path p3) {
        encoded = b;
        msgClearPath = p1;
        msgEncodedPath = p2;
        keyPath = p3;

    }


    public void readNwrite(String nomFichier, String nomCle) {
        Path cle = Path.of(String.valueOf(keyPath), nomCle);
        Path clear = Path.of(String.valueOf(msgClearPath), "decoded.txt");
        Path coded = Path.of(String.valueOf(msgEncodedPath), "encoded.txt");

        if (encoded) {
            if (Files.exists(Path.of(String.valueOf(msgEncodedPath), nomFichier))) {
                msgClear = new ArrayList<>();

                //décode clé et enregistre dans key
                cleDecoder(cle);

                //initialise transcoder
                transcoder = new Transcoder(key);

                //lit le message codé et l'enregistre dans msgEncoded
                readEncodedMessage(nomFichier);

                //boucle pour décoder le msgEncoded dans msgClear.
                for (String ligne : msgEncoded) {
                    msgClear.add(transcoder.decodeMessage(ligne));
                }

                //écrit le message si le fichier "decoded.txt" n'existe pas
                writeDecodedMessage(clear, msgClear);
            } else {
                erreurFichier();
            }
        } else {
            if (Files.exists(Path.of(String.valueOf(msgClearPath), nomFichier))) {
                msgEncoded = new ArrayList<>();

                //décode clé et enregistre dans key
                cleDecoder(cle);

                //initialise transcoder
                transcoder = new Transcoder(key);

                //lit le message non codé et l'engergistre
                readUncodedMessage(nomFichier);

                //boucle pour codé le message
                for (String ligne : msgClear) {
                    msgEncoded.add(transcoder.codeMessage(ligne));
                }

                //ecrit le message si le fichier "encoded.txt" n'éxiste pas
                writeDecodedMessage(coded, msgEncoded);

            } else {
                erreurFichier();
            }
        }
    }

    /**
     * écrit un message dans un fichier.
     * @param message liste contenant le fichier à écrire
     * @param fichier chemin pour le fichier contenant le message a écrire
     */
    private void writeDecodedMessage(Path fichier, List<String> message) {
        if (Files.exists(fichier)) {
            System.out.println("le fichier existe déjà !!!");
        } else {
            for (String chaine : message
            ) {
                try {
                    Files.writeString(fichier, chaine + System.lineSeparator(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    /**
     * lit et enregistre le message crypter contenue dans nomFichier
     *
     * @param nomFichier le nom du fichier contenant le message
     */
    private void readEncodedMessage(String nomFichier) {
        Path path = Paths.get(String.valueOf(msgEncodedPath), nomFichier);
        try {
            msgEncoded = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * lit et enregistre le message  non  crypter contenue dans nomFichier
     *
     * @param nomFichier le nom du fichier contenant le message
     */
    private void readUncodedMessage(String nomFichier) {
        Path path = Paths.get(String.valueOf(msgClearPath), nomFichier);
        try {
            msgClear = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * lit le fichier contenant la clé codé, le décode et l'enregistre dans key
     *
     * @param cle chemin + fichier contenant la clé
     */
    private void cleDecoder(Path cle) {
        List<String> listeCle = new ArrayList<>();
        try {
            listeCle = Files.readAllLines(cle);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //décrypter la clé et l'enregistrer dans key
        key = listeCle.get(0);
        key = ManaBox.decrypt(key);
    }

    /**
     * affiche un message d'erreur si le fichier spécifier existe déjà
     */
    public void erreurFichier() {
        System.out.println("Le fichier spécifié n'éxiste pas.");
    }

}
