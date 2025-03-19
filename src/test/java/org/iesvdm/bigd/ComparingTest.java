package org.iesvdm.bigd;

import org.iesvdm.bigd.Comparing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;


public class ComparingTest {

    @Test
    void testCmpare() {
        BigDecimal num1 = new BigDecimal("3.00");
        BigDecimal num2 = new BigDecimal("3.00");
        BigDecimal num3 = new BigDecimal("3");

        Assertions.assertTrue(num1.equals(num2));
        Assertions.assertTrue(num1.compareTo(num3) == 0);
        Assertions.assertFalse(num1.equals(num3));
    }
}
