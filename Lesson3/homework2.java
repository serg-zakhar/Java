package Lesson3;

import java.util.ArrayList;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа

public class homework2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            nums.add(rand.nextInt(100));
        }
        System.out.println(nums);
        for (Integer elem : nums) {
            // if (elem % 2 == 0) {
                nums.remove(elem);
            // }            
        }
        System.out.println(nums);
    }
    
}
