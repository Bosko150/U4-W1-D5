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

}
