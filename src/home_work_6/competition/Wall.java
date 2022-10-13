package home_work_6.competition;

public class Wall extends Let{
    public Wall(int length) {
        super(length);
    }

    @Override
    void overcome() {
        System.out.println("Wall done.");
    }
}
