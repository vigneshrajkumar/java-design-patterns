package com.rajkumarv.structural.flyweight.tests;

import com.rajkumarv.structural.flyweight.Car;
import com.rajkumarv.structural.flyweight.CarFactory;
import com.rajkumarv.structural.flyweight.Engine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTest {

    @Test
    void generateCars() {

        CarFactory cf = new CarFactory();
        Car mercedes = cf.getCar("mercedes");
        Engine merdedesEngine = mercedes.getEngine();

        // all the below cars will be sharing the same engine
        Car mclaren = cf.getCar("mclaren");
        assertEquals(mclaren.getEngine(), merdedesEngine);
        Car williams = cf.getCar("williams");
        assertEquals(williams.getEngine(), merdedesEngine);
        Car astonMartin = cf.getCar("aston martin");
        assertEquals(astonMartin.getEngine(), merdedesEngine);

    }
}