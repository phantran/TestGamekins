package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleExampleTest {

    @Test
    public void test_hihi() {
        SimpleExample a = new SimpleExample(1);
        a.doStuff(1, 2.0);
        assertEquals(1, 1);
    }

    @Test
    public void test_hihi1() {
        Hihi a = new Hihi(20);
        a.addRiders(3);
        a.getTopFloor();
        assertEquals(1, 1);
    }

    @Test
    public void test_hihi2() {
        Hihi a = new Hihi(10);
        a.call(5);
    }
}
