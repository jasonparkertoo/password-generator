package info.jasonparker.password.generator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import info.jasonparker.password.rules.DefaultRules;

public class DefaultGeneratorTest {

    private final DefaultGenerator defaultGenerator = new DefaultGenerator(new DefaultRules());

    @Test
    public void testPasswordReturnsExpectedLengthString() {
        int expected = 12;
        String pw = defaultGenerator.getPassword(expected);
        int actual = pw.length();
        assertEquals(expected, actual);
    }

    @Test
    public void testValidRequestReturnsExpectedPattern() {
        String pw = defaultGenerator.getPassword(20);
        boolean isValid = pw.matches(defaultGenerator.getPattern());
        assertTrue(isValid);
    }
}