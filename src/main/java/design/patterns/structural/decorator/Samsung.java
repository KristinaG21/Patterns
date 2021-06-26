package design.patterns.structural.decorator;

public class Samsung implements Phone{
    @Override
    public String getDescription() {
        return "Samsung Galaxy Phone";
    }

    @Override
    public double getCost() {
        return 559.90;
    }
}
