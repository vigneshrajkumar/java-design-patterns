package com.rajkumarv.creational.prototype.tests;

import com.rajkumarv.creational.prototype.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrototypeTest {

    @Test
    void testPerson() {
        Person vig = new Person("vignesh rajkumar");
        try{
            Person clone = vig.clone();
            assertEquals(vig.getName(), clone.getName());
        }catch (CloneNotSupportedException ex){
            fail();
        }
    }
}