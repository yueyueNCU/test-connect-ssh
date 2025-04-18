package org.example;

public class Car {
    private final String model;
    private final int price;
    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }
    public String getModel() {
        return model;
    }
    public int getPrice() {
        return price;
    }

}
