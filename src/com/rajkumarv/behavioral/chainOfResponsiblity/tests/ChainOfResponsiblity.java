package com.rajkumarv.behavioral.chainOfResponsiblity.tests;

import com.rajkumarv.behavioral.chainOfResponsiblity.Cube;
import com.rajkumarv.behavioral.chainOfResponsiblity.Handler;
import com.rajkumarv.behavioral.chainOfResponsiblity.Square;

import static org.junit.jupiter.api.Assertions.*;

class ChainOfResponsibilityTest {

    @org.junit.jupiter.api.Test
    void simpleSequence(){

        Handler sq = new Square();
        Handler cube = new Cube();

        sq.setNext(cube);

        assertEquals(sq.process(2), 64);
    }

}