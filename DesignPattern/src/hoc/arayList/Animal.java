package hoc.arayList;

public class Animal {

    protected String name;
    protected int age;
    private float weight;

    protected void saySomething() {
        System.out.println("Bla bla bla...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void eat() {

    }

    public void move() {
        System.out.println("Animal is moving...");
    }

    public void sleep() {

    }
}