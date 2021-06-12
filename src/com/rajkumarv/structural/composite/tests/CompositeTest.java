package com.rajkumarv.structural.composite.tests;

import com.rajkumarv.structural.composite.Employee;
import com.rajkumarv.structural.composite.Team;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompositeTest {

    @Test
    void compositionTest() {

        Team ide = new Team("IDE");
        Employee shibu = new Employee("Shibu", 800, "MLS");
        Employee damo = new Employee("Damo", 500, "MTS");
        shibu.AddAsset(damo);
        ide.AddAsset(shibu);


        Employee bala = new Employee("Bala", 800, "MLS");
        Employee vig = new Employee("Vig", 500, "MTS");
        Employee baradan = new Employee("Baradan", 500, "MTS");
        bala.AddAsset(vig);
        bala.AddAsset(baradan);
        Team runtime = new Team("Runtime");
        runtime.AddAsset(bala);

        Team books = new Team("Books");
        Employee suresh = new Employee("Suresh", 1000, "TA");
        books.AddAsset(suresh);
        books.AddAsset(runtime);
        books.AddAsset(ide);

        assertEquals(books.getCost(), 4100);
    }
}