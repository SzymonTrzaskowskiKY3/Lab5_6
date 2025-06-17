package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    @Test
    public void testApp() {
        assertTrue(true); // Test przejdzie
    }

    public class TestError {
        public static String riskyMethod() {
            try {
                return "ok";
            } finally {
                throw new RuntimeException("Exception from finally"); // Ten throw jest BLOCKER
            }
        }

        public static void main(String[] args) {
            riskyMethod(); // uruchomi wyjątek tylko w runtime
        }
    }
}
