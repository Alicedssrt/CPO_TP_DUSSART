/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_dussart;

import java.util.Scanner;

/**
 *
 * @author alice
 */
public class TP2_convertisseurObjet_DUSSART {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Convertisseur convertisseur = new Convertisseur();
Scanner scanner = new Scanner(System.in);
boolean continuer = true;
        while (continuer) {
            System.out.println("Choisissez une conversion :");
            System.out.println("1 : Celsius vers Kelvin");
            System.out.println("2 : Kelvin vers Celsius");
            System.out.println("3 : Fahrenheit vers Celsius");
            System.out.println("4 : Celsius vers Fahrenheit");
            System.out.println("5 : Kelvin vers Fahrenheit");
            System.out.println("6 : Fahrenheit vers Kelvin");
            System.out.println("0 : Quitter");
            int choix = scanner.nextInt();
            double valeur, resultat;
            switch (choix) {
                case 1:
                    System.out.println("Entrez la température en Celsius :");
                    valeur = scanner.nextDouble();
                    resultat = convertisseur.CelciusVersKelvin(valeur);
                    System.out.println("Résultat : " + resultat + " K");
                    break;
                case 2:
                    System.out.println("Entrez la température en Kelvin :");
                    valeur = scanner.nextDouble();
                    resultat = convertisseur.KelvinVersCelcius(valeur);
                    System.out.println("Résultat : " + resultat + " °C");
                    break;
                case 3:
                    System.out.println("Entrez la température en Fahrenheit :");
                    valeur = scanner.nextDouble();
                    resultat = convertisseur.FarenheitVersCelcius(valeur);
                    System.out.println("Résultat : " + resultat + " °C");
                    break;
                case 4:
                    System.out.println("Entrez la température en Celsius :");
                    valeur = scanner.nextDouble();
                    resultat = convertisseur.CelciusVersFarenheit(valeur);
                    System.out.println("Résultat : " + resultat + " °F");
                    break;
                case 5:
                    System.out.println("Entrez la température en Kelvin :");
                    valeur = scanner.nextDouble();
                    resultat = convertisseur.KelvinVersFarenheit(valeur);
                    System.out.println("Résultat : " + resultat + " °F");
                    break;
                case 6:
                    System.out.println("Entrez la température en Fahrenheit :");
                    valeur = scanner.nextDouble();
                    resultat = convertisseur.FarenheitVersKelvin(valeur);
                    System.out.println("Résultat : " + resultat + " K");
                    break;
                case 0:
                    continuer = false;
                    break;
                default:
                    System.out.println("Choix invalide.");
            }

            System.out.println(convertisseur);
        }

        scanner.close();
    }
}

