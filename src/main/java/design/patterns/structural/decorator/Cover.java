package design.patterns.structural.decorator;

public class Cover implements Phone {

    Phone phone;

    public Cover(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String getDescription() {
        return phone.getDescription() + " + Cover";
    }

    @Override
    public double getCost() {
        return 23.00 + phone.getCost();
    }
}
