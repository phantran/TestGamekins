package org.example;

import junit.framework.TestCase;

public class Junit3Example extends TestCase {

    protected void setUp() throws Exception {

    }

    protected void tearDown() throws Exception {

    }

    public void testSort() {
        Feature a = new Feature(2232, 123);
        a.doNothing();
        assertEquals(32,3);
    }

}