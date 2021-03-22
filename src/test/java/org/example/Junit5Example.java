package org.example;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.*;

class Junit5Example {

    @BeforeAll
    static void initAll() {
    }

    @BeforeEach
    void init() {
    }

    @Test
    void succeedingTest() {
        Feature a = new Feature(235, 12);
        a.doNothing();
        a.foo(3);
        Assertions.assertEquals(a.foo(329),0);
    }

    @Test
    void failingTest() {
//        fail("a failing test");
        Assertions.assertEquals(1,1);
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }

    @Test
    void abortedTest() {
        assumeTrue("abc".contains("abc"));
        Feature a = new Feature(25, 123);
        a.doNothing();
        Assertions.assertEquals(a.foo(3),39);
    }

    @AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownAll() {
    }

}

