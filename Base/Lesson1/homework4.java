// Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
// под знаками вопроса - одинаковые цифра
// Ввод: 2? + ?5 = 69
// Вывод: 24 + 45 = 69

package Base.Lesson1;

import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        System.out.println("Введите выражение вида: Ax+Bx=Cх, где А, В и С любые цифры, х - искомая цифра");
        Scanner sc = new Scanner(System.in);
        String[] expr = (sc.nextLine()).trim().split("\\+|=");
        sc.close();
        boolean found_result = false;
        String n1 = expr[0];
        String n2 = expr[1];
        String n3 = expr[2];
        for (int i = 0; i < 10; i++) {
            int int_num1 = ReturnNum(n1, i);
            int int_num2 = ReturnNum(n2, i);
            int int_num3 = ReturnNum(n3, i);
            if (int_num1 + int_num2 == int_num3) {
                System.out.printf("%s + %s = %s%n", int_num1, int_num2, int_num3);
                found_result = true;
            }
        }
        if (found_result == false)
            System.out.println("Выражений не найдено");
    }


    public static int ReturnNum(String str_num, int digit) {
        String digit1, digit2;
        String[] num = str_num.split("");
        if (num[0].equals("x"))
            digit1 = Integer.toString(digit);
        else
            digit1 = num[0];
        if (num[1].equals("x"))
            digit2 = Integer.toString(digit);
        else
            digit2 = num[1];
        // System.out.println(Integer.parseInt(digit1 + digit2));
        return Integer.parseInt(digit1 + digit2);
    }

}
