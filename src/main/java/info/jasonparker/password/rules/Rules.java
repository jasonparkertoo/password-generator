package info.jasonparker.password.rules;

public interface Rules {
    String getAcceptableCharacters();
    String getExpectedPattern();
    int getMinLength();
}
