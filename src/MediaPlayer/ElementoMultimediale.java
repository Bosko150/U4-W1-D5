package MediaPlayer;

public abstract class ElementoMultimediale {
    private String titolo;
    private int durata;

    public ElementoMultimediale(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
    }

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
        this.durata = 0;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
}
