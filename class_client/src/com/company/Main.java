package com.company;

import com.company.tool.Client;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Client[] table = new Client[]{
                new Client("Weller", "Paul", "Baker Street", "Londre"),
                new Client("Jack", "White", "Detroit"),
                new Client("Less", "Claypool", "San Fransisco"),
                new Client("Johnny", "Thunders", "New York")};

        for (Client cl: table
             ) {
            System.out.println(cl);
        }




    }
}
