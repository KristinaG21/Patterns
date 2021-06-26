package design.patterns.behavioral.template;

import lombok.Data;

@Data
public class Hardware implements Bonus {
    String name;
    double price;
    Color color;
    int count;

    @Override
    public String addDiscount() {
        if(count>2 && price> 700.00){
            return price*0.15 +"£";
        }else{
            return 0.0 + "£";
        }

    }

    @Override
    public boolean addAccessory(){
        return color.equals(Color.WHITE);
    }

    @Override
    public boolean freeDelivery() {
        return count > 1;
    }
}
