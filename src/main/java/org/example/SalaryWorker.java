package org.example;

public class SalaryWorker extends BaseWorker implements CompareIncome {

    private int salary;
    public SalaryWorker(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }
    @Override
    public double countIncome() {
        return salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getIncome() {
        return countIncome();
    }

}
