package MediaPlayer;

import interfaces.Luminosita;

public class Immagine extends ElementoMultimediale implements Luminosita {
    int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void show() {
        String img = "";
        for (int i = 0; i < luminosita; i++) {
            img += "*";
        }
        System.out.println(this.getTitolo() + " " + img);
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    @Override
    public void alzaLuminosita(int lum) {
        this.luminosita += lum;
    }

    @Override
    public void abbassaLuminosita(int lum) {
        this.luminosita -= lum;
    }

}
