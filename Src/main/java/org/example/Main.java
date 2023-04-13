package org.example;

import java.time.LocalDateTime;

public class Main {

    public static final String NUMBER = "89274994878";
    
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        for (int i = 0; i < 4; i++) {
            System.out.println(i*7);
        }
    }
}
