package org.example;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.*;

import java.util.Optional;

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
        a.foo(10);
//        Assertions.assertEquals(a.foo(39), 3);
    }

    @Test
    void failingTest() {
//        fail("a failing test");
        Assertions.assertEquals(3, 3);
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }

    @Test
    void abortedTest() {
        assumeTrue("abc".contains("abc"));
        Feature a = new Feature(25, 1223);
        a.doNothing();
//        Assertions.assertEquals(a.foo(3), 39);
    }

    @AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownAll() {
    }

}

