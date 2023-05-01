package Lesson5;

// import java.util.ArrayList;
// import java.util.TreeMap;

// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. 
// И вывести Доску. Пример вывода доски 8x8

// 0x000000
// 0000x000
// 00x00000

public class homework3 {
    public static void main(String[] args) {
        // int[] line1 = new int[8];
        // int[] line2 = new int[8];
        // int[] line3 = new int[8];
        // int[] line4 = new int[8];
        // int[] line5 = new int[8];
        // int[] line6 = new int[8];
        // int[] line7 = new int[8];
        // int[] line8 = new int[8];
        // ArrayList<Integer> lines = new ArrayList<>();
        // for (int line : lines) {

        // }
        int[][] lines = new int[8][8];
        int count = 0;
        int x = 0;
        StringBuilder str = new StringBuilder();
        while (count < 1) {
            for (int i = x; i < lines.length + x; i++) {
                for (int j = 0; j < lines.length; j++) {
                    if (checkPos(i, j)) {
                        str.append("x");
                        count ++;
                    }
                    str.append("0");
                }
                System.out.println(str.toString());
            }
            x ++;
        }

    }

    public static boolean checkPos(int i, int j) {
        if (i == 0 && j == 0) return true;
        else {
            return false;
        }
    }
}
