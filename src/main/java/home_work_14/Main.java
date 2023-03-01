package home_work_14;

public class Main {
    public static void main(String[] args) {
        FileData homeWork = new FileData("HomeWork", 20, "D:\\JAVA\\projekt");
        FileData homeWork2 = new FileData("HomeWork2", 30, "D:\\JAVA\\projekt");
        FileData homeWork5 = new FileData("HomeWork2", 70, "D:\\JAVA\\projekt");
        FileData homeWork3 = new FileData("HomeWork3", 40, "D:\\JAVA\\projekt");
        FileData homeWork4 = new FileData("HomeWork3", 15, "D:\\JAVA\\projekt");
        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add("D:\\JAVA\\projekt", homeWork);
        fileNavigator.add("D:\\JAVA\\projekt", homeWork2);
        fileNavigator.add("D:\\JAVA\\projekt", homeWork3);
        fileNavigator.add("D:\\JAVA\\projekt", homeWork5);
        //fileNavigator.add("D:\\JAVA\\proGekt", homeWork4);
        System.out.println(fileNavigator.find("D:\\JAVA\\projekt"));
        System.out.println(fileNavigator.filterBySize(20));
        System.out.println(fileNavigator.sortBySize());
        fileNavigator.remove("D:\\JAVA\\projekt");
        System.out.println(fileNavigator.find("D:\\JAVA\\projekt"));
    }
}
