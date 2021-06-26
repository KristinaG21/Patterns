package design.patterns.non.creational.strategy;

public class SalesCalculation {

    private Sale sale;

    public SalesCalculation(SalesType type) {
        if (type == SalesType.SUMMER) {
            this.sale = new SummerSalesCalculation();
        }
        if (type == SalesType.WINTER) {
            this.sale = new WinterSaleCalculation();
        }
    }

    public Double calculateSalesPrice(Double amount){
        return this.sale.calculateSalesPrice(amount);
    }

}
