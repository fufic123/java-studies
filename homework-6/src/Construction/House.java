package Construction;

import java.util.LinkedList;
import java.util.Queue;

public class House {
    private Queue<IPart> partsToBuild;
    private StringBuilder completedParts;

    public House() {
        partsToBuild = new LinkedList<>();
        completedParts = new StringBuilder();

        partsToBuild.add(new Basement());
        for (int i = 0; i < 4; i++) partsToBuild.add(new Wall());
        partsToBuild.add(new Door());
        for (int i = 0; i < 4; i++) partsToBuild.add(new Window());
        partsToBuild.add(new Roof());
    }

    public boolean buildNextPart() {
        if (!partsToBuild.isEmpty()) {
            IPart part = partsToBuild.poll();
            completedParts.append(part.getName()).append(" completed.\n");
            return true;
        }
        return false;
    }

    public boolean isComplete() {
        return partsToBuild.isEmpty();
    }

    public String getStatus() {
        return completedParts.toString();
    }
}