package design.patterns.creational.builder;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

            Delivery delivery = Delivery.builder()
                    .productName("IPhone 125G")
                    .type(TypeOfDelivery.EXPRESS)
                    .price(BigDecimal.valueOf(768.99))
                    .dateOfDelivery("12.08.2021")
                    .build();

            System.out.println(delivery);
    }
    }
