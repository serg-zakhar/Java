package OOP.Lesson2;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 25);
        Cat cat2 = new Cat("Persik", 10);
        Cat cat3 = new Cat("Murzik", 15);
        Cat[] cats = new Cat[] { cat1, cat2, cat3 };

        Plate plate = new Plate(40);
        plate.info();

        for (Cat cat : cats) {
            cat.info();
            if (plate.getFood() >= cat.getAppetite()) {
                cat.eat(cat.getFulness(), cat.getAppetite());
                plate.setFood(plate.getFood() - cat.getAppetite());
            } else {
                System.out.println("В тарелке не хватает еды!");
            }
            plate.info();
            cat.info();
            System.out.println("---------------");
        }

        System.out.println("Добавили в тарелку 50 еды");
        System.out.println("---------------------");
        plate.addFood(50);

        for (Cat cat : cats) {
            cat.info();
            if (plate.getFood() >= cat.getAppetite()) {
                cat.eat(cat.getFulness(), cat.getAppetite());
                plate.setFood(plate.getFood() - cat.getAppetite());
            } else {
                System.out.println("В тарелке не хватает еды!");
            }
            plate.info();
            cat.info();
            System.out.println("---------------");
        }
    }

}
