package designpattern.Creational.singleton.vidu;

public class Singleton {
    private static Singleton instance;
    int count = 0;

    private Singleton() {
    }

    public static Singleton createInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    public void increase() {
        count++;
        System.out.println("" + count);
    }
}