package tp2_bieres_dussart;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alice
 */
public class BouteilleBiere {
    String nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;

    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false; 
    }

    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degrés)");
        System.out.println("Brasserie : " + brasserie);
    }

    public boolean decapsuler() {
        if (!ouverte) {
            ouverte = true;
            System.out.println("La bouteille est maintenant ouverte.");
            return true;
        } else {
            System.out.println("La bouteille est déjà ouverte !");
            return false;
        }
    }

    @Override
    public String toString() {
        String chaine_a_retourner = nom + " (" + degreAlcool + " degrés)";
        chaine_a_retourner += " brassée par " + brasserie;
        chaine_a_retourner += ", ouverte: " + (ouverte ? "oui" : "non");
        return chaine_a_retourner;
    }
}