package design.patterns.creational.builder;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Delivery.Builder builder = new Delivery.Builder();
        Delivery delivery = builder
                .setName("IPhone 125G")
                .setType(TypeOfDelivery.EXPRESS)
                .setPrice(BigDecimal.valueOf(768.99))
                .setDelivery("12.08.2021")
                .build();

        System.out.println(delivery);
    }
}
