package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    @Test
    public void testApp() {
        assertTrue(true);
    } 
public class TestError {
    public static void main(String[] args) {
        int a = 10 / 0;  // <-- celowe dzielenie przez zero
    }
}

    
}
