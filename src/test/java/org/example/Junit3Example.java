package org.example;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;

public class Junit3Example extends TestCase {

    protected void setUp() throws Exception {

    }

    protected void tearDown() throws Exception {

    }

    public void testSort() {
        Feature a = new Feature(2232, 123);
        assertEquals(a.valueInt, 0);
        a.doNothing();
        assertEquals(3,3);
    }

}