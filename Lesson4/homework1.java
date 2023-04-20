package Lesson4;

import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

public class homework1 {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            nums.add(i);
        }
        System.out.println(reverseList(nums));
    }  

    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        for (int i = 0; i < list.size() ; i++) {
            list.add(i, list.getLast());
            list.removeLast();
        }
        return list;
    }
    
}
