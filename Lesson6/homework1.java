package Lesson6;

import java.util.LinkedHashMap;
import java.util.Scanner;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. 
// Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, 
// отвечающие фильтру.

// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - 
// сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих

public class homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Notebook notebook1 = new Notebook("Lenovo", "Black");
        Notebook notebook2 = new Notebook("HP", "White", "Windows 10");
        Notebook notebook3 = new Notebook("HP", "Grey", "Windows 11", 2000);
        Notebook notebook4 = new Notebook("Asus", "Black", "Linux", 500, 8);
        Notebook notebook5 = new Notebook("Acer", "Red", "Windows 10", 1000, 8);
        // HashSet db = new HashSet<>();
        // db.add(notebook5);
        System.out.println("Просьба ввести недостающие параметры:");
        System.out.println("Ноутбук: " + notebook1);
        System.out.println("Выберите операционную систему:");
        System.out.println("1. Windows 10");
        System.out.println("2. Windows 11");
        System.out.println("3. Linux");
        System.out.println("4. Без ОС");
        setOS(Integer.parseInt(sc.nextLine()), notebook1);
        System.out.println("Введите объем ЖД:");
        setDrive(Integer.parseInt(sc.nextLine()), notebook1);
        System.out.println("Введите объем ОЗУ:");
        setRam(Integer.parseInt(sc.nextLine()), notebook1);

        System.out.println("Просьба ввести недостающие параметры:");
        System.out.println("Ноутбук: " + notebook2);
        System.out.println("Введите объем ЖД:");
        setDrive(Integer.parseInt(sc.nextLine()), notebook2);
        System.out.println("Введите объем ОЗУ:");
        setRam(Integer.parseInt(sc.nextLine()), notebook2);

        System.out.println("Просьба ввести недостающие параметры:");
        System.out.println("Ноутбук: " + notebook3);
        System.out.println("Введите объем ОЗУ:");
        setRam(Integer.parseInt(sc.nextLine()), notebook3);

        LinkedHashMap<Integer, Integer> result = mainMenu();
        showSearch(result, notebook1);
        showSearch(result, notebook2);
        showSearch(result, notebook3);
        showSearch(result, notebook4);
        showSearch(result, notebook5);


        // System.out.println(db);
        // System.out.println(notebook1);
    }

    public static LinkedHashMap<Integer, Integer> mainMenu() {
        LinkedHashMap<Integer, Integer> search = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        String choise = sc.nextLine();
        search.put(1, Integer.parseInt(choise));
        if (choise.equals("1")) {
            System.out.println("Введите минимальный объем ОЗУ:");
            choise = sc.nextLine();
            search.put(2, Integer.parseInt(choise));
            sc.close();
            return search;
        } else if (choise.equals("2")) {
            System.out.println("Введите минимальный объем ЖД:");
            choise = sc.nextLine();
            search.put(2, Integer.parseInt(choise));
            sc.close();
            return search;
        } else if (choise.equals("3")) {
            System.out.println("Выберите операционную систему:");
            System.out.println("1. Windows 10");
            System.out.println("2. Windows 11");
            System.out.println("3. Linux");
            System.out.println("4. Без ОС");
            choise = sc.nextLine();
            search.put(2, Integer.parseInt(choise));
            sc.close();
            return search;
        } else if (choise.equals("4")) {
            System.out.println("Выберите цвет:");
            System.out.println("1. Белый>");
            System.out.println("2. Черный");
            System.out.println("3. Серый");
            System.out.println("4. Красный");
            choise = sc.nextLine();
            search.put(2, Integer.parseInt(choise));
            sc.close();
            return search;
        } else {
            sc.close();
            return search;
        }
    }

    public static void showSearch(LinkedHashMap<Integer, Integer> choise, Notebook note) {
        int param = choise.get(1);
        int value = choise.get(2);
        if (param == 1) {
            if (note.getRam() >= value) System.out.println(note);
        } else if (param == 2) {
            if (note.getDrive() >= value) System.out.println(note);
        } else if (param == 3) {
            if (value == 1) {
                if (note.getOS().equals("Windows 10")) System.out.println(note);
            } else if (value == 2) {
                if (note.getOS().equals("Windows 11")) System.out.println(note);
            } else if (value == 3) {
                if (note.getOS().equals("Linux")) System.out.println(note);
            } else if (value == 4) {
                if (note.getOS().equals("Без ОС")) System.out.println(note);
            }
        } else if (param == 4) {
            if (value == 1) {
                if (note.getColor().equals("White")) System.out.println(note);
            } else if (value == 2) {
                if (note.getColor().equals("Black")) System.out.println(note);
            } else if (value == 3) {
                if (note.getColor().equals("Grey")) System.out.println(note);
            } else if (value == 4) {
                if (note.getColor().equals("Red")) System.out.println(note);
            }
        }
    }

    public static void setOS(int choise, Notebook note) {
        if (choise == 1) note.setOS("Windows 10");
        else if (choise == 2) note.setOS("Windows 11");
        else if (choise == 3) note.setOS("Linux");
        else note.setOS("Без ОС");
    }

    public static void setDrive(int value, Notebook note) {
        note.setDrive(value);
    }

    public static void setRam(int value, Notebook note) {
        note.setRam(value);
    }
}

