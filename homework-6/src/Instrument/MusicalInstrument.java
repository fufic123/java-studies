package Instrument;

public abstract class MusicalInstrument implements IInfo {
    protected String name;
    protected String description;

    public MusicalInstrument(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void show() {
        System.out.println("Instrument Name: " + name);
    }

    @Override
    public void desc() {
        System.out.println("Description: " + description);
    }
}