package info.jasonparker.password.generator;

import info.jasonparker.password.rules.Rules;

import java.util.Random;

public class DefaultGenerator {

    private final Random rnd = new Random();

    private final String acceptableCharacters;
    private final String pattern;
    private final int minLength;

    public DefaultGenerator(Rules rules) {
        this.acceptableCharacters = rules.getAcceptableCharacters();
        this.pattern = rules.getExpectedPattern();
        this.minLength = rules.getMinLength();
    }

    public String getPassword(int length) {

        if (length < minLength)
            throw new IllegalArgumentException("Illegal password length requested");

        StringBuilder stringBuilder = new StringBuilder();
        while ((--length) >= 0) {
            int index = rnd.nextInt(acceptableCharacters.length());
            char c = acceptableCharacters.charAt(index);
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }

    public String getPattern() {
        return this.pattern;
    }
}
