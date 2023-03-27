package net.genaud.compareutils;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BigDecimalZeroTest {
    final double dZero = 0.0;

    @Test void zero_equals_zero() {
        assertTrue(BigDecimal.ZERO.equals(BigDecimal.ZERO));
        assertTrue(BigDecimal.ZERO.equals(new BigDecimal(0)));
        assertTrue(BigDecimal.ZERO.equals(new BigDecimal(dZero)));
        assertTrue(BigDecimal.ZERO.equals(new BigDecimal("0")));
        assertTrue(BigDecimal.ZERO.equals(BigDecimal.valueOf(0)));

        assertTrue(BigDecimal.valueOf(0.00).equals(new BigDecimal("0.0")));
    }

    @Test void zero_not_equals_zero() {
        assertFalse(BigDecimal.ZERO.equals(null));
        assertFalse(BigDecimal.ONE.equals(null));

        assertFalse(BigDecimal.ZERO.equals(Boolean.TRUE), "zero equals boolean true");
        assertFalse(BigDecimal.ZERO.equals(Boolean.FALSE), "zero equals boolean false");

        assertFalse(BigDecimal.ZERO.equals(new BigDecimal("0.0")));
        assertFalse(BigDecimal.ZERO.equals(BigDecimal.valueOf(0.0)));

        assertFalse((new BigDecimal(0)).equals(new BigDecimal("0.0")));
        assertFalse((new BigDecimal(dZero)).equals(new BigDecimal("0.0")));
        assertFalse((new BigDecimal("0")).equals(new BigDecimal("0.0")));
        assertFalse(BigDecimal.valueOf(0).equals(new BigDecimal("0.0")));

        assertFalse((new BigDecimal("0.0")).equals(BigDecimal.ZERO));
        assertFalse((new BigDecimal("0.0")).equals(new BigDecimal(0)));
        assertFalse((new BigDecimal("0.0")).equals(new BigDecimal(dZero)));
        assertFalse((new BigDecimal("0.0")).equals(new BigDecimal("0")));
        assertFalse((new BigDecimal("0.0")).equals(new BigDecimal("0.00")));
        assertFalse((new BigDecimal("0.0")).equals(BigDecimal.valueOf(0)));

        assertFalse(BigDecimal.valueOf(0.0).equals(new BigDecimal("0")));
        assertFalse(BigDecimal.valueOf(0).equals(new BigDecimal("0.0")));
        assertFalse(BigDecimal.valueOf(0.0).equals(new BigDecimal("0.00")));
    }

    @Test void zero_compareto_zero() {
//        System.out.println(BigDecimal.ZERO.compareTo(null));
        assertThrows(NullPointerException.class, () -> BigDecimal.ZERO.compareTo(null));
        assertThrows(NullPointerException.class, () -> BigDecimal.ONE.compareTo(null));

        assertEquals(BigDecimal.ZERO.compareTo(BigDecimal.ZERO), 0);
        assertEquals(BigDecimal.ZERO.compareTo(new BigDecimal(0)), 0);
        assertEquals(BigDecimal.ZERO.compareTo(BigDecimal.valueOf(0.0)), 0);
        assertEquals(BigDecimal.ZERO.compareTo(new BigDecimal("0")), 0);
        assertEquals(BigDecimal.ZERO.compareTo(new BigDecimal("0.0")), 0);

        assertEquals((new BigDecimal(0)).compareTo(BigDecimal.ZERO), 0);
        assertEquals((new BigDecimal(0)).compareTo(new BigDecimal(0)), 0);
        assertEquals((new BigDecimal(0)).compareTo(BigDecimal.valueOf(0.0)), 0);
        assertEquals((new BigDecimal(0)).compareTo(new BigDecimal("0")), 0);
        assertEquals((new BigDecimal(0)).compareTo(new BigDecimal("0.0")), 0);

        assertEquals(BigDecimal.valueOf(0.0).compareTo(BigDecimal.ZERO), 0);
        assertEquals(BigDecimal.valueOf(0.0).compareTo(new BigDecimal(0)), 0);
        assertEquals(BigDecimal.valueOf(0.0).compareTo(BigDecimal.valueOf(0.0)), 0);
        assertEquals(BigDecimal.valueOf(0.0).compareTo(new BigDecimal("0")), 0);
        assertEquals(BigDecimal.valueOf(0.0).compareTo(new BigDecimal("0.0")), 0);

        assertEquals((new BigDecimal("0")).compareTo(BigDecimal.ZERO), 0);
        assertEquals((new BigDecimal("0")).compareTo(new BigDecimal(0)), 0);
        assertEquals((new BigDecimal("0")).compareTo(BigDecimal.valueOf(0.0)), 0);
        assertEquals((new BigDecimal("0")).compareTo(new BigDecimal("0")), 0);
        assertEquals((new BigDecimal("0")).compareTo(new BigDecimal("0.0")), 0);

        assertEquals((new BigDecimal("0.0")).compareTo(BigDecimal.ZERO), 0);
        assertEquals((new BigDecimal("0.0")).compareTo(new BigDecimal(0)), 0);
        assertEquals((new BigDecimal("0.0")).compareTo(BigDecimal.valueOf(0.0)), 0);
        assertEquals((new BigDecimal("0.0")).compareTo(new BigDecimal("0")), 0);
        assertEquals((new BigDecimal("0.0")).compareTo(new BigDecimal("0.0")), 0);
    }

}
