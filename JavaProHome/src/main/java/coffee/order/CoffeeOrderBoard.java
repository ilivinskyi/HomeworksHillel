package coffee.order;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CoffeeOrderBoard {

    private List<Order> orders = new LinkedList<>();
    private int lastOrderNumber = 0;

    public Order add(String customerName) {
        Order newOrder = new Order(++lastOrderNumber, customerName);
        orders.add(newOrder);
        System.out.println(
                "Order #" +
                        newOrder.getOrderNumber() +
                        " for " +
                        newOrder.getCustomerName() +
                        " added"
        );
        return newOrder;
    }

    public Order deliver() {
        if (orders.isEmpty()) {
            System.out.println("Order board is empty");
            return null;
        }
        var deliveredOrder = orders.removeFirst();
        System.out.println(
                "Order #" + deliveredOrder.getOrderNumber() + " delivered"
        );
        return deliveredOrder;
    }

    public Order deliver(int orderNumber) {
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getOrderNumber() == orderNumber) {
                iterator.remove();
                System.out.println(
                        "Order #" + order.getOrderNumber() + " delivered"
                );
                return order;
            }
        }
        return null;
    }

    public void draw() {
        System.out.println("=============");
        System.out.println("Num | Name");
        for (Order order : orders) {
            System.out.println(
                    order.getOrderNumber() + " | " + order.getCustomerName()
            );
        }
        System.out.println("=============");
    }
}
