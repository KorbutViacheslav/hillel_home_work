package home_work_15.coffee.order;

public class Order {
    private int orderNumber;
    private String orderName;

    public Order(String orderName) {
        this.orderName = orderName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderName() {
        return orderName;
    }

    @Override
    public String toString() {
        return "[OrderNum: " + orderNumber +
                "|Name: " + orderName + ']';
    }
}
