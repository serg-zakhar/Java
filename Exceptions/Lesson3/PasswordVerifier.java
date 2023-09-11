// Задача 1: Проверка пароля (Основы языка Java, операторы, ветвления)

// Создайте класс PasswordVerifier. Этот класс должен содержать метод, который принимает строку пароля и проверяет его на соответствие следующим правилам:

// Пароль должен быть не менее 8 символов.
// Пароль должен содержать хотя бы одну цифру.
// Пароль должен содержать хотя бы одну заглавную букву.
// Метод должен выбрасывать исключение, если пароль не соответствует какому-либо из этих правил.

package Exceptions.Lesson3;

import java.util.Scanner;

public class PasswordVerifier {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            PasswordVerifier verifier = new PasswordVerifier();

            System.out.println("Введите пароль: ");
            String pass = sc.nextLine();

            try {
                verifier.verify(pass);
                System.out.println("Пароль соответствует требованиям.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            sc.close();
        }

        public boolean verify(String password) throws Exception {
            if (password.length() < 8) {
                throw new Exception("Пароль должен быть не менее 8 символов.");
            }

            if (!password.matches(".*\\d.*")) {
                throw new Exception("Пароль должен содержать хотя бы одну цифру.");
            }

            if (!password.matches(".*[A-Z].*")) {
                throw new Exception("Пароль должен содержать хотя бы одну заглавную букву.");
            }

            return true;
        }

    }

