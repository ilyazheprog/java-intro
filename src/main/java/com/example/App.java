package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String fizzbuzz(int n) {
        if (n % 5 == 0 && n % 7 == 0) {
            return "fizzbuzz";
        } else if (n % 5 == 0) {
            return "fizz";
        } else if (n % 7 == 0) {
            return "buzz";
        } else {
            return Integer.toString(n);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            System.out.println(fizzbuzz(i));
        }
    }
}
