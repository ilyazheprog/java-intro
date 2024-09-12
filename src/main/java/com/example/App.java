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
    public static String reverseString() {
        String str = "make install";  // Переменная создаётся внутри метода
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString(); // Возвращаем строку вместо вывода на консоль
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            System.out.println(fizzbuzz(i));
        }
    }
}
