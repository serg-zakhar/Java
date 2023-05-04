package OOP.Lesson1;


public class Chocolate extends Product{

    private int weigth;
    private int calorie;

    public int getWeigth() {
        return weigth;
    }

    public int getCalorie() {
        return calorie;
    }

    public Chocolate(String brand, String name, int price, int weigth, int calorie) {
        super(brand, name, price);
        this.weigth = weigth;
        this.calorie = calorie;
    }

    @Override
    String displayInfo() {
        return String.format("%s - %s - вес: %d - калории: %d", brand, name, weigth, calorie);
    }
}
