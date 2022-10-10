public class Employee {
    private String fullName;
    private String jobTitle;
    private String email;
    private String phoneNumber;
    private int age;
    public Employee( String fullName, String jobTitle,String email,String phoneNumber, int age){
        this.fullName=fullName;
        this.jobTitle=jobTitle;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.age=age;
    }
    public Employee(){
        this.fullName="Some name";
        this.jobTitle="Some job title";
        this.email="someemail@gmail.com";
        this.phoneNumber="+380630000000";
        this.age=18;
    }
    public static void main(String[] args) {
        Employee viacheslav = new Employee("Korbut Viacheslav",
                                            "Engineer","minowaman777@gmail.com",
                                            "+380630517137",31);
        Employee someEmployee =new Employee();
        System.out.println(viacheslav);
        System.out.println(someEmployee);
    }
    public String toString(){
        return "Full name: "+fullName+"\nJob title: "+jobTitle+
                "\nemail: "+email+"\nPhone number: "+phoneNumber+"\nAge: "+age;
    }
}