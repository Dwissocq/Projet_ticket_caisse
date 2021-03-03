package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // On déclare un scanner pour lire les entrées de la console
        Scanner sc = new Scanner(System.in);

        //Définir les variables
        float prixtotal=0;
        String listeCommande="";

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

            //On calcule le prix total
            prixtotal =prixtotal + (q1 * px1);

            listeCommande= q1+" x "+p1+" ( "+px1+ "€) "+q1*px1+"€\n"+ listeCommande;

            // On demande s'il y a un autre plat
            System.out.println("Y a t il une autre commande ? Oui = 1 / Non = 0");

            // On récupère la réponse
            index = sc.nextInt();
            sc.nextLine();

        }

        System.out.println("----------------FACTURE----------------");
        System.out.println(listeCommande);
        System.out.println("Prix total de "+prixtotal+"€");
        System.out.println("-------------BONNE JOURNEE-------------");

        // On ferme le scanner
        sc.close();
    }
}
