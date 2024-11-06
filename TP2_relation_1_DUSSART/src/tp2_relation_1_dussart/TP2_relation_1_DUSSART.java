/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_dussart;

/**
 *
 * @author alice
 */
public class TP2_relation_1_DUSSART {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);

        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        System.out.println("Liste des voitures disponibles:\n" + uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);

        bob.ajouterVoiture(uneClio);
        bob.ajouterVoiture(uneAutreClio);
        reno.ajouterVoiture(une2008);
        reno.ajouterVoiture(uneMicra);

        System.out.println("La première voiture de Bob est " + bob.listeVoitures[0]);

        System.out.println("Voitures de Bob: ");
        for (int i = 0; i < bob.nbVoitures; i++) {
            System.out.println(bob.listeVoitures[i]);
        }
        
        System.out.println("Voitures de Reno: ");
        for (int i = 0; i < reno.nbVoitures; i++) {
            System.out.println(reno.listeVoitures[i]);
        }
    }
}
    
    

