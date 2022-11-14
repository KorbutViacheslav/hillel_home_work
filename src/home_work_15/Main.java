package home_work_15;

import home_work_15.coffee.CoffeeOrderBoard;
import home_work_15.coffee.order.Order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add(new Order("Valera"));
        coffeeOrderBoard.add(new Order("Alina"));
        coffeeOrderBoard.add(new Order("Slava"));
        coffeeOrderBoard.add(new Order("Kristina"));

        coffeeOrderBoard.draw();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.draw();
        coffeeOrderBoard.add(new Order("Sonya"));
        coffeeOrderBoard.draw();
        coffeeOrderBoard.deliver(3);
        coffeeOrderBoard.draw();
        coffeeOrderBoard.add(new Order("Den"));
    }
}
