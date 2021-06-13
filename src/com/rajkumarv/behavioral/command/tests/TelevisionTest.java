package com.rajkumarv.behavioral.command.tests;

import com.rajkumarv.behavioral.command.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {

    @Test
    void braviaHandling() {

        Television tv1 = new Bravia();

        assertFalse(tv1.getPowerState());

        Command toggle = new TogglePower(tv1);
        toggle.execute();

        assertTrue(tv1.getPowerState());

        Command volUp = new VolumeUp(tv1);
        for (int ix = 0; ix < 4; ix++) {
            volUp.execute();
        }
        assertEquals(5, tv1.getVolume());

        Command volDown = new VolumeDown(tv1);
        for (int ix = 0; ix < 6; ix++) {
            volDown.execute();
        }
        assertEquals(0, tv1.getVolume());

        toggle.execute();
        assertFalse(tv1.getPowerState());

    }
}