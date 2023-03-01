package home_work_6.competition;

public class Competition {
    private final Participant[] participants;
    private final Let[] let;

    public Competition(Participant[] participants, Let[] let) {
        this.participants = participants;
        this.let = let;
    }

    public void start() {
        for (Participant participant : participants) {
            for (Let lets : let) {
                if (participant.isOvercome()) {
                    if (lets instanceof Treadmill) {
                        participant.run(lets);
                    } else if (lets instanceof Wall) {
                        participant.jump(lets);
                    }
                } else {
                    System.out.println(participant.getName() + " Eliminated from competition!");
                    break;
                }
            }
        }
    }
}
