package com.rajkumarv.structural.flyweight;


import java.util.Objects;
import java.util.Random;

public class Engine {
    private String name;

    public Engine(String name) {
        Random rand = new Random();
        this.name = name + "-" +rand.nextInt(10);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        return Objects.equals(name, ((Engine) o).name);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                '}';
    }
}
