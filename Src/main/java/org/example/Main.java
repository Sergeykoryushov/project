package org.example;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            System.out.println(i*5);
        }
    }
}
