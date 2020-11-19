package com.starapp.ws.mobileappws.shared;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.Random;

@Component
public class Utils {

    private static final Random RANDOM = new SecureRandom();
    private static final String ALPHABET = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_";

    public static String generateRandomString(int lenght) {
        StringBuilder returnValue = new StringBuilder();
        for (int i = 0; i < lenght; ++i) {
            returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }
        return returnValue.toString();
    }

    public String generateUserId(int lenght) {
        return generateRandomString(lenght);
    }
}
