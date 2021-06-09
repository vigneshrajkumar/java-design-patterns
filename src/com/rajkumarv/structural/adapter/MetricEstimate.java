package com.rajkumarv.structural.adapter;

public class MetricEstimate implements Estimate {

    int topSpeed;
    int efficiency;

    public MetricEstimate(int ts, int eff){
        topSpeed = ts;
        efficiency = eff;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public int getTopSpeed() {
        return topSpeed;
    }
}
