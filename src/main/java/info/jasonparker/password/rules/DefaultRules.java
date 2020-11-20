package info.jasonparker.password.rules;

public class DefaultRules implements Rules {

    // abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()1234567890
    private final String charSet = "1Lagb4$GzApo9r&HWPRNMkBUSj8^EQuc0vF!ZlDm#KTni65wIY3Jd*(7e)Oq2sxCVXt%yfh@";
    private final String patternRegex = "^[a-zA-Z0-9!@#$%^&*()]*$";
    private final int minLength = 8;

    @Override
    public String getAcceptableCharacters() {
        return this.charSet;
    }

    @Override
    public String getExpectedPattern() {
        return this.patternRegex;
    }

    @Override
    public int getMinLength() { return this.minLength; }
}
