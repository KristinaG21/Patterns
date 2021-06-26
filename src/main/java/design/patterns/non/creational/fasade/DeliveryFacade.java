package design.patterns.non.creational.fasade;

public class DeliveryFacade {


        StandardDelivery standardDelivery;
        CourierDelivery courierDelivery;
        ExpressDelivery expressDelivery;

        enum OrderSize {
            SMALL,
            MEDIUM,
            LARGE

        }

    public DeliveryFacade(StandardDelivery standardDelivery, CourierDelivery courierDelivery, ExpressDelivery expressDelivery) {
        this.standardDelivery = standardDelivery;
        this.courierDelivery = courierDelivery;
        this.expressDelivery = expressDelivery;
    }

    public void choose (OrderInfo orderInfo, OrderSize size){
            switch (size) {
                case SMALL:
                    standardDelivery.chooseStandarDelivery(orderInfo);
                    return;

                case MEDIUM:
                    courierDelivery.chooseCourierDelivery(orderInfo);
                    return;

                case LARGE:
                    expressDelivery.chooseExpressDelivery(orderInfo);
                    standardDelivery.chooseStandarDelivery(orderInfo);
                    return;
            }
        }

}
