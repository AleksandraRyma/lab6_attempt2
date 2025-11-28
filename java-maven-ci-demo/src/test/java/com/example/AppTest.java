// src/test/java/com/example/AppTest.java
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Модульный тест для бизнес-метода greet(). Запускается Surefire-плагином Maven.
 * Результаты тестов будут собраны Jenkins и показаны в отчёте JUnit.
 */
class AppTest {

    /**
     * Базовый тест: проверяем, что greet("World") возвращает ожидаемое значение.
     * В реальном проекте добавьте больше тестов (пограничные случаи, null, длинные строки).
     */
    @Test
    void testGreet() {
        assertEquals("Hello, World!", App.greet("World"));
    }

    @Test
    void testAdd() {
        assertEquals(5, App.add(2, 3));
        assertEquals(0, App.add(0, 0));
        assertEquals(-1, App.add(2, -3));
        assertEquals(10, App.add(5, 5));
    }

    @Test
    void testCheckPasswordStrength() {
        assertEquals("Password too weak: must be at least 8 characters",
                App.checkPasswordStrength("123"));
        assertEquals("Password strength: Strong",
                App.checkPasswordStrength("Admin123"));
    }
}
