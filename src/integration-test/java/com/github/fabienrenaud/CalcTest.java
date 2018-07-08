package com.github.fabienrenaud;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {

    @Test
    void test() {
        assertEquals(9, new Calc().sum(5, 4));
    }
}
