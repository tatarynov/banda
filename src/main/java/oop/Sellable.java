package oop;

public interface Sellable {

     default void buy() {
          System.out.println("Offline buying: " + this.getClass().getName());
     }

}
