package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseWorker> workers = new ArrayList<>();
        workers.add(new SalaryWorker("John", 45, 500));
        workers.add(new RateWorker("Peter", 30, 5));
        workers.add(new SalaryWorker("Martin", 28, 400));
        workers.add(new RateWorker("Олег", 37, 10));
        workers.add(new SalaryWorker("Иван", 40, 350));

        System.out.println("\nРаспечатываем работников класса BaseWorker из массива workers:\n");
        for (BaseWorker worker : workers) {
            worker.printIncome();
        }

        ArrayList<CompareIncome> compares = new ArrayList<>();
        compares.add(new SalaryWorker("John", 45, 500));
        compares.add(new RateWorker("Peter", 30, 5));
        compares.add(new SalaryWorker("Martin", 28, 400));
        compares.add(new RateWorker("Олег", 37, 10));
        compares.add(new SalaryWorker("Иван", 40, 350));

        System.out.println("\nПрименяем Интерфейс по определению уровня ЗП относительно заданного значения: \n");
        for (CompareIncome compare : compares) {
            compare.compare(500);
        }

        System.out.println("\nПрименяем Comparator по уровню дохода для сортировки массива экземпляров класса BaseWorker: \n");
        workers.sort(new Comparator<>() {
            @Override
            public int compare(BaseWorker baseWorker, BaseWorker o) {
                return Double.compare(baseWorker.countIncome(), o.countIncome());
            }
        });

        for (BaseWorker worker : workers) {
            System.out.println(worker.name + " - " + worker.countIncome());
        }
    }
}