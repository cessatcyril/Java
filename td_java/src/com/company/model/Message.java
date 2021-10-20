package com.company.model;

import com.company.tool.Transcoder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
    private Transcoder transcoder = new Transcoder(key);

    public Message(Boolean b, Path p1, Path p2, Path p3) {
        encoded = b;
        msgClearPath = p1;
        msgEncodedPath = p2;
        keyPath = p3;

    }


    public void readNwrite(String nomFichier) {
        List<String> listeCoder = new ArrayList<>();

        if (encoded == true) {
            Path path = Paths.get(String.valueOf(msgEncodedPath), "encoded.txt");
            try {
                msgEncoded = Files.readAllLines(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (String ligne : msgEncoded) {
                msgClear.add(transcoder.decodeMessage(ligne));

                //ecrire le fichier avec le message décoder
            }
        } else {
            Path path = Paths.get(String.valueOf(msgClearPath), "encoded.txt");
            try {
                msgClear = Files.readAllLines(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (String ligne : msgClear) {
                msgEncoded.add(transcoder.codeMessage(ligne));

                //ecrire le fichier avec le message coder
            }
        }
    }


}
