package OOP.Lesson2;

public class Cat {

    private String name;
    private int appetite;
    private int fulness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fulness = 0;
    }

    public void eat(int fulness, int appetite) {
        this.fulness = fulness + appetite;
    }

    public void info() {
        System.out.println("Кот по кличке " + name + " с уровнем аппетита: " + appetite + " и сытостью: "+ fulness);
    }

    public int getAppetite() {
        return appetite;
    }

    public int getFulness() {
        return fulness;
    }

    // public void setFulness(int fulness, int appetite) {
    //     this.fulness = fulness + appetite;
    // }
}
