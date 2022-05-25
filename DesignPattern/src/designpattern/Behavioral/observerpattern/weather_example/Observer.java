package designpattern.Behavioral.observerpattern.weather_example;

public interface Observer {

    public void update(float temp, float humidity, float pressure);
}
