package Attribut;
public class Voiture {
    private String marque;

    public Voiture(String marque) {
        this.marque = marque;
    }

    public void afficherMarque() {
        System.out.println("Marque de la voiture: " + marque);
    }

    public static void main(String[] args) {
        Voiture voiture = new Voiture("Toyota");
        voiture.afficherMarque();
    }
}
