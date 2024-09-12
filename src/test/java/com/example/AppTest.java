package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest {

    @Test
    public void testFizzbuzz() {
        // Тестируем конкретные значения
        assertEquals("1", App.fizzbuzz(1)); // Ожидаем 1
        assertEquals("fizz", App.fizzbuzz(5)); // Ожидаем fizz
        assertEquals("buzz", App.fizzbuzz(7)); // Ожидаем buzz
        assertEquals("fizzbuzz", App.fizzbuzz(35)); // Ожидаем fizzbuzz
        assertEquals("fizz", App.fizzbuzz(10)); // Ожидаем fizz
        assertEquals("buzz", App.fizzbuzz(49)); // Ожидаем buzz
        assertEquals("17", App.fizzbuzz(17)); // Ожидаем 17
    }
}