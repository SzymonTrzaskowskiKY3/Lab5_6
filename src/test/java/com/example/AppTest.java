package com.example;

public class Danger {
    public void riskyMethod() {
        String s = null;
        s.length(); // ❌ Null dereference — SonarCloud uzna to za Blocker Bug
    }
}
