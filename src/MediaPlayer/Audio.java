package MediaPlayer;

import interfaces.Volume;

public class Audio extends ElementoMultimediale implements Volume {
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
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
    public void play(int durata) {

        String esclam = "";
        for (int x = 0; x < volume; x++) {
            esclam += "!";
        }
        for (int i = 0; i < durata; i++) {
            System.out.println(this.getTitolo() + " " + esclam);
        }
    }

}
