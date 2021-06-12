package com.rajkumarv.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Asset{

    private String name;
    private Integer cost;
    private String designation;
    private List<Asset> employees;


    public Employee(String name, Integer cost, String designation) {
        this.name = name;
        this.cost = cost;
        this.designation = designation;
        employees = new ArrayList<>();
    }

    public String getDesignation() {
        return designation;
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

        return cost + sum;
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
        return "Employee{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", designation='" + designation + '\'' +
                ", employees=" + employees +
                '}';
    }
}
