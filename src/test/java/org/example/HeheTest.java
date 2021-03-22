package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HeheTest {

    @Test
    public void test_hihi() {
        Hihi a = new Hihi(5);
        a.haha();
        assertEquals(1, 1);
        assertEquals(a.getTopFloor(), 5);
    }

    @Test
    public void test_hihi1() {
        Hihi a = new Hihi(233);
        a.addRiders(53);
        a.getTopFloor();
        assertEquals(1, 1);
    }

    @Test
    public void test_hihi3() {
        Hihi a = new Hihi(12133);
        a.addRiders(36);
        a.getTopFloor();
        assertEquals(1, 1);
    }
}
