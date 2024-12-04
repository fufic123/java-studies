package Construction;

public class TeamLeader implements IWorker {
    private String name;

    public TeamLeader(String name) {
        this.name = name;
    }

    @Override
    public void work(House house) {
        System.out.println(name + " reporting:");
        System.out.println(house.getStatus());
    }
}