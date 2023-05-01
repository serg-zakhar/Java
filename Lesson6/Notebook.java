package Lesson6;

public class Notebook {
    private String model;
    private String color;
    String os;
    Integer drive;
    Integer ram;

    public Notebook(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Notebook(String model, String color, String os) {
        this.model = model;
        this.color = color;
        this.os = os;
    }

    public Notebook(String model, String color, String os, Integer drive) {
        this.model = model;
        this.color = color;
        this.os = os;
        this.drive = drive;
    }

    public Notebook(String model, String color, String os, Integer drive, Integer ram) {
        this.model = model;
        this.color = color;
        this.os = os;
        this.drive = drive;
        this.ram = ram;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getOS() {
        return os;
    }

    public Integer getDrive() {
        return drive;
    }

    public Integer getRam() {
        return ram;
    }

    // public void setModel(String model) {
    //     this.model = model;
    // }

    // public void setColor(String color) {
    //     this.color = color;
    // }

    public void setOS(String os) {
        this.os = os;
    }

    public void setDrive(Integer drive) {
        this.drive = drive;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public String toString() {
        return model + ", " + color + ", " + os + ", " + ram + ", " + drive;
    }
}