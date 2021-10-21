package com.company;

import com.company.gui.MenuMessage;
import com.company.model.Message;
import com.company.tool.*;
import org.germain.tool.ManaBox;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Transcoder test1 = new Transcoder("CFfrkowl.aDzyS:eHjsGPZgMApWvRYVmtnK!BuU IQiEXTxbqhLdNJO,'c");
        System.out.println(test1.decodeMessage("BYAPASBNBGAPASBGASBNASAFBHBGBNAHAJBNAZAFBLADBNAPASASAJAMAPADBNBJBJBJ"));

        Transcoder test2 = new Transcoder("CFfrkowl.aDzyS:eHjsGPZgMApWvRYVmtnK!BuU IQiEXTxbqhLdNJO,'c");
        System.out.println(test2.codeMessage("Les tésts sont là pour êssâyer !!!"));

        Path home = Path.of("/home/silvanol/Documents/messageCode");
        Path path = Paths.get(String.valueOf(home), "encoded.txt");
        System.out.println(home);


        //décoder
        //Message message = new Message(true,home,home,home);
        //message.readNwrite("encoded.txt","key.txt");

        //encoder
        //Message message1 = new Message(false, home, home, home);
        //message1.readNwrite("decoded.txt", "key.txt");


        MenuMessage message = new MenuMessage();


    }
}
