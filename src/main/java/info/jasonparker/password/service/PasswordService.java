package info.jasonparker.password.service;

import info.jasonparker.password.rules.DefaultRules;
import info.jasonparker.password.generator.DefaultGenerator;

public class PasswordService {

    private final DefaultGenerator defaultRuleDefaultGenerator = new DefaultGenerator(new DefaultRules());

    public String getPassword(int length) {
        return defaultRuleDefaultGenerator.getPassword(length);
    }
}
