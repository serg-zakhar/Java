package OOP.Lesson4;

import java.util.ArrayList;

/**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
 */
public class Homework {
    public static void main(String[] args) {
        // ArrayList<Apple> box1 = new ArrayList<Apple>();
        // box1.add(new Apple());
        // box1.add(new Apple());
        Box<Apple> box1 = new Box<>();
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        System.out.println(box1.getWeight());
        
    }
}

abstract class Fruit{

    private final float weight;

    public float getWeight() {
        return weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }
}

class Apple extends Fruit{

    public Apple() {
        super(1.0f);
    }
}

class Orange extends Fruit{

    public Orange() {
        super(1.5f);
    }
}

class Box<T extends Fruit>{

    // protected int count;
    ArrayList<T> fruits;

    public void addFruit(T fruit) {
        this.fruits.add(fruit);
    }

    // public Box(){
    //     super()
    // }

    public float getWeight(){
        return fruits.size() * this.getWeight();
    }

}

