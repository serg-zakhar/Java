// Калькулятор с логом

package Lesson2;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        String str;
        String path = "Lesson2/log_hw3.txt";
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
                str = num1 + " + " + num2 + " = " + (num1 + num2);
                System.out.println(str);
                logging(str, path);
                break;
            case ("-"):
                str = num1 + " - " + num2 + " = " + (num1 - num2);
                System.out.println(str);
                logging(str, path);
                break;
            case ("*"):
                str = num1 + " * " + num2 + " = " + (num1 * num2);
                System.out.println(str);
                logging(str, path);
                break;
            case ("/"):
                double n1 = num1;
                double n2 = num2;
                str = num1 + " / " + num2 + " = " + (n1 / n2);
                System.out.println(str);
                logging(str, path);
                break;
            default:
                System.out.println("Неверный знак оператора!");
                break;
        }
    }

    public static void logging(String str, String path) {
        File logfile = new File(path);
        try {
            FileWriter fw = new FileWriter(logfile, true);
            // System.out.println(str);
            fw.write(str);
            fw.write("\n");
            fw.close();
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
