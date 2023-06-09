package OOP.Lesson3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class HW3 {

    private static Random random = new Random();

    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int workerSalary = random.nextInt(100) + 200;
        int freelancerSalary = 1500;
        int index = random.nextInt(20) + 30;
        int hours = random.nextInt(20) + 20;
        int typeWorker = random.nextInt(2);
        int age = random.nextInt(20) + 20;
        // System.out.println(typeWorker);

        if (typeWorker == 1) {
            return new Worker(names[random.nextInt(10)], surnames[random.nextInt(10)], workerSalary * index, age);
        } else {
            return new Freelancer(names[random.nextInt(10)], surnames[random.nextInt(10)], freelancerSalary, age, hours);
        }
    }
    public static void main(String[] args) {

        // Worker worker = new Worker("Анатолий", "Шестаков", 80000);
        // System.out.println(worker);

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++)
            employees[i] = generateEmployee();

        for (Employee employee : employees){
            System.out.println(employee);
        }

        Arrays.sort(employees, new NameComparator());
        System.out.printf("\n*** Отсортированный массив сотрудников по имени, фамилии ***\n\n");
        for (Employee employee : employees){
            System.out.println(employee);
        }

        Arrays.sort(employees, new AgeComparator());
        System.out.printf("\n*** Отсортированный массив сотрудников по возрасту ***\n\n");
        for (Employee employee : employees){
            System.out.println(employee);
        }

        Arrays.sort(employees, new SalaryComparator());
        System.out.printf("\n*** Отсортированный массив сотрудников по зарплате ***\n\n");
        for (Employee employee : employees){
            System.out.println(employee);
        }

    }
    
}

class SalaryComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {

        //return o1.calculateSalary() == o2.calculateSalary() ? 0 : (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);
        return Double.compare( o2.calculateSalary(), o1.calculateSalary());
    }
}

class NameComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        //return o1.calculateSalary() == o2.calculateSalary() ? 0 : (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);
        int res = o1.name.compareTo(o2.name);
        if (res == 0){
            res = o1.surName.compareTo(o2.surName);
        }
        return res;
    }
}

class AgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.age, o2.age);
    }
}

abstract class Employee implements Comparable<Employee>{

    protected String name;
    protected String surName;
    protected double salary;
    protected int age;

    public Employee(String name, String surName, double salary, int age) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    public abstract  double calculateSalary();

    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s, возраст %d лет: Среднемесячная заработная плата: %.2f", name, surName, age, salary);
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare( o.calculateSalary(), calculateSalary());
    }

}

class Worker extends Employee {

    public Worker(String name, String surName, double salary, int age) {
        super(name, surName, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary ;
        //TODO: Для фрилансера - return 20 * 5 * salary
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий, возраст %d лет: Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)", name, surName, age, salary);
    }
}

class Freelancer extends Employee{

    int hours;

    public Freelancer(String name, String surName, double salary, int age, int hours) {
        super(name, surName, salary, age);
        this.hours = hours;
    }

    @Override
    public double calculateSalary() {
        return salary * hours;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер, возраст %d лет; Среднемесячная заработная плата (оплата за отработанное время): %.2f (руб.)", name, surName, age, calculateSalary());
    }
}
