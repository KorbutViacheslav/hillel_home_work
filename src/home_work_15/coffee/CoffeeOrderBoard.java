package home_work_15.coffee;

import home_work_15.coffee.order.Order;

import java.util.LinkedList;
import java.util.Queue;

public class CoffeeOrderBoard {
    private int countNumberOrder = 1;
    private Queue<Order> orderList = new LinkedList<>();

    public void add(Order order) {
        order.setOrderNumber(countNumberOrder++);
        orderList.add(order);
        System.out.println("New order! - Num: "
                + order.getOrderNumber()
                + "|Name: "
                + order.getOrderName());
    }

    public void deliver() {
        System.out.println("Order: "
                + orderList.poll()
                + " is done!");
    }

    public void deliver(int orderNumber) {
        System.out.println("Order [Num: "
                + search(orderNumber).getOrderNumber()
                + "|Name: " + search(orderNumber).getOrderName()
                + "] is ready earlier!");
        orderList.remove(search(orderNumber));
    }

    public void draw() {
        System.out.println("ALL ORDERS: " + orderList);
    }

    private Order search(int a) {
        Order order = null;
        for (Order o : orderList) {
            if (o.getOrderNumber() == a) {
                order = o;
            }
        }
        return order;
    }
}
