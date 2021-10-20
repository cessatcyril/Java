package com.company;

import com.company.tool.*;

import java.nio.file.Path;
import java.nio.file.Paths;

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



    }
}
