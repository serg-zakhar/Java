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
import java.util.Arrays;

import javax.swing.text.html.parser.Element;

public class homework2 {
    public static void main(String[] args) {
        String path = "Lesson2/hw2_file.txt";
        String lines = fileRead(path);
        StringBuilder str = new StringBuilder();
        // System.out.println(lines);
        String[] linesArray = lines.split("\n");
        System.out.println(Arrays.toString(linesArray));
        for (int i = 0; i < linesArray.length; i++) {
            String strLine = linesArray[i].toString().replace("фамилия", "Студент");
            strLine = strLine.replace("оценка", "получил");
            strLine = strLine.replace("предмет", "по предмету: ");
            str.append(strLine);
            // String[] strArray = linesArray[i].split(",");
            // System.out.println(Arrays.toString(strArray));
            // for (int j = 0; j < strArray.length; j++) {
            //     String[] elem = strArray[j].split(":");
            //     System.out.println(Arrays.toString(elem));
            //     // str.append(elem[0].replace("фамилия", "Студент"));
            //     // str.append(elem[1],replace("\"","");
            //     // str.append(elem[i].replace("фамилия", ""));
            //     // for (int k = 0; k < elem.length; k++) {
            //     //     str.append(elem[k].replace("фамилия", "Студент"));
            //     //     // elem[k].replace("\"", "");
            //     // //     elem[k].replace("фамилия", "Студент");
            //         // str.append(elem[k].replace("оценка", "получил"));
            //     //     str.append(elem[k].replace("предмет", "по предмету: "));
            //     //     // System.out.println(elem[k].replace("фамилия", "Студент"));
            //     //     }
            //     System.out.println(Arrays.toString(elem));
            //     // str.append(elem);
                System.out.println(str.toString());
            //     // System.out.println("\n");
            //     }
            //     // str.append(strArray[j]);
            }
        }
            // str.append(line.split(","));
            // System.out.println(Arrays.toString(strArray));
            // System.out.println(str.toString());


    public static String fileRead(String path) {
        try {
            File file = new File(path);
            BufferedReader fr = new BufferedReader(new FileReader(file));
            StringBuilder str = new StringBuilder();
            String line = fr.readLine();
            while (line != null) {
                // System.out.println(line);
                str.append(line);
                str.append("\n");
                line = fr.readLine();
            }
            fr.close();
            return str.toString();
        }
        catch (Exception e) {
            System.out.println("Error!");
            return "Error!";
        }
    }
}
