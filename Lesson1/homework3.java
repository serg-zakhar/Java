package Lesson1;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ведите 1е число: ");
        int num1 = sc.nextInt();
        System.out.print("Введите 2е число: ");
        int num2 = sc.nextInt();
        System.out.print("Введите операцию: ");
        String oper = sc.next();
        sc.close();
        switch (oper) {
            case ("+"):
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case ("-"):
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case ("*"):
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case ("/"):
                double n1 = num1;
                double n2 = num2;
                System.out.println(num1 + " / " + num2 + " = " + (n1 / n2));
                break;
            default:
                System.out.println("Неверный знак оператора!");
                break;
        }
    }
}
