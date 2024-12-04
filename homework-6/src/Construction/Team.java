package Construction;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<IWorker> workers;

    public Team() {
        workers = new ArrayList<>();
    }

    public void addWorker(IWorker worker) {
        workers.add(worker);
    }

    public void startWork(House house) {
        while (!house.isComplete()) {
            for (IWorker worker : workers) {
                worker.work(house);
            }
        }
        System.out.println("House construction is complete!");
    }
}