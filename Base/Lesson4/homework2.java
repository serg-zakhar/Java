package Base.Lesson4;

import java.util.LinkedList;
import java.util.Scanner;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

public class homework2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите пункт меню: ");
            System.out.println("1. Помещает элемент в конец очереди,");
            System.out.println("2. Возвращает первый элемент из очереди и удаляет его,");
            System.out.println("3. Возвращает первый элемент из очереди, не удаляя.");
            String choose = sc.nextLine();
            if (choose.equals("1")) {
                System.out.println("Введите елемент: ");
                String element = sc.nextLine();
                System.out.println(enqueue(list, element));
            } else if (choose.equals("2")) {
                System.out.println(deqeueu(list));
            } else if (choose.equals("3")) {
                System.out.println(first(list));
            } else {
                System.out.println("Exit");
                break;
            }
        }
        sc.close();

    }

    public static LinkedList<String> enqueue(LinkedList<String> list, String element) {
        list.addLast(element);
        return list;
    }

    public static String deqeueu(LinkedList<String> list) {
        String element = list.getFirst();
        list.removeFirst();
        return element;
    }

    public static String first(LinkedList<String> list) {
        String element = list.getFirst();
        return element;
    }
}
