package com.rajkumarv.structural.adapter;

public class ImperialEstimate implements Estimate {
    int topSpeed;
    int efficiency;

    public ImperialEstimate(int ts, int eff){
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
