package design.patterns.non.creational;

import design.patterns.non.creational.composite.MultipleOrder;
import design.patterns.non.creational.composite.SingleOrder;
import design.patterns.non.creational.iterator.Delivery;
import design.patterns.non.creational.iterator.Iterator;

public class Main {

    public static void main(String[] args) {
        SingleOrder singleOrder = new SingleOrder("1234", 142.56, "Vienibas gatve 123-6");
        SingleOrder singleOrder1 = new SingleOrder("5634", 12.56, "Jurmalas gatve 13-6");
        SingleOrder singleOrder2 = new SingleOrder("44534", 489.56, "Brivibas gatve 67");


        MultipleOrder multipleOrder = new MultipleOrder();
        multipleOrder.addOrder(singleOrder);
        multipleOrder.addOrder(singleOrder1);
        multipleOrder.printOrderDetails();

        MultipleOrder multipleOrder1 = new MultipleOrder();
        multipleOrder1.addOrder(singleOrder2);

        Delivery delivery = new Delivery();
        delivery.addItem(multipleOrder);
        delivery.addItem(multipleOrder1);

        System.out.println("Displaying MultipleOrder:");
        Iterator<MultipleOrder> iterator = delivery.iterator();
        while (iterator.hasNext()) {
            MultipleOrder sOrder = iterator.next();
            System.out.println(sOrder);
        }
        System.out.println("\nRemoving last item returned");
        iterator.remove();

        System.out.println("\nDisplaying MultipleOrder:");
        iterator = delivery.iterator();
        while (iterator.hasNext()) {
            MultipleOrder sOrder = iterator.next();
            System.out.println(sOrder);
        }

    }


}

