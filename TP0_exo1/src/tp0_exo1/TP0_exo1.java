/*
 * Dussart Alice
 * TDC
 * 17/09/2024
 */
package tp0_exo1;

import java.util.Scanner;

/**
 *
 * @author alice
 */
public class TP0_exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bonjour");
        System.out.println("Au revoir!");
        String prenom;
    Scanner sc;
    sc = new Scanner(System.in);
    System.out.println("Quel est votre prenom ?");
    prenom = sc.nextLine();
    System.out.println("Au revoir "+prenom);
    }
    
}
