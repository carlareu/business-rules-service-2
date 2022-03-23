package com.tymit.rules.utils;

import javax.enterprise.context.ApplicationScoped;
import java.util.Random;

@ApplicationScoped
public class RandomValueGenerator {
    private static final Random RAND = new Random();

    public static int nextInt(int bound) {
        return RAND.nextInt(bound);
    }
}
