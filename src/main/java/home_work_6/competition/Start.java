package home_work_6.competition;

public class Start {
    public static void main(String[] args) {
        Let[] let = {new Wall(2), new Wall(3), new Treadmill(200), new Treadmill(700)};
        Participant[] participants = {new Cat("Barsik", 199, 4), new Human("Viacheslav", 600, 5), new Robot("Bender", 5000, 10)};
        Competition competition = new Competition(participants, let);
        competition.start();
    }
}
