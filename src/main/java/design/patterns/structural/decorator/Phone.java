package design.patterns.structural.decorator;

public interface Phone {


    default String getDescription() {
        return null;
    }
   double getCost();
}

