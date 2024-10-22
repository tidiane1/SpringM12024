package sn.niit.devspring.model;

public class Adresse {
    private String rue;
    private String maison;
    private String ville;

    public Adresse() {
    }

    public Adresse(String rue, String maison, String ville) {
        this.rue = rue;
        this.maison = maison;
        this.ville = ville;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getMaison() {
        return maison;
    }

    public void setMaison(String maison) {
        this.maison = maison;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "rue='" + rue + '\'' +
                ", maison='" + maison + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}
