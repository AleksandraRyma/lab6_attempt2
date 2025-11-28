// src/main/java/com/example/App.java
package com.example;

/**
 * Простейшее Java-приложение, которое демонстрирует бизнес-метод greet()
 * и точку входа main(). Этот класс попадёт в исполняемый JAR.
 */
public class App {

  /**
   * Точка входа. При запуске через `java -jar` будет выполнен метод main().
   * результат работы бизнес-метода greet().
   *
   */
  public static void main(String[] args) {
    System.out.println(greet("World"));
  }

  /**
   * Бизнес-метод: формирует приветствие.
   *
   */
  public static String greet(String name) {
    // Здесь могла бы быть любая логика — валидация, обработка и т.п.
    return "Hello, " + name + "!";
  }

  public static int add(int a, int b) {
    return a + b;
  }

  public static String login(String username, String password) {
    if ("admin".equals(username) && "12345".equals(password)) {
      return "Login successful for user: " + username;
    } else {
      return "Login failed";
    }
  }

  public static String checkPasswordStrength(String password) {
    if (password == null || password.length() < 6) {
      return "WEAK";
    } else if (password.length() >= 8 &&
            password.matches(".*[0-9].*") &&
            password.matches(".*[A-Za-z].*")) {
      return "STRONG";
    } else {
      return "MEDIUM";
    }
  }
  public static boolean isEven(int number) {
    return number % 2 == 0;
  }
}
