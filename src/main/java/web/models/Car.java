package web.models;

import org.springframework.stereotype.Component;

public class Car {

    private int id;
    private String model;
    private int year;


    public Car(int id, String model, int series) {
        this.id = id;
        this.model = model;
        this.year = series;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setSeries(int series) {
        this.year = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", series=" + year +
                '}';
    }
}
