package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // On déclare un scanner pour lire les entrées de la console
        Scanner sc = new Scanner(System.in);

        // Boucle while tant qu'il y a un autre plat
        int index = 1;
        while (index == 1){

            // On demande le plat
            System.out.println("Entrez plat : ");

            // On récupère le plat
            String p1 = sc.nextLine();

            // On demande la quantité
            System.out.println("Entrez la quantité : ");
            int q1 = sc.nextInt();
            sc.nextLine();

            // On inscrit le prix
            System.out.println("Entrez le prix");
            float px1 = sc.nextFloat();
            sc.nextLine();

            // On demande s'il y a un autre plat
            System.out.println("Y a t il une autre commande ? Oui = 1 / Non = 0");

            // On récupère la réponse
            index = sc.nextInt();
            sc.nextLine();

        }

        // On ferme le scanner
        sc.close();
    }
}
