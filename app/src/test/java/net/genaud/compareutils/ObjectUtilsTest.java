package net.genaud.compareutils;

import java.util.Map;
import java.util.HashMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ObjectUtilsTest {
    @Test void isEmpty_null_lang3_spring() {
        String nullString = null;
        Map<String, byte[]> nullMap = null;
        assertEquals(
            org.apache.commons.lang3.ObjectUtils.isEmpty(nullString),
            org.springframework.util.ObjectUtils.isEmpty(nullString));

        assertEquals(ApacheUtils.isEmpty(nullString), SpringUtils.isEmpty(nullString));

        assertEquals(ApacheUtils.isEmpty(nullMap), SpringUtils.isEmpty(nullMap));
    }

    @Test void isEmpty_Map() {
        Map<String, byte[]> nullMap = null;
        Map<String, byte[]> emptyMap = new HashMap<String, byte[]>();
        Map<String, byte[]> blankMap = new HashMap<String, byte[]>();
        Map<String, byte[]> simpleMap = new HashMap<String, byte[]>();
        blankMap.put("", "".getBytes());
        simpleMap.put("k", "v".getBytes());

        assertEquals(ApacheUtils.isEmpty(nullMap), SpringUtils.isEmpty(nullMap));
        assertEquals(ApacheUtils.isEmpty(emptyMap), SpringUtils.isEmpty(emptyMap));
        assertEquals(ApacheUtils.isEmpty(simpleMap), SpringUtils.isEmpty(simpleMap));
        assertEquals(ApacheUtils.isEmpty(blankMap), SpringUtils.isEmpty(blankMap));
    }

    @Test void isEmpty_byte_array() {
        byte[] nullBytes = null;
        byte[] blankBytes = new byte[0];
        byte[] loneByte = new byte[] {'z'};

        assertEquals(ApacheUtils.isEmpty(nullBytes), SpringUtils.isEmpty(nullBytes));
        assertEquals(ApacheUtils.isEmpty(blankBytes), SpringUtils.isEmpty(blankBytes));
        assertEquals(ApacheUtils.isEmpty(loneByte), SpringUtils.isEmpty(loneByte));
    }

    @Test void isEmpty_object_string() {
        String nullString = null;
        String emptyString = "";
        String blankString = " ";

        assertEquals(ApacheUtils.isEmpty(nullString), SpringUtils.isEmpty(nullString));
        assertEquals(ApacheUtils.isEmpty(emptyString), SpringUtils.isEmpty(emptyString));
        assertEquals(ApacheUtils.isEmpty(blankString), SpringUtils.isEmpty(blankString));
    }
}
