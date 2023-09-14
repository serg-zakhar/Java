// Задача 2: Файловый менеджер (ООП, исключения)

// Создайте класс FileManager. 
// Этот класс должен иметь методы для выполнения основных операций с файлами: 
// чтение, запись и копирование. 
// Каждый из этих методов должен выбрасывать соответствующее исключение, 
// если в процессе выполнения операции произошла ошибка 
// (например, FileNotFoundException, если файл не найден).

package Exceptions.Lesson3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class FileManager {

    public String readFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            return content.toString();
        }
    }

    public void writeFile(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        }
    }

    public void copyFile(String sourceFilePath, String destFilePath) throws IOException {
        File sourceFile = new File(sourceFilePath);
        File destFile = new File(destFilePath);

        if (!sourceFile.exists()) {
            throw new FileNotFoundException("Файл не найден: " + sourceFilePath);
        }

        Files.copy(sourceFile.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public static void main(String[] args) {

        FileManager fileManager = new FileManager();
        Scanner sc = new Scanner(System.in);
        String filepath = "Exceptions\\Lesson3\\";

        while (true) {
            System.out.println("Выберите пункт меню:");
            System.out.println("1. Открыть файл");
            System.out.println("2. Записать текст в файл");
            System.out.println("3. Скопировать файл");
            System.out.println("4. Выход");
            String choice = sc.nextLine();

            if (choice.equals("1")) {
                try {
                    System.out.println("Введите имя файла:");
                    String filename = sc.nextLine();
                    String content = fileManager.readFile(filepath + filename);
                    System.out.println("Содержимое файла: ");
                    System.out.println(content);
                } catch (IOException e) {
                    System.err.println("Ошибка при работе с файлом: " + e.getMessage());
                }
            } else if (choice.equals("2")) {
                try {
                    System.out.println("Введите имя файла для записи:");
                    String filename = sc.nextLine();
                    System.out.println("Введите текст для записи в файл:");
                    String newText = sc.nextLine();
                    fileManager.writeFile(filepath+filename, newText);
                    System.out.println("Файл успешно записан.");
                } catch (IOException e) {
                    System.err.println("Ошибка при работе с файлом: " + e.getMessage());
                }
            } else if (choice.equals("3")) {
                try {
                    System.out.println("Введите имя файла источника:");
                    String sourcefile = sc.nextLine();
                    System.out.println("Введите имя файла назначенияЖ");
                    String destfile = sc.nextLine();
                    fileManager.copyFile(filepath+sourcefile, filepath+destfile);
                    System.out.println("Файл успешно скопирован.");
                } catch (IOException e) {
                    System.err.println("Ошибка при работе с файлом: " + e.getMessage());
                }
            } else if (choice.equals("4")) {
                System.out.println("Выход");
                break;
            }

        }
        sc.close();

    }

}