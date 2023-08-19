package OOP.Toys.model;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import OOP.Toys.classes.Toy;

public class ToysModel {

    private List<Toy> toys;
    private String filename;
    
    public ToysModel(String filename) {
        this.filename = filename;
        // filename = "OOP/Toys/toys.csv";
    }

    public void add(Toy toy) {
        toys.add(toy);
    }

    public List<Toy> getToys() {
        return toys;
    }

    public boolean load(String filename) {
        toys = new LinkedList<>();
        try (FileReader fr = new FileReader(filename)) {
            Scanner sc = new Scanner(fr);
            int i = 0;
            while (sc.hasNextLine()) {
                String row = sc.nextLine();
                if (i >= 0) {
                    String[] fields = row.split("\\|");
                    int id = Integer.parseInt(fields[0].trim());
                    String name = fields[1].trim();
                    int count = Integer.parseInt(fields[2].trim());
                    float price = Float.parseFloat(fields[3].trim());
                    int weight = Integer.parseInt(fields[4].trim());
                    Toy toy = new Toy(id, name, count, price, weight);
                    toys.add(toy);
                }
                i++;
            }
            sc.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return false;
        }
        return true;
    }

    public boolean save(String filename) {
        try {
            FileWriter fr1 = new FileWriter(filename);
            for (Toy toy : toys) {
                fr1.append(toy.getId() + "|" +
                        toy.getName() + "|" +
                        toy.getCount() + "|" +
                        toy.getPrice() + "|" +
                        toy.getWeight() + "\n");
            }
            fr1.close();
            return true;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return false;
        }
    }

    public boolean delete(String filename, int id) {
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toys.remove(toy);
                System.out.println("Игрушка с id=" + id + " успешно удалена.");
                return true;
            }
        }
        System.out.println("Игрушка с id=" + id + " не найдена");
        return false;
    }

    public void changeId(String filename){
        int i = 1;
        for (Toy toy : toys) {
            toy.setId(i);
            i++;
        }
    }

}
