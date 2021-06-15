package com.rajkumarv.creational.builder.tests;

import com.rajkumarv.creational.builder.Phone;
import com.rajkumarv.creational.builder.PhoneBuilder;
import com.rajkumarv.creational.builder.SamsungBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SamsungBuilderTest {

    @Test
    void buildS9() {

        PhoneBuilder samsung = new SamsungBuilder();
        samsung.addBluetooth();
        samsung.addInternalStorage(256);
        Phone s9 = samsung.build();

        assertEquals(true, s9.getHasBluetooth());
        assertEquals(false, s9.getHasExpandableStorage());
        assertEquals(256, s9.getInternalStorage());

    }
}