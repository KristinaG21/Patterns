package design.patterns.structural.decorator;

public abstract class PhoneDecorator implements Phone{

    protected Phone decoratePhone;

    public PhoneDecorator(Phone phone){
        this.decoratePhone = phone;
    }
    public void getDescription() {
        decoratePhone.getDescription();
    }

}
