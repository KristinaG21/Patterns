package design.patterns.structural.decorator;

public class Xiaomi implements Phone{
    @Override
    public String getDescription() {
        return "Xiaomi smartphone.";
    }

    @Override
    public double getCost() {
        return 345.00;
    }
}
