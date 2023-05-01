package Lesson6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

// 1. Напишите метод, который заполнит массив из 110 элементов случайными цифрами от 0 до 70.
// 2. Создайте метод, в который передайте заполненный выше массив и 
// с помощью Set вычислите процент уникальных
// значений в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

public class task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 110; i++) {
            list.add(rnd.nextInt(70));
        }
        System.out.println(list);
        double result = getUnique(list)*100.0/110.0;
        System.out.println("Percent of unique items: " + result);
    }

    public static int getUnique(ArrayList<Integer> list) {
        HashSet<Integer> hs = new HashSet<>(list);
        ArrayList<Integer> uniqList = new ArrayList<>();
        // System.out.println(hs);
        for (Integer num : hs) {
            int count = 0;
            for (Integer elem : list) {
                if (num == elem) count ++;
            }
            if (count == 1) uniqList.add(num);
        }
        System.out.println(uniqList);
        return uniqList.size();
    }
    
}
