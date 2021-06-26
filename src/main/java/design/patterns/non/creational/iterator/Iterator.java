package design.patterns.non.creational.iterator;

import design.patterns.non.creational.composite.MultipleOrder;


public interface Iterator<S> {

    boolean hasNext();

   MultipleOrder next();

    void remove();
}
