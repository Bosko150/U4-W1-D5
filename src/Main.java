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

/*        ElementoMultimediale video1 = new Video("video1", 2, 5, 5);
        ElementoMultimediale video2 = new Video("video2", 3, 5, 5);
        ElementoMultimediale audio1 = new Audio("audio1", 4, 5);
        ElementoMultimediale audio2 = new Audio("audio2", 5, 5);
        ElementoMultimediale immagine1 = new Immagine("immagine1", 5);

        ElementoMultimediale[] player = {video1, video2, audio1, audio2, immagine1};*/

        ElementoMultimediale[] player = new ElementoMultimediale[5];

        for (int i = 0; i < player.length; i++) {
            System.out.println("quale tipo di file vuoi inserire? (1 per video/ 2 per audio/ 3 per immagine)");
            String response = scanner.nextLine();
            switch (response) {
                case "1":
                    System.out.println("inserisci il titolo del video");
                    String titoloVideo = scanner.nextLine();

                    System.out.println("inserisci la durata del video");
                    int durataVideo = Integer.parseInt(scanner.nextLine());

                    System.out.println("inserisci il volume del video");
                    int volumeVideo = Integer.parseInt(scanner.nextLine());

                    System.out.println("inserisci la luminosita del video");
                    int luminositaVideo = Integer.parseInt(scanner.nextLine());

                    player[i] = new Video(titoloVideo, durataVideo, volumeVideo, luminositaVideo);
                    break;
                case "2":
                    System.out.println("inserisci il titolo dell'audio");
                    String titoloAudio = scanner.nextLine();
                    System.out.println("inserisci la durata dell'audio");
                    int durataAudio = Integer.parseInt(scanner.nextLine());
                    System.out.println("inserisci il volume dell'audio");
                    int volumeAudio = Integer.parseInt(scanner.nextLine());
                    player[i] = new Audio(titoloAudio, durataAudio, volumeAudio);
                    break;
                case "3":
                    System.out.println("inserisci il titolo dell'immagine");
                    String titoloImmagine = scanner.nextLine();
                    System.out.println("inserisci la luminosita dell'immagine");
                    int luminositaImmagine = Integer.parseInt(scanner.nextLine());
                    player[i] = new Immagine(titoloImmagine, luminositaImmagine);
                    break;
            }
        }


        riproduciArray(player);
    }

    public static void riproduciArray(ElementoMultimediale[] array) {
        while (true) {

            for (int i = 0; i < array.length; i++) {
                System.out.println((i + 1) + "-" + "titolo:" + array[i].getTitolo());
            }
            System.out.println("Quale elemento vuoi selezionare ? (1, 2, 3, 4, 5 o seleziona 0 per uscire)");
            String response = scanner.nextLine();
            if (response.equals("0")) {
                break;
            }
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
                    System.out.println("volume corrente: " + ((Video) elemento).getVolume() + " // 1-abbassa volume 2-alza volume");
                    String modificaVolume = scanner.nextLine();
                    switch (modificaVolume) {
                        case "1":
                            System.out.println("quanto vuoi abbassare il volume?");
                            int minvolume = Integer.parseInt(scanner.nextLine());

                            if (((Video) elemento).getVolume() > minvolume) {
                                ((Video) elemento).abbassaVolume(Integer.parseInt(scanner.nextLine()));
                                System.out.println("volume corrente: " + ((Video) elemento).getVolume());
                            } else {
                                System.out.println("Il volume non può scendere sotto lo zero, volume settato a 0");
                                ((Video) elemento).setVolume(0);
                            }
                            break;
                        case "2":
                            int maxvolume = Integer.parseInt(scanner.nextLine());

                            if (((Video) elemento).getVolume() + maxvolume <= 10) {
                                ((Video) elemento).alzaVolume(Integer.parseInt(scanner.nextLine()));
                                System.out.println("volume corrente: " + ((Video) elemento).getVolume());
                            } else {
                                System.out.println("Il volume non può salire sopra il 10, volume settato a 10");
                                ((Video) elemento).setVolume(10);
                            }
                            break;
                    }
                    break;
                case "3":
                    System.out.println("luminosita corrente: " + ((Video) elemento).getLuminosita() + " // 1-abbassa luminosita 2-alza luminosita");
                    String modificaLuminosita = scanner.nextLine();
                    switch (modificaLuminosita) {
                        case "1":
                            System.out.println("quanto vuoi abbassare la luminosita?");
                            int minluminosita = Integer.parseInt(scanner.nextLine());

                            if (((Video) elemento).getLuminosita() > minluminosita) {
                                ((Video) elemento).abbassaLuminosita(Integer.parseInt(scanner.nextLine()));
                                System.out.println("luminosita corrente: " + ((Video) elemento).getLuminosita());
                            } else {
                                System.out.println("la luminosita non può scendere sotto lo zero, luminosita settata a 0");
                                ((Video) elemento).setLuminosita(0);
                            }
                            break;
                        case "2":
                            int maxluminosita = Integer.parseInt(scanner.nextLine());

                            if (((Video) elemento).getLuminosita() + maxluminosita <= 10) {
                                ((Video) elemento).alzaLuminosita(Integer.parseInt(scanner.nextLine()));
                                System.out.println("luminosita corrente: " + ((Video) elemento).getLuminosita());
                            } else {
                                System.out.println("la luminosita non può salire sopra il 10, luminosita settata a 10");
                                ((Video) elemento).setLuminosita(10);
                            }
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
                    System.out.println("volume corrente: " + ((Audio) elemento).getVolume() + " // 1-abbassa volume 2-alza volume");
                    String modificaVolume = scanner.nextLine();
                    switch (modificaVolume) {
                        case "1":
                            System.out.println("quanto vuoi abbassare il volume?");
                            int minvolume = Integer.parseInt(scanner.nextLine());

                            if (((Audio) elemento).getVolume() > minvolume) {
                                ((Audio) elemento).abbassaVolume(Integer.parseInt(scanner.nextLine()));
                                System.out.println("volume corrente: " + ((Audio) elemento).getVolume());
                            } else {
                                System.out.println("Il volume non può scendere sotto lo zero, volume settato a 0");
                                ((Audio) elemento).setVolume(0);
                            }
                            break;


                        case "2":
                            int maxvolume = Integer.parseInt(scanner.nextLine());

                            if (((Audio) elemento).getVolume() + maxvolume <= 10) {
                                ((Audio) elemento).alzaVolume(Integer.parseInt(scanner.nextLine()));
                                System.out.println("volume corrente: " + ((Audio) elemento).getVolume());
                            } else {
                                System.out.println("Il volume non può salire sopra il 10, volume settato a 10");
                                ((Audio) elemento).setVolume(10);
                            }
                            break;
                    }
            }


        } else if (elemento instanceof Immagine) {
            System.out.println("elemento selezionato: " + elemento.getTitolo());
            System.out.println("1-mostra immagine 2-cambia luminosità");
            String modificaImmagine = scanner.nextLine();
            switch (modificaImmagine) {
                case "1":
                    ((Immagine) elemento).show();
                    break;
                case "2":
                    System.out.println("luminosita corrente: " + ((Immagine) elemento).getLuminosita() + " // 1-abbassa luminosita 2-alza luminosita");
                    String modificaLuminosita = scanner.nextLine();
                    switch (modificaLuminosita) {
                        case "1":
                            System.out.println("quanto vuoi abbassare la luminosita?");
                            int minluminosita = Integer.parseInt(scanner.nextLine());

                            if (((Immagine) elemento).getLuminosita() > minluminosita) {
                                ((Immagine) elemento).abbassaLuminosita(Integer.parseInt(scanner.nextLine()));
                                System.out.println("luminosita corrente: " + ((Immagine) elemento).getLuminosita());
                            } else {
                                System.out.println("la luminosita non può scendere sotto lo zero, luminosita settata a 0");
                                ((Immagine) elemento).setLuminosita(0);
                            }
                            break;
                        case "2":
                            int maxluminosita = Integer.parseInt(scanner.nextLine());

                            if (((Immagine) elemento).getLuminosita() + maxluminosita <= 10) {
                                ((Immagine) elemento).alzaLuminosita(Integer.parseInt(scanner.nextLine()));
                                System.out.println("luminosita corrente: " + ((Immagine) elemento).getLuminosita());
                            } else {
                                System.out.println("la luminosita non può salire sopra il 10, luminosita settata a 10");
                                ((Immagine) elemento).setLuminosita(10);
                            }
                            break;
                    }
            }
        }
    }
}