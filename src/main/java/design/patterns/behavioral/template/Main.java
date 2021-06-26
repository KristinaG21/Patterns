package design.patterns.behavioral.template;

public class Main {
    public static void main(String[] args) {
        Hardware hardware = new Hardware();
        hardware.setColor(Color.BLACK);
        hardware.setName("Iphone10");
        hardware.setCount(2);
        hardware.setPrice(760.00);

        SIM sim = new SIM();
        sim.setName("Samsung 12GB");
        sim.setPrice(90.00);
        sim.setCount(1);

        System.out.println("Accessory is available for this hardware: " +hardware.addAccessory());
        System.out.println("Amount of discount: "+hardware.addDiscount());
        System.out.println("FREE Delivery: " +hardware.freeDelivery());

        System.out.println("--------------------------------------");

        System.out.println(sim.addAccessory());
        System.out.println("Amount of discount: "+sim.addDiscount());
        System.out.println("FREE Delivery: " +sim.freeDelivery());


    }
    }
