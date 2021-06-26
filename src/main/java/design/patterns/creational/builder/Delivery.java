package design.patterns.creational.builder;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Delivery {

    public String productName;
    public TypeOfDelivery type;
    public BigDecimal price;
    public String dateOfDelivery;

}
