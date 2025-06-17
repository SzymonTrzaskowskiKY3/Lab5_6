package com.example;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testBadPractice() {
        System.out.println("Debug info"); // ❌ Sonar zgłasza "Avoid using System.out"
    }
}
