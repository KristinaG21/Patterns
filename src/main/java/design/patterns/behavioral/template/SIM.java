package design.patterns.behavioral.template;

import lombok.Data;

@Data
public class SIM implements Bonus {

    String name;
    double price;
    int count;


    @Override
    public String addDiscount() {
        if(count>0 && price> 50.00){
            return price*0.10 + "£";
        }else{
            return 0.0 + "£";
        }

    }

    @Override
    public boolean addAccessory() {
        System.out.println("Accessories are not available for SIM's: ");
        return false;
    }

    @Override
    public boolean freeDelivery() {
        return price>55.00;
    }
}
