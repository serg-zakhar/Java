package Base.Lesson4;

import java.util.ArrayList;
import java.util.LinkedList;

// Замерьте время, за которое в ArrayList добавятся 100000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 100000 элементов. Сравните с предыдущим.

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();
        long startnums = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            nums.add(i);
        }
        long stopnums = System.currentTimeMillis();
        System.out.println(stopnums - startnums);
        long startlist = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            list.add(0, i);
        }
        long stoplist = System.currentTimeMillis();
        System.out.println(stoplist - startlist);
    }
    
}
