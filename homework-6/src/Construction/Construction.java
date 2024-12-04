package Construction;

public class Construction {
    public static void main(String[] args) {
        House house = new House();

        Worker worker1 = new Worker("Worker 1");
        Worker worker2 = new Worker("Worker 2");
        TeamLeader teamLeader = new TeamLeader("Team Leader");

        Team team = new Team();
        team.addWorker(worker1);
        team.addWorker(worker2);
        team.addWorker(teamLeader);

        team.startWork(house);

        teamLeader.work(house);
    }
}