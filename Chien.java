package Attribut;
public class Chien extends Animal {

    public Chien(String nom) {
        this.nom = nom;
    }

    public void afficherNom() {
        System.out.println("Nom du chien: " + nom);
    }

    public static void main(String[] args) {
        Chien chien = new Chien("Rex");
        chien.afficherNom();
    }
}
