package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    // Тесты для FizzBuzz
    @Test
    public void testFizzbuzz() {
        assertEquals("fizz", App.fizzbuzz(5));
        assertEquals("buzz", App.fizzbuzz(7));
        assertEquals("fizzbuzz", App.fizzbuzz(35));
        assertEquals("2", App.fizzbuzz(2));
    }

    // Тесты для Reverse String
    @Test
    public void testReverseString() {
        assertEquals("llatsni ekam", App.reverseString());
    }

    // Тесты для решения квадратного уравнения
    @Test
    public void testSolveQuadraticEquation() {
        assertEquals("Два корня: 2.0, 1.0", App.solveQuadraticEquation(1, -3, 2));
        assertEquals("Один корень: 1.0", App.solveQuadraticEquation(1, -2, 1));
        assertEquals("нет вещественных корней", App.solveQuadraticEquation(1, 0, 1));
    }

    // Тесты для суммы ряда
    @Test
    public void testCalculateSeriesSum() {
        double result = App.calculateSeriesSum();
        assertTrue(result > 0);
        assertTrue(result < 10); // Проверка разумного диапазона
    }

    // Тесты для проверки на палиндром
    @Test
    public void testIsPalindrome() {
        assertTrue(App.isPalindrome("radar"));
        assertTrue(App.isPalindrome("level"));
        assertFalse(App.isPalindrome("hello"));
    }
}
