package NewFeaturesInJava8.stream.streammap;

import java.util.stream.Stream;

public class Car {
    private String number;
    private int year;

    public String getNumber() {
        return number;
    }

    public int getYear() {
        return year;
    }

    public Car(String number, int year) {
        this.number = number;
        this.year = year;
    }
}
