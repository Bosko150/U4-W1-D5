package MediaPlayer;

import interfaces.Luminosita;

public class Immagine extends ElementoMultimediale implements Luminosita {
    int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
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
