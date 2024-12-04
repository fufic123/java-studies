package Instrument;

public class Cello extends MusicalInstrument {
    public Cello() {
        super("Cello", "A large string instrument played while seated.");
    }

    @Override
    public void sound() {
        System.out.println("The Cello produces a rich, deep sound.");
    }

    @Override
    public void history() {
        System.out.println("The Cello was developed in the 16th century in Italy.");
    }
}