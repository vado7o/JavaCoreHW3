package org.example;

public abstract class BaseWorker {
    protected String name;
    protected int age;
    public BaseWorker(String name, int age) {
        this.name = name;
        this.age = age;
    }
    abstract double countIncome();

    public void printIncome() {
        System.out.println(name + ", возраст " + age + " лет, в месяц имеет доход, равный $" + countIncome());
    }

}
