// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

package Base.Lesson2;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        String path = "Lesson2/log_hw1.txt";
        int[] numArray = Arrays.stream(inputString().split(",")).mapToInt(Integer::parseInt).toArray();
        int temp;
        for (int i = 0; i < numArray.length; i++) {
            for (int j = 1; j < numArray.length - i; j++) {
                if (numArray[j - 1] > numArray[j]) {
                    temp = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = temp;
                    // System.out.println(Arrays.toString(numArray));
                    logging(Arrays.toString(numArray), path);
                }
            }
        }
    }

    public static void logging(String str, String path) {
        File logfile = new File(path);
        try {
            FileWriter fw = new FileWriter(logfile, true);
            // System.out.println(str);
            fw.write(str);
            fw.write("\n");
            fw.close();
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }

    public static String inputString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите массив чисел через запятую: ");
        String result = sc.nextLine();
        sc.close();
        return result;
    }
}
