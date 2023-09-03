// Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
// которая состоит из чередующихся символов c1 и c2, начиная с c1.

package Base.Lesson2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.print("Введите четное положительное число: ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        System.out.print("Введите первый символ: ");
        String ch1 = sc.next();
        System.out.print("Введите второй символ: ");
        String ch2 = sc.next();
        sc.close();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < len/2; i++) {
            str.append(ch1 + ch2);
        }
        System.out.println(str);
    }
}
