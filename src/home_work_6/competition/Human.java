package home_work_6.competition;

public class Human extends Participant{
    private boolean overcome=true;

    @Override
    public boolean isOvercome() {
        return overcome;
    }

    @Override
    public void setOvercome(boolean overcome) {
        this.overcome = overcome;
    }

    public Human(String name, double maxrun, double maxjump) {
        super(name, maxrun, maxjump);
    }
}

