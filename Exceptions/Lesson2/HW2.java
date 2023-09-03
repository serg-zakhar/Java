package Exceptions.Lesson2;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1е число: ");
        int num1 = sc.nextInt();
        System.out.println("Введите 2е число: ");
        int num2 = sc.nextInt();
        try {
            if (num2 == 0) {
                sc.close();
                throw new DivisionByZeroException("Деление на 0 недопустимо");
            }
            System.out.printf("Результат деления %d на %d: " + num1 / num2, num1,num2);
        } catch (DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        sc.close();
        
    }
    
}
