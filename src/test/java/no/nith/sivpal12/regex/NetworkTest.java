package no.nith.sivpal12.regex;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

import org.junit.Test;

public class NetworkTest {
    private final String[] validPorts = { "1", "500", "65535" };
    private final String[] invalidPorts = { "0", "-1", "-500", "65536", "",
            "2o0", "abc" };

    @Test
    public void port_ValidNumbers_Ok() throws Exception {
        for (String validPort : validPorts) {
            assertTrue(Pattern.matches(Network.PORT, validPort));
        }
    }

    @Test
    public void port_InvalidNumbers_NotOk() throws Exception {
        for (String invalidPort : invalidPorts) {
            assertFalse(Pattern.matches(Network.PORT, invalidPort));
        }
    }

}
