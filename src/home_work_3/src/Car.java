public class Car {
    public static void main(String[] args) {
        Car bmw=new Car();
        bmw.start();
    }
    public static void start(){
        startFuelSystem();
        startElectricity();
        startCommand();
    }
    private static void startElectricity(){
        System.out.println("Please start the car engine to supply electricity...");
    }
    private static void startCommand(){
        System.out.println("Please fasten your seat belt and start driving...");
    }
    private static void startFuelSystem(){
        System.out.println("Fuel supplied. Everything is ready to start the car engine...");
    }
}
