package Lesson4;

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
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        // int digit = 0;
        sc.close();
        while (true) {
            if (input.contains("print~")) {
                int index = Integer.parseInt(input.split("")[3]);
                System.out.println(index);
            }

        }
            
    }
}
    

