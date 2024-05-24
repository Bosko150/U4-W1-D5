package MediaPlayer;

public abstract class ElementoMultimediale {
    final private String titolo;
    final private int durata;

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


    public int getDurata() {
        return durata;
    }

}
