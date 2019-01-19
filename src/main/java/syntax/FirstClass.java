package syntax;

public class FirstClass {

    public FirstClass(String name) {
        this.name = name;
    }

    public FirstClass(String name, boolean isTrue) {
        this.name = name;
        if (isTrue) {
            // action 1
        } else {
            // action 2
        }
    }

    public FirstClass() {
        // silence
    }

    private String name;
    public static String staticVar = "I'm static variable";

    public static void staticMethod() {
        System.out.println("I'm static method");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
