package Base.Lesson1;

public class homework2 {

    public static boolean CheckSimple(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("1 2 ");
        for (int i = 3; i < 1000; i += 2) {
            if (CheckSimple(i)) {
                System.out.print(i + " ");
            }
        }
    }

}
