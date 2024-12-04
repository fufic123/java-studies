interface IInfo {
    void sound();
    void show();
    void desc();
    void history();
}

class MusicalInstrument implements IInfo {
    protected String name;

    public MusicalInstrument(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println(name + " makes a sound.");
    }

    @Override
    public void show() {
        System.out.println("Instrument Name: " + name);
    }

    @Override
    public void desc() {
        System.out.println(name + " is a beautiful musical instrument.");
    }

    @Override
    public void history() {
        System.out.println("History of " + name + " goes back centuries.");
    }
}

class Violin extends MusicalInstrument {
    public Violin() {
        super("Violin");
    }
}

class Trombone extends MusicalInstrument {
    public Trombone() {
        super("Trombone");
    }
}

class Ukulele extends MusicalInstrument {
    public Ukulele() {
        super("Ukulele");
    }
}

class Cello extends MusicalInstrument {
    public Cello() {
        super("Cello");
    }
}
