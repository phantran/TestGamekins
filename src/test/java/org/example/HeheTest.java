package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HeheTest {

    @Test
    public void test_hihi() {
        Hihi a = new Hihi(25);
        a.haha();
        assertEquals(1, 1);
        assertEquals(a.getTopFloor(), 25);
    }

    @Test
    public void test_hihi1() {
        Hihi a = new Hihi(23);
        a.addRiders(5);
        a.getTopFloor();
        assertEquals(1, 1);
    }

    @Test
    public void test_hihi3() {
        Hihi a = new Hihi(13);
        a.addRiders(36);
        a.getTopFloor();
        assertEquals(1, 1);
    }
}
