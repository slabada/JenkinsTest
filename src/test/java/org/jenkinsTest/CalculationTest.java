package org.jenkinsTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CalculationTest {

    @InjectMocks
    Calculation calculation;

    @Test
    void sum() {
        var r = calculation.sum(5,5);
        assertEquals(10, r);
    }
}