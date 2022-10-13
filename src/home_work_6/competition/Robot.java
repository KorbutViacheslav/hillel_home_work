package home_work_6.competition;

public class Robot extends Participant{
    @Override
    public boolean isOvercome() {
        return overcome;
    }

    @Override
    public void setOvercome(boolean overcome) {
        this.overcome = overcome;
    }

    private boolean overcome=true;
    public Robot(String name, double maxrun, double maxjump) {
        super(name, maxrun, maxjump);
    }
}
