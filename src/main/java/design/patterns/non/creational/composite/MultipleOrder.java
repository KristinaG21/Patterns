package design.patterns.non.creational.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MultipleOrder implements Order  {

    private List<Order> orderList = new ArrayList<Order>();

    @Override
    public void printOrderDetails() {
        System.out.println("Multiple order has: ");
        for (Order order : orderList) {
            order.printOrderDetails();
        }
    }
        public void addOrder(Order order){
            orderList.add(order);
        }

    }

