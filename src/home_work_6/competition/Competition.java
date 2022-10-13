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
            for (int i = 0; i < let.length; i++) {
                if (participant.isOvercome()) {
                    if (let[i] instanceof Treadmill) {
                        participant.run(let[i]);
                    } else if (let[i] instanceof Wall) {
                        participant.jump(let[i]);
                    }
                }else {
                        System.out.println(participant.getName()+" Eliminated from competition!");
                        break;
                    }
                }
            }
        }
}
