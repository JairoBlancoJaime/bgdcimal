package org.iesvdm.bigd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class ExactPrecisionAvoidingFloatDoubleTest {

    @Test
    void TestBDFromDoubletoConstructor() {
        double doubleValue = 1.1;
        BigDecimal fromDouble = new BigDecimal(doubleValue); // Not recommended

        BigDecimal preciseValue = new BigDecimal("1.1");

        Assertions.assertNotEquals("1.1", fromDouble.toString());
        Assertions.assertEquals("1.1", preciseValue.toString());
    }

    @Test
    void testBigdecimalFromDouble() {
        double doubleValue = 1.1d;

        BigDecimal fromDouble = BigDecimal.valueOf(doubleValue);

        Assertions.assertEquals("1.1", fromDouble);
    }
}
