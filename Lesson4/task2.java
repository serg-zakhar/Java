package Lesson4;

import java.util.LinkedList;
// import java.lang.reflect.Array;
// import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Scanner;

// Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида
// text
// сохранить text в связный список.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
// Работать до тех пор, пока не введен stop

public class task2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите строку: ");
            String input = sc.nextLine();
            if (input.contains("print~")) {
                int index = Integer.parseInt(input.split("~")[1]);
                System.out.println(list.get(index));
                list.remove(index);
            }
            else if (input.equals("stop")) {
                break;
            }
            else {
                list.add(input);
            }
        }
        sc.close();    
    }
}
    

