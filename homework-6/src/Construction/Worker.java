package Construction;

public class Worker implements IWorker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void work(House house) {
        if (house.buildNextPart()) {
            System.out.println(name + " built a part of the house.");
        } else {
            System.out.println(name + ": All parts are already built!");
        }
    }
}