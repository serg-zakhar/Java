package OOP.Exceptions.Lesson2;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = sc.nextInt();
        try {
            if (num <= 0) {
                sc.close();
                throw new InvalidNumberException("Некорректное число");
            }
            System.out.println("Число корректно");
        } catch (InvalidNumberException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        sc.close();
        
    }
    
}
