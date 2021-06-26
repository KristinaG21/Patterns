package design.patterns.structural.decorator;

public interface Accessories extends Phone {

    default String getDescription() {
        return null;
    }

}
