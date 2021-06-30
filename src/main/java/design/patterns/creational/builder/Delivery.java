package design.patterns.creational.builder;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class Delivery {
    private String productName;
    private TypeOfDelivery type;
    private BigDecimal price;
    private String dateOfDelivery;

    public Delivery(String productName, TypeOfDelivery type, BigDecimal price, String dateOfDelivery) {
        this.productName = productName;
        this.type = type;
        this.price = price;
        this.dateOfDelivery = dateOfDelivery;
    }

    public static class Builder {

        public String productName;
        public TypeOfDelivery type;
        public BigDecimal price;
        public String dateOfDelivery;

        public Builder setName(String productName) {
            this.productName = productName;
            return this;
        }
        public Builder setType(TypeOfDelivery type) {
            this.type = type;
            return this;

        }
        public Builder setPrice(BigDecimal price) {
            this.price = price;
            return this;

        }
        public Builder setDelivery(String dateOfDelivery) {
            this.dateOfDelivery = dateOfDelivery;
            return this;
        }

        public Delivery build(){
            return new Delivery(productName,type,price,dateOfDelivery);
        }
    }

}
