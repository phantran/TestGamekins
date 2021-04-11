package org.example;

import static org.junit.Assert.assertTrue;


public class AnotherTestNG {

    @org.testng.annotations.Test
    public void fails() {
        assertTrue(true);
    }

    @org.testng.annotations.Test
    public void passes() {
        assertTrue(true);
    }

}