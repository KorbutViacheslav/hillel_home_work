package home_work_6.competition;

public abstract class Let {
    private int length;

    public Let(int length) {
        this.length=length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    abstract void overcome();
}
