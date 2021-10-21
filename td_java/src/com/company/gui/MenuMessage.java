package com.company.gui;

import com.company.model.Message;

import java.nio.file.Path;
import java.util.Scanner;

public class MenuMessage {
    Scanner sc = new Scanner(System.in);
    String fichier;
    String cle;
    int choixMenu;
    Path encoderPath = Path.of("/home/silvanol/Documents/messageCode");
    Path clearPath = Path.of("/home/silvanol/Documents/messageCode");
    Path clePath = Path.of("/home/silvanol/Documents/messageCode");


    public MenuMessage() {

        while (true) {
            System.out.println("╔══════════════════════════════════════╗");
            System.out.println("║   System d'encodage et de décodage   ║");
            System.out.println("║             de messages              ║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.println("║       1) Décoder un message          ║");
            System.out.println("║       2) Encode un message           ║");
            System.out.println("║       3) Quitter                     ║");
            System.out.println("╚══════════════════════════════════════╝");
            choixMenu = sc.nextInt();


            switch (choixMenu) {
                case 1 -> {
                    System.out.println("Entrez le nom du fichier à décoder");
                    fichier = sc.next();
                    System.out.println("Entrez le nom du fichier contenant la clé de décodage");
                    cle = sc.next();
                    Message message = new Message(true,encoderPath,clearPath,clePath);
                    message.readNwrite(fichier,cle);
                    System.out.println("La traduction à été écrite dans : " + clearPath+ "/decoded.txt");

                }
                case 2 -> {
                    System.out.println("Entrez le nom du fichier à coder");
                    fichier = sc.next();
                    System.out.println("Entrez le nom du fichier contenant la clé de décodage");
                    cle = sc.next();
                    Message message = new Message(false,encoderPath,clearPath,clePath);
                    message.readNwrite(fichier,cle);
                    System.out.println("Le message codé à été écrite dans : " + clearPath + "/encoded.txt");
                }
                case 3 -> System.exit(0);
                default -> System.out.println("imput invalide");
            }


        }
    }


}
