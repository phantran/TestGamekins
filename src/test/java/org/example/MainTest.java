package org.example;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testing() {
        assertEquals(5, 5);
    }

    @Test
    public void testing1() {
        Main abc = new Main();
        int temp = abc.haha();
        assertEquals(526, temp);
    }
}
