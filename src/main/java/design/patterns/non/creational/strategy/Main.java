package design.patterns.non.creational.strategy;

public class Main {
    public static void main(String[] args) {

        SalesCalculation salesCalculation =new SalesCalculation(SalesType.WINTER);
        Double salesPrice = salesCalculation.calculateSalesPrice(56.98);
        System.out.println("Winter sales price: " + salesPrice);

        SalesCalculation salesCalculation1 =new SalesCalculation(SalesType.SUMMER);
        Double salesPrice1 = salesCalculation1.calculateSalesPrice(56.98);
        System.out.println("Summer sales price: " +salesPrice1);
    }
}
