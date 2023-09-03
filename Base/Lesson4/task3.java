package Base.Lesson4;

import java.util.LinkedList;
import java.util.Scanner;

// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.

public class task3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("Введите строку: ");
        String input = sc.nextLine();
        if (input.equals("print")) {
            System.out.println(list);
        }
        else if (input.equals("stop")) {
            break;
        }
        else {
            list.add(0, input);
        }
        }
        sc.close();    
    }
}
