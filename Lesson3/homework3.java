package Lesson3;

// Задан целочисленный список ArrayList. Найти минимальное, 
// максимальное и среднее ариф. из этого списка.

import java.util.ArrayList;
import java.util.Random;
// import java.util.*;

public class homework3 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            nums.add(rand.nextInt(100));
        }
        System.out.println(nums);
        int min = 100;
        int max = 0;
        int sum = 0;
        for (Integer elem : nums) {
            if (elem > max) max = elem;           
            if (elem < min) min = elem;
            sum += elem;
        }
        System.out.println("Максимум: " + max + "\n");
        System.out.println("Минимум: " + min + "\n");
        System.out.println("Среднее арифм: " + sum / 20);
    }
    
}
