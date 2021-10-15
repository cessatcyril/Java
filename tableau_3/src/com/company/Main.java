package com.company;

public class Main {

    public static void main(String[] args) {
        int index;
        int[] tableN = new int[]{5, 2, 6, 8, 4, 1, 9, 3, 7};
        int[] tableT = new int[tableN.length];
        boolean transfert = true;


        while (transfert) {
            transfert = false;

            for (index = 0; index < tableN.length - 1; index++) {

                if (tableN[index] > tableN[index + 1]) {
                    //swap dans une table temporaire
                    tableT[index] = tableN[index + 1];
                    tableT[index + 1] = tableN[index];
                    //réécritrure de la table principale avec la table temporaire
                    tableN[index] = tableT[index];
                    tableN[index + 1] = tableT[index + 1];
                    // transfert devient true car un swap a été fait
                    transfert = true;
                }

            }
        }
        for (index = 0; index < tableN.length; index++) {
            System.out.print(tableN[index]);
            System.out.println();
        }

    }
}
