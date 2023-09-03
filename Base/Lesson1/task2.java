package Base.Lesson1;

public class task2 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 3, 2, 4, 3, 5, 3, 3, };
        int val = 3;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == val) {
                    arr[i] = arr[j];
                    arr[j] = val;
                }
            }
        }
        System.out.print("[");
        for (int i : arr) {
            System.out.printf(" %s,", i);
        }
        System.out.print(" ]");
    }
}
