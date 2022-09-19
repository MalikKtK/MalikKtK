package demo;

public class Postinfo {
    private int Postnummer;
    private String By;

    public Postinfo(int postnummer, String by) {
        Postnummer = postnummer;
        By = by;
    }

    public String toString() {
        return "Postnummer: "+Postnummer+" By: " + By;
    }

    public int getPostnummer() {
        return Postnummer;
    }

    public void setPostnummer(int postnummer) {
        Postnummer = postnummer;
    }

    public String getBy() {
        return By;
    }

    public void setBy(String by) {
        By = by;
    }
}
