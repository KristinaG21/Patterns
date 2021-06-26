package design.patterns.non.creational.composite;

import lombok.Data;


@Data
public class SingleOrder implements Order {
   String id;
   double price;
   String address;

    public SingleOrder(String id, double price, String address) {
        this.id = id;
        this.price = price;
        this.address = address;
    }


    @Override
    public void printOrderDetails() {
        System.out.println("Single order id:"+id +" "+ "price:" +price+" " + "address:"+ address);
    }

}
