package uaslp.ingenieria.exams;

import uaslp.ingenieria.exams.instruments.Instrumento;
import uaslp.ingenieria.exams.instruments.Piano;
import uaslp.ingenieria.exams.instruments.PlayInstruments;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        String fileName = "archivo.music"; //args[0];
        Instrumento instrumento = Instrumento.valueOf("PIANO");  //args[1]

        SongPlayer songPlayer = new SongPlayer();
        Song song = new Song(new File(fileName));

        PlayInstruments playInstruments = new Piano();

        songPlayer.play(song, playInstruments);

    }
}
