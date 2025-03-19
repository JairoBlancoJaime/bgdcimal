package org.iesvdm.bigd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class DividingRoundingTest {

    @Test
    public void testDividingPrecision() {
        BigDecimal num1 = new BigDecimal("1");
        BigDecimal num2 = new BigDecimal("200");

        // BigDecimal result = num1.divide(num2, 2, RoundingMode.HALF_UP);
        BigDecimal result = num1.divide(num2,new MathContext(3, RoundingMode.HALF_UP));

        // 1/200 = 0.005... ->HALF_UP scale 2 -> 0.01
        Assertions.assertNotEquals("0.01", result.toString());

    }
}
