package home_work_3;

public class Car {
    public void start(){
        startFuelSystem();
        startElectricity();
        startCommand();
    }
    private void startElectricity(){
        System.out.println("Please start the car engine to supply electricity...");
    }
    private void startCommand(){
        System.out.println("Please fasten your seat belt and start driving...");
    }
    private void startFuelSystem(){
        System.out.println("Fuel supplied. Everything is ready to start the car engine...");
    }
}
