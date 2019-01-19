package oop;

public class EBook extends InfoStorage implements Sellable {

    @Override
    public void buy() {
        System.out.println("Online buying: " + this.getClass().getName());
    }
}
