package design.patterns.structural.decorator;

public class Airpods implements Accessories{

    Phone phone;

    public Airpods(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String getDescription() {
        return phone.getDescription() + " + Apple AirPods";
    }

    @Override
    public double getCost() {
        return 88.90 + phone.getCost();
    }
}
