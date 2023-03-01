package home_work_13.phonebook;

public class Recording {
    private String name;
    private String numberPhone;

    public String getName() {
        return name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public Recording(String name, String numberPhone) {
        this.name = name;
        this.numberPhone = numberPhone;
    }

    public String toString() {
        return "\nRecording: " +
                "\nName: [" + name +
                "] Number phone: [" + numberPhone + ']';
    }
}
