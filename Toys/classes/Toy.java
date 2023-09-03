package Toys.classes;

public class Toy{

    private int id;
    private String name;
    private float price;
    private int weight;
    private int count;
    
    public Toy(int id, String name, int count, float price, int weight) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.price = price;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public float getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    @Override
    public String toString() {
        return "[id=" + id + ", name=" + name + ", count=" + count + 
                ", price=" + price + ", weight=" + weight + "]";
    }

}
