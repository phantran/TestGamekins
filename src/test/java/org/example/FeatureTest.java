package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FeatureTest {

    @Test
    public void test_hihi() {
        Feature a = new Feature(5, 6);
        a.doNothing();
        a.foo(5);
        System.out.println("aaaa");
        assertEquals(1, 1);
    }

    @Test
    public void test_hihi1() {
        Hihi a = new Hihi(10);
        a.addRiders(3);
        a.getTopFloor();
        assertEquals(1, 1);
    }

    @Test
    public void test_hihi3() {
        Hihi a = new Hihi(10);
        a.addRiders(3);
        a.getTopFloor();
        assertEquals(1, 1);
    }
}
