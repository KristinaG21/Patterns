package design.patterns.structural.decorator;

public class Iphone implements Phone{

    @Override
    public String getDescription() {
        return "Iphone smartphone made by Apple";
    }

    @Override
    public double getCost() {
        return 756.68;
    }
}
