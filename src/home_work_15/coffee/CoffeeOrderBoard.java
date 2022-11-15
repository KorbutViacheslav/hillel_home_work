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

    public Order deliver() {
        System.out.println(orderList.element() + " is done!");
        return orderList.poll();
    }

    public Order deliver(int orderNumber) {
        Order o = search(orderNumber);
        System.out.println(o + " is ready earlier!");
        orderList.remove(o);
        return o;
    }

    public void draw() {
        System.out.println("ALL ORDERS: " + orderList);
    }

    private Order search(int a) {
        Order order = null;
        for (Order o : orderList) {
            if (o.getOrderNumber() == a) {
                order = o;
                break;
            }
        }
        return order;
    }
}
