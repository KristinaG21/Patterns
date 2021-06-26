package design.patterns.non.creational.strategy;



public class SummerSalesCalculation implements Sale{

    @Override
    public Double calculateSalesPrice(Double amount) {
        return amount-(amount* 0.25);
    }
}
