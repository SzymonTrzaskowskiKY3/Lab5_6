package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    @Test
    public void testApp() {
        assertTrue(true); // Test przechodzi
    }

    // Klasa z błędem jakościowym
    public class TestError {
        public static void main(String[] args) {
            try {
                int a = 10 / 0; // celowy błąd w runtime
            } catch (Exception e) {
                // PUSTY CATCH - to jest blokujące dla SonarWay
            }
        }
    }
}
