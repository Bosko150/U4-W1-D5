package MediaPlayer;

public class Audio extends ElementoMultimediale {
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }

}
