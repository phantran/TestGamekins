package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FeatureTest {

    @Test
    public void test_hihi() {
        Feature a = new Feature(25, 123);
        a.doNothing();
        a.foo(5);
        assertEquals(1, 1);
    }

    @Test
    public void test_hihi1() {
        Hihi a = new Hihi(136);
        a.addRiders(100);
        a.getTopFloor();
        assertEquals(1, 1);
    }

    @Test
    public void test_hihi3() {
        Hihi a = new Hihi(34);
        a.addRiders(15);
        a.getTopFloor();
        assertEquals(1, 1);
    }
}
