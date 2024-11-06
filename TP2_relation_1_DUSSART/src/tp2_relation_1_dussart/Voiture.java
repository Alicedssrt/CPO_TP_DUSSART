/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_dussart;

/**
 *
 * @author alice
 */
class Voiture {
        private String modele;
    private String marque;
    private int puissance;
    public Personne proprietaire;

    public Voiture(String modele, String marque, int puissance) {
        this.modele = modele;
        this.marque = marque;
        this.puissance = puissance;
        this.proprietaire = null; 
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "modèle='" + modele + '\'' +
                ", marque='" + marque + '\'' +
                ", puissance=" + puissance +
                ", propriétaire=" + (proprietaire != null ? proprietaire.getNomComplet() : "Aucun") +
                '}';
    }
}
