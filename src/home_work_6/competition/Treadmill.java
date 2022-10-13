package home_work_6.competition;

public class Treadmill extends Let{
    public Treadmill(int length) {
        super(length);
    }

    @Override
    void overcome() {
        System.out.println("Treadmill done.");
    }
}
