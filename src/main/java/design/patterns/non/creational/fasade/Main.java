package design.patterns.non.creational.fasade;

public class Main {
    public static void main(String[] args) {

        StandardDelivery standardDelivery = new StandardDelivery();
        CourierDelivery courierDelivery =new CourierDelivery();
        ExpressDelivery expressDelivery =new ExpressDelivery();
        DeliveryFacade deliveryFacade = new DeliveryFacade(standardDelivery,courierDelivery,expressDelivery);

        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setDestination("London");
        orderInfo.setFromDate("12.06.2021");
        orderInfo.setToDate("16.06.2021");
        PersonInfo personInfo = new PersonInfo();
        personInfo.setName("Janis");
        personInfo.setAddress("Oxford street");
        orderInfo.setList(personInfo);
        deliveryFacade.choose(orderInfo, DeliveryFacade.OrderSize.MEDIUM);

        deliveryFacade.choose(orderInfo, DeliveryFacade.OrderSize.SMALL);


    }
}
