package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class AppTest {

    @Test
    public void testFizzbuzz() {
        // Тестируем конкретные значения
        assertNotEquals("2", App.fizzbuzz(1)); // Ожидаем 1
        assertEquals("fizz", App.fizzbuzz(5)); // Ожидаем fizz
        assertEquals("buzz", App.fizzbuzz(7)); // Ожидаем buzz
        assertEquals("fizzbuzz", App.fizzbuzz(35)); // Ожидаем fizzbuzz
        assertEquals("fizz", App.fizzbuzz(10)); // Ожидаем fizz
        assertEquals("buzz", App.fizzbuzz(49)); // Ожидаем buzz
        assertEquals("17", App.fizzbuzz(17)); // Ожидаем 17
    }
    @Test
    public void testReverseString() {
        // Тестируем, что метод возвращает строку в обратном порядке
        assertEquals("llatsni ekam", App.reverseString());
        assertNotEquals("llati ekam", App.reverseString());

    }
}