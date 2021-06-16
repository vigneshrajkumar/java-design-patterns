package com.rajkumarv.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {

    private Map<String, Engine> engineCache;

    public CarFactory() {
        this.engineCache = new HashMap<>();
    }

    private String getEngineSpec(String team) {
        switch (team) {
            case "mercedes":
            case "mclaren":
            case "williams":
            case "aston martin":
                return "mercedes";
            case "redbull":
            case "alphatauri":
                return "honda";
            case "ferrari":
            case "alfa romeo":
            case "haas":
                return "ferrari";
            case "alpine":
                return "renault";
        }
        return null;
    }

    public Car getCar(String team) {
        String spec = getEngineSpec(team);
        Engine powerTrain = engineCache.get(spec);

        if (powerTrain == null) {
            powerTrain = new Engine(spec);
            engineCache.put(spec, powerTrain);
        }
        return new Car(team, powerTrain);

    }
}
