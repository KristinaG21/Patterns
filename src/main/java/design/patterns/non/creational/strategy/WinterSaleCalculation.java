package design.patterns.non.creational.strategy;

public class WinterSaleCalculation implements Sale{

    @Override
    public Double calculateSalesPrice(Double amount) {
        return amount-(amount*0.5);
    }
}
