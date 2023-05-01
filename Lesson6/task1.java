package Lesson6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}.
//  Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}.  
// Распечатайте содержимое данного множества.
// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}.  
// Распечатайте содержимое данного множества.

public class task1 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(30000);
        hs.add(2);
        hs.add(4);
        hs.add(5000);
        hs.add(6);
        hs.add(3);
        System.out.println(hs.toString());

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(2);
        lhs.add(30000);
        lhs.add(2);
        lhs.add(4);
        lhs.add(5000);
        lhs.add(6);
        lhs.add(3);
        System.out.println(lhs.toString());

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(30000);
        ts.add(2);
        ts.add(4);
        ts.add(5000);
        ts.add(6);
        ts.add(3);
        System.out.println(ts.toString());
    }
    
}
