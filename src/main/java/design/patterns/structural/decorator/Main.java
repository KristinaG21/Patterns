package design.patterns.structural.decorator;

public class Main {

    public static void main(String[] args) {
        Phone phone = new Iphone();
        System.out.println("Description: " + phone.getDescription() + ", " + "Cost: " + phone.getCost());

        Phone phone1 = new Iphone();
        phone1 = new Airpods(phone1);
        System.out.println("Description: " + phone1.getDescription() +  ", " + "Cost: " + phone1.getCost());

        Phone phone2 = new Samsung();
        System.out.println("Description: " + phone2.getDescription() + ", " + "Cost: " + phone2.getCost());

        Phone phone3 = new Samsung();
        phone3 = new Cover(phone3);
        System.out.println("Description: " + phone3.getDescription() +  ", " + "Cost: " + phone3.getCost());

    }
}
