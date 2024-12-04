package Instrument;

public class Instrument {
    public static void main(String[] args) {
        IInfo violin = new Violin();
        IInfo trombone = new Trombone();
        IInfo ukulele = new Ukulele();
        IInfo cello = new Cello();

        IInfo[] instruments = {violin, trombone, ukulele, cello};

        for (IInfo instrument : instruments) {
            instrument.show();
            instrument.sound();
            instrument.desc();
            instrument.history();
            System.out.println();
        }
    }
}