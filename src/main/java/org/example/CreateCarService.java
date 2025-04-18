package org.example;

public class CreateCarService {
    public Car createTeslaCar(){
        return new Car("tesla",20000);
    }
    public Car createFordCar(){
        return new Car("ford",20000);
    }
}
