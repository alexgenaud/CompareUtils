package net.genaud.compareutils;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import java.lang.UnsupportedOperationException;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UuidTest {
    //static void
    @Test void randomUUID_version_variant() {
        final Class<UnsupportedOperationException> unsupOpEx = UnsupportedOperationException.class;
        UUID id = UUID.randomUUID();

        assertEquals(4, id.version(), "basic UUID version");
        assertEquals(2, id.variant(), "basic UUID variant");
        assertThrowsExactly(unsupOpEx, () -> { id.clockSequence(); });

        long leastSig = id.getLeastSignificantBits();
        assertTrue(leastSig < 0);

        // most signicant is truly random
        //long mostSig = id.getMostSignificantBits();
        //assertTrue(mostSig > 0);

        //example 28c817e8-5587-4e58-93b9-6e811e800735
        final String hex = "[a-fA-F0-9]";
        assertLinesMatch(List.of(
            "^"+hex+"{8}-"+hex+"{4}-"+hex+"{4}-"+hex+"{4}-"+hex+"{12}$"),
            List.of(id.toString()));
    }
}
