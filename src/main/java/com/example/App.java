package com.example;

public class App {

    // Задача 1: FizzBuzz
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

    // Задача 2: Reverse String
    public static String reverseString() {
        String str = "make install";
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    // Задача 3: Решение квадратного уравнения
    public static String solveQuadraticEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            return "нет вещественных корней";
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            return "Один корень: " + root;
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return "Два корня: " + root1 + ", " + root2;
        }
    }

    // Задача 4: Вычисление суммы ряда
    public static double calculateSeriesSum() {
        double sum = 0.0;
        double term;
        int n = 2;

        do {
            term = 1.0 / (n * n + n - 2);
            sum += term;
            n++;
        } while (term >= 1e-6);

        return sum;
    }

    // Задача 5: Проверка на палиндром
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        // Задача 1: FizzBuzz
        for (int i = 1; i <= 500; i++) {
            System.out.println(fizzbuzz(i));
        }

        // Задача 2: Reverse String
        System.out.println(reverseString());

        // Задача 3: Решение квадратного уравнения
        System.out.println(solveQuadraticEquation(1, -3, 2)); // Пример a=1, b=-3, c=2

        // Задача 4: Вычисление суммы ряда
        System.out.println("Сумма ряда: " + calculateSeriesSum());

        // Задача 5: Проверка на палиндром
        System.out.println("Палиндром: " + isPalindrome("radar")); // Пример
    }
}
