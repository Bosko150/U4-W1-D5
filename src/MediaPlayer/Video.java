package MediaPlayer;

import interfaces.Luminosita;
import interfaces.Volume;

public class Video extends ElementoMultimediale implements Volume, Luminosita {
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata);
        this.volume = volume;
        this.luminosita = luminosita;
    }

    @Override
    public void alzaVolume(int vol) {
        this.volume += vol;
    }

    @Override
    public void abbassaVolume(int vol) {
        this.volume -= vol;
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
