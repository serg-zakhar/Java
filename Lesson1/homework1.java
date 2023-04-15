package Lesson1;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int num_sum = 0;
        int num_fact = 1;
        for (int i = 1; i <= num; i++) {
            num_sum += i;
            num_fact *= i;
        }
        System.out.println("Треугольное число " + num + " равно: " + num_sum);
        System.out.println("Факториал числа " + num + " равен: " + num_fact);
    }
}
