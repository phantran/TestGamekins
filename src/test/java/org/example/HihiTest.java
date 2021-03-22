package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HihiTest {

    @Test
    public void test_hihi() {
        Hihi a = new Hihi(22);
        a.haha();
        assertEquals(1, 1);
        assertEquals(new Hihi(212).getTopFloor(), 212);
    }

    @Test
    public void test_hihi1() {
        Hihi a = new Hihi(12);
        a.addRiders(3);
        a.getTopFloor();
        assertEquals(1, 21);
    }

    @Test
    public void test_hihi2() {
        Hihi a = new Hihi(10);
        a.call(5);
    }
}
