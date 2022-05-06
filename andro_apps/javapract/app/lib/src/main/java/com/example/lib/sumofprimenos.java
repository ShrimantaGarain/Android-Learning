package com.example.lib;

public class sumofprimenos {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        int n = 5;
        //calculating the sum of the prime numbers
        while (i<n) {
            sum += 2*i;
            i++;
        }
        System.out.println("The sum of the prime numbers is: " + sum);
    }
}
