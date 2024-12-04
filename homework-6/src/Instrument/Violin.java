package Instrument;

public class Violin extends MusicalInstrument {
    public Violin() {
        super("Violin", "A string instrument played with a bow.");
    }

    @Override
    public void sound() {
        System.out.println("The Violin produces a melodious sound.");
    }

    @Override
    public void history() {
        System.out.println("The Violin originated in 16th-century Italy.");
    }
}