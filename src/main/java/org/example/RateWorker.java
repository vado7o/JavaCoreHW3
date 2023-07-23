package org.example;

public class RateWorker extends BaseWorker implements CompareIncome {
    private int rate;
    public RateWorker(String name, int age, int rate) {
        super(name, age);
        this.rate = rate;
    }
    @Override
    public double countIncome() {
        return 20.8 * 8 * this.rate;
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
