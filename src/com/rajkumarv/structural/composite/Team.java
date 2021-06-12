package com.rajkumarv.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Asset {
    private String name;
    private List<Asset> employees;

    public Team(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getCost() {
        Integer sum = 0;
        for (Asset a: employees)
            sum += a.getCost();
        return sum;
    }

    @Override
    public void AddAsset(Asset a) {
        employees.add(a);
    }

    @Override
    public void RemoveAsset(Asset a) {
        employees.remove(a);
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
