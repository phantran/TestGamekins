package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Junit3Example extends TestCase {

    protected void setUp() throws Exception {

    }

    protected void tearDown() throws Exception {

    }

    public void testSort() {
        Feature a = new Feature(22, 12);
        assertEquals(a.valueInt, 0);
        a.doNothing();
        assertEquals(3,3);
    }

    public void testSort1() {
        Feature a = new Feature(1, 2);
        assertEquals(a.valueInt, 0);
        a.doNothing();
        assertEquals(5,5);
    }

}