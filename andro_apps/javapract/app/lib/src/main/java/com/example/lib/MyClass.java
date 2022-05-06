package com.example.lib;

public class MyClass {
    public static void main(String[] args) {
        int a = 2;
        int j;
        for (int i = 0; i < 10; i++) {
            j = i + 1;
            System.out.println(a + "X" + j + "=" + (a * j));
        }
    }
}