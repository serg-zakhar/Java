package Lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
// что 1 человек может иметь несколько телефонов.
// Добавить функции 
// 1) Добавление номера
// 2) Вывод всего 

public class homework1 {
    public static void main(String[] args) {
        HashMap<String,String> db = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите пункт меню: ");
            System.out.println("1. Добавление номера");
            System.out.println("2. Вывод всех контактов");
            StringBuilder str = new StringBuilder();
            ArrayList<String> names = new ArrayList<>();
            String menuitem = sc.nextLine();
            if (menuitem.equals("1")) {
                System.out.print("Введите Фамилию: ");
                String name = sc.nextLine();
                System.out.print("Введите номер: ");
                String number = sc.nextLine();
                db.put(number, name);
            } else if (menuitem.equals("2")) {
                for (var item : db.entrySet()) {
                    if (!names.contains(item.getValue())) {
                        names.add(item.getValue());
                    }    
                }
                for (String name : names) {
                    str.append(name + ": ");
                    for (var item : db.entrySet()) {
                        if (item.getValue().equals(name)) {
                            str.append(item.getKey() + " ");
                        }
                    }
                    str.append("\n");
                }
                // System.out.println(names);
                System.out.println(str);
            } else {
                System.out.println("Exit");
                break;
            }
        }
        sc.close();
        
    }  
    
}
 