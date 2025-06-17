package com.example;

public class Danger {
    public void riskyMethod() {
        String value = null;
        if (value.equals("test")) { // ❌ potencjalne NullPointerException — Sonar to złapie
            System.out.println("Match!");
        }
    }
}
