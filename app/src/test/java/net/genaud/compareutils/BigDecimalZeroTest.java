package net.genaud.compareutils;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class BigDecimalZeroTest {
    @Test void zero_equals_zero() {
        assertTrue(BigDecimal.ZERO.equals(BigDecimal.ZERO));

        assertTrue(BigDecimal.ZERO.equals(new BigDecimal(0)));
        assertTrue(BigDecimal.ZERO.equals(new BigDecimal(0.0)));
        assertTrue(BigDecimal.ZERO.equals(new BigDecimal("0")));
        assertFalse(BigDecimal.ZERO.equals(new BigDecimal("0.0")));

        assertTrue((new BigDecimal(0)).equals(BigDecimal.ZERO));
        assertTrue((new BigDecimal(0.0)).equals(BigDecimal.ZERO));
        assertTrue((new BigDecimal("0")).equals(BigDecimal.ZERO));
        assertFalse((new BigDecimal("0.0")).equals(BigDecimal.ZERO));

        assertTrue((new BigDecimal("0.0")).equals(new BigDecimal("0.0")));
        assertTrue((new BigDecimal("0")).equals(new BigDecimal("0")));
        assertFalse((new BigDecimal("0.0")).equals(new BigDecimal("0")));
        assertFalse((new BigDecimal("0")).equals(new BigDecimal("0.0")));

        // strange
        assertFalse((new BigDecimal("0.0")).equals(new BigDecimal(0.0)));

        assertTrue((new BigDecimal("0")).equals(new BigDecimal(0)));
        assertFalse((new BigDecimal("0.0")).equals(new BigDecimal(0)));
        assertTrue((new BigDecimal("0")).equals(new BigDecimal(0.0)));

        assertFalse((new BigDecimal(0.0)).equals(new BigDecimal("0.0")));
        assertTrue((new BigDecimal(0)).equals(new BigDecimal("0")));
        assertTrue((new BigDecimal(0.0)).equals(new BigDecimal("0")));
        assertFalse((new BigDecimal(0)).equals(new BigDecimal("0.0")));
    }

    @Test void zero_compareto_zero() {
        assertEquals(BigDecimal.ZERO.compareTo(BigDecimal.ZERO), 0);

        assertEquals(BigDecimal.ZERO.compareTo(new BigDecimal(0)), 0);
        assertEquals(BigDecimal.ZERO.compareTo(new BigDecimal(0.0)), 0);
        assertEquals(BigDecimal.ZERO.compareTo(new BigDecimal("0")), 0);
        assertEquals(BigDecimal.ZERO.compareTo(new BigDecimal("0.0")), 0);

        assertEquals((new BigDecimal(0)).compareTo(BigDecimal.ZERO), 0);
        assertEquals((new BigDecimal(0.0)).compareTo(BigDecimal.ZERO), 0);
        assertEquals((new BigDecimal("0")).compareTo(BigDecimal.ZERO), 0);
        assertEquals((new BigDecimal("0.0")).compareTo(BigDecimal.ZERO), 0);

        assertEquals((new BigDecimal("0.0")).compareTo(new BigDecimal("0.0")), 0);
        assertEquals((new BigDecimal("0")).compareTo(new BigDecimal("0")), 0);
        assertEquals((new BigDecimal("0.0")).compareTo(new BigDecimal("0")), 0);
        assertEquals((new BigDecimal("0")).compareTo(new BigDecimal("0.0")), 0);

        // strange
        assertEquals((new BigDecimal("0.0")).compareTo(new BigDecimal(0.0)), 0);

        assertEquals((new BigDecimal("0")).compareTo(new BigDecimal(0)), 0);
        assertEquals((new BigDecimal("0.0")).compareTo(new BigDecimal(0)), 0);
        assertEquals((new BigDecimal("0")).compareTo(new BigDecimal(0.0)), 0);

        assertEquals((new BigDecimal(0.0)).compareTo(new BigDecimal("0.0")), 0);
        assertEquals((new BigDecimal(0)).compareTo(new BigDecimal("0")), 0);
        assertEquals((new BigDecimal(0.0)).compareTo(new BigDecimal("0")), 0);
        assertEquals((new BigDecimal(0)).compareTo(new BigDecimal("0.0")), 0);
    }

}
