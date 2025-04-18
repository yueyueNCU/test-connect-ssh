package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateCarServiceTest {

    @Test
    void createTeslaCar_return_teslaCar() {
        CreateCarService createCarService = new CreateCarService();
        Car car = createCarService.createTeslaCar();
        assertNotNull(car);
        assertEquals("tesla", car.getModel());
    }

    @Test
    void createFordCar() {
        CreateCarService createCarService = new CreateCarService();
        Car car = createCarService.createFordCar();
        assertNotNull(car);
        assertEquals("ford", car.getModel());
    }
}