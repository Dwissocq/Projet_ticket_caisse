package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // On déclare un scanner pour lire les entrées de la console
        Scanner sc = new Scanner(System.in);

        // Combien d'articles sont à enregistrer
        System.out.println("Nombres d'articles");
        int articles = sc.nextInt();
        sc.nextLine();

        //Boucle
        for (int totalarticles=0; articles<totalarticles; totalarticles++);

        { // On demande le plat
            System.out.println("Entrez plat : ");

            // On récupère le plat
            String plat = sc.nextLine();

            // On demande la quantité
            System.out.println("Entrez la quantité : ");
            int quantité = sc.nextInt();
            sc.nextLine();

            // On inscrit le prix
            System.out.println("Entrez le prix");
            float prix = sc.nextFloat();
            sc.nextLine();

            // On calcule la somme
            float product = quantité * prix;
        }
        System.out.println("Total de votre commande = " + product + " euros");

        // On ferme le scanner
        sc.close();
    }
}
