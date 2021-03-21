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
        io.moco.dev.Feature a = new io.moco.dev.Feature(25, 123);
        a.doNothing();
        a.foo(3);
        Assertions.assertEquals(1,1);
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
        io.moco.dev.Feature a = new io.moco.dev.Feature(25, 123);
        a.doNothing();
        a.foo(3);
//        fail("test should have been aborted");
    }

    @AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownAll() {
    }

}

