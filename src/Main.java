import MediaPlayer.Audio;
import MediaPlayer.ElementoMultimediale;
import MediaPlayer.Immagine;
import MediaPlayer.Video;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //array precompilato per testare riproduciArray più velocemente
        ElementoMultimediale video1 = new Video("video1", 10, 10, 10);
        ElementoMultimediale video2 = new Video("video2", 10, 10, 10);
        ElementoMultimediale audio1 = new Audio("audio1", 10, 10);
        ElementoMultimediale audio2 = new Audio("audio2", 10, 10);
        ElementoMultimediale immagine1 = new Immagine("immagine1", 10);


        ElementoMultimediale[] player = {video1, video2, audio1, audio2, immagine1};

//        ElementoMultimediale[] player = new ElementoMultimediale[5];
//
//        for (int i = 0; i < player.length; i++) {
//            System.out.println("quale tipo di file vuoi inserire? (1 per video/ 2 per audio/ 3 per immagine)");
//            String response = scanner.nextLine();
//            switch (response) {
//                case "1":
//                    System.out.println("inserisci il titolo del video");
//                    String titolo = scanner.nextLine();
//
//                    System.out.println("inserisci la durata del video");
//                    int durata = Integer.parseInt(scanner.nextLine());
//
//                    System.out.println("inserisci il volume del video");
//                    int volume = Integer.parseInt(scanner.nextLine());
//
//                    System.out.println("inserisci la luminosita del video");
//                    int luminosita = Integer.parseInt(scanner.nextLine());
//
//                    player[i] = new Video(titolo, durata, volume, luminosita);
//                    break;
//                case "2":
//                    System.out.println("inserisci il titolo dell'audio");
//                    titolo = scanner.nextLine();
//                    System.out.println("inserisci la durata dell'audio");
//                    durata = Integer.parseInt(scanner.nextLine());
//                    System.out.println("inserisci il volume dell'audio");
//                    volume = Integer.parseInt(scanner.nextLine());
//                    player[i] = new Audio(titolo, durata, volume);
//                    break;
//                case "3":
//                    System.out.println("inserisci il titolo dell'immagine");
//                    titolo = scanner.nextLine();
//                    System.out.println("inserisci la luminosita dell'immagine");
//                    luminosita = Integer.parseInt(scanner.nextLine());
//                    player[i] = new Immagine(titolo, luminosita);
//                    break;
//            }
//        }


        riproduciArray(player);
    }

    public static void riproduciArray(ElementoMultimediale[] array) {
        System.out.println("Quale elemento vuoi selezionare ? (1, 2, 3, 4, 5 o seleziona 0 per uscire)");
        String response = scanner.nextLine();
        switch (response) {
            case "1":
                controlloMedia(array[0]);
                break;
            case "2":
                controlloMedia(array[1]);
                break;
            case "3":
                controlloMedia(array[2]);
                break;
            case "4":
                controlloMedia(array[3]);
                break;
            case "5":
                controlloMedia(array[4]);
                break;
        }
    }


    public static void controlloMedia(ElementoMultimediale elemento) {
        if (elemento instanceof Video) {
            System.out.println("elemento selezionato: " + elemento.getTitolo());
            System.out.println("1-riproduci video 2-cambia volume 3-cambia luminosita");
            String modificaVideo = scanner.nextLine();
            switch (modificaVideo) {
                case "1":
                    ((Video) elemento).play(elemento.getDurata());
                    break;
                case "2":
                    System.out.println("volume corrente: " + ((Video) elemento).getVolume() + "// 1-abbassa volume 2-alza volume");
                    String modificaVolume = scanner.nextLine();
                    switch (modificaVolume) {
                        case "1":
                            System.out.println("quanto vuoi abbassare il volume?");

                            ((Video) elemento).abbassaVolume(Integer.parseInt(scanner.nextLine()));

                            System.out.println("volume corrente: " + ((Video) elemento).getVolume());
                            break;
                        case "2":
                            System.out.println("quanto vuoi alzare il volume?");

                            ((Video) elemento).alzaVolume(Integer.parseInt(scanner.nextLine()));

                            System.out.println("volume corrente: " + ((Video) elemento).getVolume());
                            break;
                    }
                    break;
                case "3":
                    System.out.println("luminosita corrente: " + ((Video) elemento).getLuminosita() + "// 1-abbassa luminosita 2-alza luminosita");
                    String modificaLuminosita = scanner.nextLine();
                    switch (modificaLuminosita) {
                        case "1":
                            System.out.println("quanto vuoi abbassare la luminosita?");

                            ((Video) elemento).abbassaLuminosita(Integer.parseInt(scanner.nextLine()));

                            System.out.println("luminosita corrente: " + ((Video) elemento).getLuminosita());
                            break;
                        case "2":
                            System.out.println("quanto vuoi alzare la luminosita?");

                            ((Video) elemento).alzaLuminosita(Integer.parseInt(scanner.nextLine()));

                            System.out.println("luminosita corrente: " + ((Video) elemento).getLuminosita());
                            break;
                    }
                    break;
            }
        } else if (elemento instanceof Audio) {
            System.out.println("elemento selezionato: " + elemento.getTitolo());
            System.out.println("1-riproduci audio 2-cambia volume");
            String modificaAudio = scanner.nextLine();
            switch (modificaAudio) {
                case "1":
                    ((Audio) elemento).play(elemento.getDurata());
                    break;
                case "2":
                    System.out.println("volume corrente: " + ((Audio) elemento).getVolume() + "// 1-abbassa volume 2-alza volume");
                    String modificaVolume = scanner.nextLine();
                    switch (modificaVolume) {
                        case "1":
                            System.out.println("quanto vuoi abbassare il volume?");

                            ((Audio) elemento).abbassaVolume(Integer.parseInt(scanner.nextLine()));

                            System.out.println("volume corrente: " + ((Audio) elemento).getVolume());

                            break;
                        case "2":
                            System.out.println("quanto vuoi alzare il volume?");

                            ((Audio) elemento).alzaVolume(Integer.parseInt(scanner.nextLine()));

                            System.out.println("volume corrente: " + ((Audio) elemento).getVolume());

                            break;
                    }
            }


        } else if (elemento instanceof Immagine) {
            System.out.println("elemento selezionato: " + elemento.getTitolo());
            System.out.println("1-mostra immagine");
            String modificaImmagine = scanner.nextLine();
            if (modificaImmagine.equals("1")) {
                ((Immagine) elemento).show();
            }
        }
    }
}