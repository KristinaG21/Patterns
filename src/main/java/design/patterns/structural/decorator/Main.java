package design.patterns.structural.decorator;

public class Main {

    public static void main(String[] args) {
        Phone phone = new Iphone();

        Phone phone1 = new Samsung();
        Phone phone2 = new Accessory(phone1);

        Phone phone3 = new Iphone();
        Phone phone4 = new Accessory(phone3);

        System.out.println("Phone without Accessory : ");
         phone.getDescription();
        System.out.println("-------------");

        System.out.println("Phone with Accessory : ");
        phone1.getDescription();
        System.out.println("-------------");

        System.out.println("Phone with Accessory : ");
        phone3.getDescription();
        System.out.println("-------------");


    }
}
