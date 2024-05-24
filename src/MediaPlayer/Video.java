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

    @Override
    public void play(int durata) {
        String esclam = "";
        for (int x = 0; x < volume; x++) {
            esclam += "!";
        }
        String aster = "";
        for (int z = 0; z < luminosita; z++) {
            aster += "*";
        }
        for (int i = 0; i < durata; i++) {
            System.out.println(this.getTitolo() + " " + esclam + " " + aster);
        }

    }
}
