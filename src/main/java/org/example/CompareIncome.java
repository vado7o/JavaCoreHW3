package org.example;

public interface CompareIncome {
    String getName();
    double getIncome();

    default void compare(double income) {
        if (income == getIncome()) {
            System.out.printf("%s зарабатывает ровно $%f\n", getName(), income);
        }
        else if (income < getIncome()) {
            System.out.printf("%s зарабатывает больше чем $%f\n", getName(), income);
        }
        else if (income > getIncome()) {
            System.out.printf("%s зарабатывает меньше чем $%f\n", getName(), income);
        }
    }
}
