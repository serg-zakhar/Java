// Напишите метод, который сжимает строку.

// Пример: вход aaaabbbcddaaa.
// a4b3cd2a3

package Base.Lesson2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int count = 1;
        char[] strArray = str.toCharArray();
        StringBuilder strResult = new StringBuilder(); 
        for (int index = 1; index < strArray.length; index++) {
            if (strArray[index] == strArray[index-1]){
                count += 1;
            }
            else {
                strResult.append(strArray[index-1]);
                if (count != 1) strResult.append(count);
                count = 1;
            }
            if (index == strArray.length - 1) {
                strResult.append(strArray[index]);
                if (count != 1) strResult.append(count);
            }
        }
        System.out.println(strResult.toString());
    }
}
