package design.patterns.non.creational.iterator;

import design.patterns.non.creational.composite.MultipleOrder;

import java.util.ArrayList;
import java.util.List;

public class Delivery {

    List<MultipleOrder> orderList = new ArrayList<>();

    public Delivery() {

    }


    public void addItem(MultipleOrder multipleOrder) {
        orderList.add(multipleOrder);
    }
    public Iterator<MultipleOrder> iterator() {
        return new MultipleOrderIterator();
    }
    public class MultipleOrderIterator implements Iterator<MultipleOrder> {


        private int index = 0;

        @Override
        public boolean hasNext() {
            if (index >= orderList.size()) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public MultipleOrder next() {
            return orderList.get(index++);
        }

        @Override
        public void remove() {
            orderList.remove(--index);
        }
    }

}
