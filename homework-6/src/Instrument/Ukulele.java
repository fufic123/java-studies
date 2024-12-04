package Instrument;

public class Ukulele extends MusicalInstrument {
    public Ukulele() {
        super("Ukulele", "A small string instrument originating from Hawaii.");
    }

    @Override
    public void sound() {
        System.out.println("The Ukulele produces a light, cheerful sound.");
    }

    @Override
    public void history() {
        System.out.println("The Ukulele originated in Hawaii in the 19th century.");
    }
}