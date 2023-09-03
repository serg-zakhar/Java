package Exceptions.Lesson1;

public class Main {
    public static void main(String[] args) {
        // int num1 = 10;
        // String num2 = "2R";
        // int num3 = Integer.parseInt(num2);

        int[] a = {4,5,6};
        int[] b = {1,2,3};
        int[] res = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[i] - b[i];
        }

    }
}
