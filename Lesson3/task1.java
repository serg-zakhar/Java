package Lesson3;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        // int[] intList = new int[10];
        ArrayList<Integer> intList = new ArrayList<>(10);
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            intList.add(rand.nextInt(100));
        }
        // Arrays.sort(intList);
        // System.out.println(Arrays.toString(intList));
        System.out.println(intList);
        intList.sort(null);
        System.out.println(intList);
    }


}
