package de.metro.demo.strategy;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * Created by LaurentiuM on 2019-08-07.
 */
public class StrategyLambda {
    public static void publishText(String text,
                                   Predicate<String> filter,
                                   UnaryOperator<String> format) {
        if (filter.test(text)) {
            System.out.println(format.apply(text));
        }
    }

    public static void main(String[] args) {
        publishText("ERROR - something bad happened", s -> true, String::toUpperCase);
        publishText("DEBUG - I'm here", s -> s.length() < 20, String::toLowerCase);
    }
}
