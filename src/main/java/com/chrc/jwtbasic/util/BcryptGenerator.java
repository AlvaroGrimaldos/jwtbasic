package com.chrc.jwtbasic.util;

import java.util.Scanner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public final class BcryptGenerator {

    private static final PasswordEncoder ENCODER = new BCryptPasswordEncoder();

    private BcryptGenerator() {
    }

    public static String hash(String raw) {
        return ENCODER.encode(raw);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa el texto a codificar: ");
            String raw = scanner.nextLine();
            System.out.println(hash(raw));
        }
    }
}
