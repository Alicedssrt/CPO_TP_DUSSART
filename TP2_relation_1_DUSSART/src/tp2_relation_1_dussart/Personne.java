/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_dussart;

/**
 *
 * @author alice
 */
class Personne {
        private String prenom;
    private String nom;
    public int nbVoitures;
    public Voiture[] listeVoitures;

    public Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
        this.listeVoitures = new Voiture[3]; 
        this.nbVoitures = 0;
    }

    Personne(String bobby, String sixkiller) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNomComplet() {
        return prenom + " " + nom;
    }

    public boolean ajouterVoiture(Voiture voitureAAjouter) {
        if (voitureAAjouter.proprietaire != null) {
            System.out.println("La voiture " + voitureAAjouter + " a déjà un propriétaire.");
            return false;
        }
        if (nbVoitures >= 3) {
            System.out.println(getNomComplet() + " ne peut pas posséder plus de 3 voitures.");
            return false;
        }

        listeVoitures[nbVoitures] = voitureAAjouter;
        nbVoitures++;
        voitureAAjouter.proprietaire = this; // Attribuer ce propriétaire à la voiture
        return true;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "prénom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", nombre de voitures=" + nbVoitures +
                '}';
    }
}