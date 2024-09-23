/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_dussart;

import java.util.Scanner;

/**
 *
 * @author alice
 */
public class TP1_manipNombresInt_DUSSART {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int nb1;
    int nb2;
    int somme;
    int produit;
    int difference;
    int quotient;
    int reste;
    Scanner sc = new Scanner(System.in);
    System.out.println("\n Entrer un premier entier:");
    nb1=sc.nextInt();
    System.out.println("\n Entrer un deuxième entier:");
    nb2=sc.nextInt();
    somme=nb1+nb2;
    produit=nb1*nb2;
    difference=nb1-nb2;
    System.out.println("La somme est : "+somme+"\nLa difference est: "+difference+"\nLe produit est : "+produit);
    quotient=nb1/nb2;
    reste=nb1%nb2;
    System.out.println("Le quotient est : "+quotient+"\nLe reste est : "+reste);

    }
    
}
