package home_work_6.competition;

public class Cat extends Participant {
    private boolean overcome=true;

    @Override
    public boolean isOvercome() {
        return overcome;
    }

    @Override
    public void setOvercome(boolean overcome) {
        this.overcome = overcome;
    }

    public Cat(String name, double maxrun, double maxjump) {
        super(name, maxrun, maxjump);
    }
}
