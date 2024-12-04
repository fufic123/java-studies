package Instrument;

public class Trombone extends MusicalInstrument {
    public Trombone() {
        super("Trombone", "A brass instrument with a sliding mechanism.");
    }

    @Override
    public void sound() {
        System.out.println("The Trombone produces a deep, powerful sound.");
    }

    @Override
    public void history() {
        System.out.println("The Trombone was first used in the 15th century.");
    }
}