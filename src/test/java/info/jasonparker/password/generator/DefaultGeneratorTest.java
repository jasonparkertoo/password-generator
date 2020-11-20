package info.jasonparker.password.generator;

import info.jasonparker.password.rules.DefaultRules;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DefaultGeneratorTest {

    private final DefaultGenerator defaultGenerator = new DefaultGenerator(new DefaultRules());

    @Test
    public void givenAPasswordRequest_whenTheRequestIsValid_thenThePasswordWillHaveTheRequestLength() {
        int expected = 12;
        String pw = defaultGenerator.getPassword(expected);
        int actual = pw.length();
        assertEquals("Should return a 12 character password", expected, actual);
    }

    @Test
    public void givenAPasswordRequest_whenTheRequestedLengthIsValid_thenThePasswordMatchesTheRegularExpression() {
        String pw = defaultGenerator.getPassword(20);
        boolean isValid = pw.matches(defaultGenerator.getPattern());
        assertTrue("Should match the rule pattern: " + defaultGenerator.getPattern(), isValid);
    }
}