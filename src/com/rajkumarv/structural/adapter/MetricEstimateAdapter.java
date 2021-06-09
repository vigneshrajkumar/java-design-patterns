package com.rajkumarv.structural.adapter;

import com.rajkumarv.structural.adapter.ImperialEstimate;

public class MetricEstimateAdapter implements Estimate  {
    ImperialEstimate estimate;
    public MetricEstimateAdapter(ImperialEstimate es){
        estimate = es;
    }

    @Override
    public int getTopSpeed() {
        return (int) (estimate.topSpeed * 1.60934);
    }

    @Override
    public int getEfficiency() {
        return (int) (estimate.getEfficiency() *  0.43);
    }
}
