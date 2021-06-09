package com.rajkumarv.structural.adapter.tests;

import com.rajkumarv.structural.adapter.Estimate;
import com.rajkumarv.structural.adapter.ImperialEstimate;
import com.rajkumarv.structural.adapter.MetricEstimate;
import com.rajkumarv.structural.adapter.MetricEstimateAdapter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MetricEstimateAdapterTest {

    // hypothetically a good car should top above 100kmph & average 10kmpl
    boolean isGoodCar(Estimate est){
        return est.getTopSpeed() >= 100 && est.getEfficiency() >= 10;
    }

    @Test
    void testCorvette() {
        Estimate corvette = new ImperialEstimate(194, 19);
        corvette = new MetricEstimateAdapter((ImperialEstimate) corvette);
        assertFalse(isGoodCar(corvette));
    }

    @Test
    void getCorolla() {
        Estimate corolla = new ImperialEstimate(112, 52);
        corolla = new MetricEstimateAdapter((ImperialEstimate) corolla);
        assertTrue(isGoodCar(corolla));
    }
}