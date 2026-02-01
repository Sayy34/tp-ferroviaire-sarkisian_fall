package fr.cours.info.tp.ferroviaire.models;

public class Gare {
    private String nom;
    private int nombreQuais;
    private String conflit;
    private String conflitsvp;

    // Constructeurs
    public Gare() {
    }
    private String nomGare = "TGV";


    public Gare(String nom, int nombreQuais) {
        this.nom = nom;
        this.nombreQuais = nombreQuais;
    }

    // Getters & Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNombreQuais() {
        return nombreQuais;
    }

    public void setNombreQuais(int nombreQuais) {
        this.nombreQuais = nombreQuais;
    }

    @Override
    public String toString() {
        return "Gare{" +
                "nom='" + nom + '\'' +
                ", nombreQuais=" + nombreQuais +
                '}';
    }

    public interface IGare {
        String getId();

        String getNom();           // ← Perso A

        int getNombreQuais();      // ←Perso B
    }
    private String nom2;

}