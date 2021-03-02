package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // On déclare un scanner pour lire les entrées de la console
        Scanner sc = new Scanner(System.in);

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
        System.out.println("Commande suivante :");

        //On récupère le plat2
        String p2 = sc.nextLine();

        if (p2="") {
            //On affiche l'addition
            System.out.println(q1 + " x " + p1 + " " + px1 + "euros");
        } else {
            //A développer, en attendant mettre fin
            System.out.println("A suivre");
        }

        // On ferme le scanner
        sc.close();
    }
}
