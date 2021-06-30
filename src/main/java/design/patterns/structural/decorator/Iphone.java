package design.patterns.structural.decorator;

import lombok.Data;

@Data
public class Iphone implements Phone{

    @Override
    public void getDescription() {

        System.out.println("Iphone smartphone made by Apple");
    }

}
