package OOP.Exceptions.Lesson2;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1е число: ");
        int num1 = sc.nextInt();
        System.out.println("Введите 2е число: ");
        int num2 = sc.nextInt();
        System.out.println("Введите 3е число: ");
        int num3 = sc.nextInt();
        try {
            if (num1 > 100) {
                sc.close();
                throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
            } else if (num2 < 0) {
                sc.close();
                throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
            } else if (num1 + num2 < 10) {
                sc.close();
                throw new NumberSumException("Сумма первого и второго чисел слишком мала");
            } else if (num3 == 0) {
                sc.close();
                throw new DivisionByZeroException("Деление на 0 недопустимо");
            }
            System.out.println("Проверка пройдена успешно");
        } catch (NumberOutOfRangeException | NumberSumException | DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        sc.close();
        
    }
    
}
