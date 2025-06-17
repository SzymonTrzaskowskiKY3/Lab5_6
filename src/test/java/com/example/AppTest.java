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
            // Code smell: użycie System.out.println
            System.out.println("To jest niezalecane według SonarWay.");

            // Magic number (SonarWay domyślnie to wyłapuje)
            int retryLimit = 5;

            // Pusta pętla (SonarWay uzna to za code smell)
            for (int i = 0; i < retryLimit; i++) {
            }

            // Brak testów dla tej klasy => wpłynie na coverage
        }
    }
}
