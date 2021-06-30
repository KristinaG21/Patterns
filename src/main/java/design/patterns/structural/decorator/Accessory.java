package design.patterns.structural.decorator;

public class Accessory extends PhoneDecorator{


    public Accessory(Phone phone) {
        super(phone);
    }

    private void setAccessory(Phone decoratePhone){
        System.out.println("With Accessory");
    }
    public void getDescription(Phone decoratePhone) {
        setAccessory(decoratePhone);
   decoratePhone.getDescription();
    }

}
