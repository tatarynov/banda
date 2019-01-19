package homework;

public class Cat {

    // name, age, weight, isHungry
    private String name;
    private short age;
    private float weight;
    private boolean isHungry;

    public Cat(String name, short age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }
}
