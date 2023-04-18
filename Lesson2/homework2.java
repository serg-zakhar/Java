// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

package Lesson2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
// import java.util.Arrays;

public class homework2 {
    public static void main(String[] args) {
        String path = "Lesson2/hw2_file.txt";
        // String line = fileRead(path);
        // StringBuilder str = new StringBuilder();
        // System.out.println(line);
        // String[] strArray = Arrays.stream(line.split(",")).toArray();
        // str.append(line.split(","));
        // System.out.println(strArray.toString());
    }

    public static String fileRead(String path) {
        try {
            File file = new File(path);
            BufferedReader fr = new BufferedReader(new FileReader(file));
            String line = fr.readLine();
            fr.close();
            return line;
        }
        catch (Exception e) {
            System.out.println("Error!");
            return "Error!";
        }
    }
}
