package com.medianet.calculator1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculator1Test {
    private Calculator1 calculator1 = new Calculator1();
    @Test
    public void testSum() {
        assertEquals(5, calculator1.sum(2, 3));
    }
}
