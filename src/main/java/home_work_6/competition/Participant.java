package home_work_6.competition;

public abstract class Participant {
    private String name;
    private double maxrun;
    private double maxjump;
    private boolean overcome = true;

    public Participant(String name, double maxrun, double maxjump) {
        this.name = name;
        this.maxrun = maxrun;
        this.maxjump = maxjump;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxrun() {
        return maxrun;
    }

    public void setMaxrun(double maxrun) {
        this.maxrun = maxrun;
    }

    public double getMaxjump() {
        return maxjump;
    }

    public void setMaxjump(double maxjump) {
        this.maxjump = maxjump;
    }

    public boolean isOvercome() {
        return overcome;
    }

    public void setOvercome(boolean overcome) {
        this.overcome = overcome;
    }

    public void jump(Let let) {
        if (let.getLength() < getMaxjump()) {
            System.out.println(getName() + " overcame " + let.getClass().getSimpleName()
                    + " on the length " + let.getLength() + " meters!");
        } else {
            setOvercome(false);
            System.out.println(getName() + " DON'T over " + let.getClass().getSimpleName()
                    + " on the length " + let.getLength() + " meters!");
        }
    }

    public void run(Let let) {
        if (let.getLength() < getMaxrun()) {
            System.out.println(getName() + " overcame " + let.getClass().getSimpleName()
                    + " on the length " + let.getLength() + " meters!");
        } else {
            setOvercome(false);
            System.out.println(getName() + " DON'T over " + let.getClass().getSimpleName()
                    + " on the length " + let.getLength() + " meters!");
        }
    }

}
