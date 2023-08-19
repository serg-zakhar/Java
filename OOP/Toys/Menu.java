package OOP.Toys;

import java.util.Scanner;

import OOP.Toys.classes.Toy;
import OOP.Toys.model.ToysModel;
import OOP.Toys.view.ToysView;

public class Menu {

    public void mainMenu(){
        boolean showMenu = true;
        Scanner sc = new Scanner(System.in);

        while (showMenu) {   

            String filename = "OOP/Toys/toys.csv";       
            System.out.println("Выберите пункт меню:");
            System.out.println("1 - Вывести список игрушек");
            System.out.println("2 - Добавить игрушку");
            System.out.println("3 - Удалить игрушку");
            System.out.println("4 - Меню розыгрыша");
            System.out.println("5 - Выход");
            String choise = sc.nextLine();

            if (choise.equals("1")) { // Вывод игрушек

                ToysModel toysModel = new ToysModel(filename);
                if (toysModel.load(filename)) {
                    ToysView toysView = new ToysView(toysModel.getToys());
                    toysView.ShowToys();
                }

            } else if (choise.equals("2")){ // Добавление

                ToysModel toysModel = new ToysModel(filename);
                int id = 1;
                if (toysModel.load(filename)) {
                    id = toysModel.getToys().size() + 1;
                }
                System.out.println("Добавление игрушки. Введите значения полей:");
                try {
                    System.out.print("Название: ");
                    String name = sc.nextLine();
                    System.out.print("Количество: ");
                    int count = Integer.parseInt(sc.nextLine());
                    System.out.print("Цена: ");
                    float price = Float.parseFloat(sc.nextLine());
                    System.out.print("Вес: ");
                    int weight = Integer.parseInt(sc.nextLine());
                    Toy toy = new Toy(id, name, count, price, weight);
                    toysModel.add(toy);
                } catch (Exception ex) {
                    System.out.println("Ошибка при вводе данных.\n" + ex.toString());
                }

                if (toysModel.save(filename)) {
                    System.out.println("Новая игрушка успешно добавлена!");
                } else {
                    System.out.println("Ошибка при добавлении новой игрушки.");
                }

            } else if (choise.equals("3")){ // Удаление

                ToysModel toysModel = new ToysModel(filename);
                if (toysModel.load(filename)) {
                    ToysView toysView = new ToysView(toysModel.getToys());
                    toysView.ShowToys();
                }
                System.out.print("Выберите id удаляемой игрушки: ");
                try {
                    int id = Integer.parseInt(sc.nextLine());
                    if (toysModel.delete(filename, id)) {
                        toysModel.changeId(filename);
                        toysModel.save(filename);
                    }
                } catch (Exception ex) {
                    System.out.println("Ошибка при удалении игрушки.\n" + ex.toString());
                }

            } else if (choise.equals("4")){ // Подменю розыгрыш

                boolean subMenu = true;

                while (subMenu) {

                    filename = "OOP/Toys/toysprize.csv";
                    System.out.println("Меню розыгрыша. Выберите пункт:");
                    System.out.println("1 - Вывести список всех игрушек");
                    System.out.println("2 - Вывести список игрушек в розыгрыше");
                    System.out.println("3 - Добавить игрушку в розыгрыш");
                    System.out.println("4 - Удалить игрушку из розыгрыша");
                    System.out.println("5 - Розыгрыш игрушек");
                    System.out.println("6 - Выход в предыдущее меню");
                    choise = sc.nextLine();

                    if (choise.equals("1")){ // Вывод всех

                        filename = "OOP/Toys/toys.csv";
                        ToysModel toysModel = new ToysModel(filename);
                        if (toysModel.load(filename)) {
                            ToysView toysView = new ToysView(toysModel.getToys());
                            toysView.ShowToys();
                        } else {
                            System.out.println("Список пуст.");
                        }

                    } else if (choise.equals("2")){ // Вывод розыгрыша

                        ToysModel toysModel = new ToysModel(filename);
                        if (toysModel.load(filename)) {
                            ToysView toysView = new ToysView(toysModel.getToys());
                            toysView.ShowToys();
                        } else {
                            System.out.println("Список пуст.");
                        }

                    } else if (choise.equals("3")){ // Довавить



                    } else if (choise.equals("4")){ // Удалить



                    } else if (choise.equals("5")){ // Розыгрыш

                        

                    } else if (choise.equals("6")){ // Выход
                        subMenu = false;
                    }
                }

            } else if (choise.equals("5")){ // Выход
                showMenu = false;
            }
        }
        sc.close();
    }
    
}
