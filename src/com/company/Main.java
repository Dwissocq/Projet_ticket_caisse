package com.company;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // On déclare un scanner pour lire les entrées de la console
        Scanner sc = new Scanner(System.in);

        //Définir les variables
        float prixtotal=0;
        String liste="";

        ArrayList totalplat = new ArrayList();
        ArrayList totalquantite = new ArrayList();
        ArrayList totalprix = new ArrayList();

        // Boucle while tant qu'il y a un autre plat
        int index = 1;
                while (index == 1){

            // On demande le plat
            System.out.println("Entrez plat : ");

            // On récupère le plat
            String p1 = sc.nextLine();
            totalplat.add (p1);

            // On demande la quantité
            System.out.println("Entrez la quantité : ");
            int q1 = sc.nextInt();
            sc.nextLine();
            totalquantite.add (q1);

            // On inscrit le prix
            System.out.println("Entrez le prix");
            float px1 = sc.nextFloat();
            sc.nextLine();
            totalprix.add (px1);

            //On calcule le prix total
            prixtotal =prixtotal + (q1 * px1);

            liste= q1+" x "+p1+" ( "+px1+ "€) "+q1*px1+"€\n"+ liste;

            // On demande s'il y a un autre plat
            System.out.println("Y a t il une autre commande ? Oui = 1 / Non = 0");

            // On récupère la réponse
            index = sc.nextInt();
            sc.nextLine();

        }

        System.out.println("----------------FACTURE----------------");
        System.out.println(liste);
        System.out.printf("Prix total : %24s €\n", prixtotal);
        System.out.println("-------------BONNE JOURNEE-------------");

        // On ferme le scanner
        sc.close();
    }
}
