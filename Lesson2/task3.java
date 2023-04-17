// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает boolean значение).

package Lesson2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        if (checkPalindrom(inputString())) {
            System.out.println("Палиндром");
        }
        else {
            System.out.println("Не палиндром");
        }
    }


    public static boolean checkPalindrom(String str){
        char[] strArray = str.toCharArray();
        if (strArray.length % 2 == 0) return false;
        int halfArray = strArray.length / 2;
        StringBuilder strHalf1 = new StringBuilder();
        StringBuilder strHalf2 = new StringBuilder();
        for (int i = 0; i < halfArray; i++) {
            strHalf1.append(strArray[i]);
        }
        for (int i = halfArray +1; i < strArray.length; i++) {
            strHalf2.append(strArray[i]);
        }
        // System.out.println(strHalf1);
        // System.out.println(strHalf2);
        if (strHalf1.toString().equals(strHalf2.reverse().toString())) {
            return true;
        }
        else {
            return false;
        }
    }


    public static String inputString(){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String result = sc.nextLine();
        sc.close();
        return result;
    }
}
