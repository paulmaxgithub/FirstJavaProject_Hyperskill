package calculator.TASK2;

import calculator.TASK1.Product;

public class PrintTotal {

    private double income;

    public double getIncome() {
        calculateIncome();
        return income;
    }

    Product bubblegum       = new Product("Bubblegum", 202);
    Product toffee          = new Product("Toffee", 118);
    Product iceCream        = new Product("Ice cream", 2250);
    Product milkChocolate   = new Product("Milk chocolate", 1680);
    Product doughnut        = new Product("Doughnut", 1075);
    Product pancake         = new Product("Pancake", 80);

    public void printTotalOfProducts() {

        System.out.println("Earned amount:");

        System.out.println(bubblegum.getProductEarnedAmount());
        System.out.println(toffee.getProductEarnedAmount());
        System.out.println(iceCream.getProductEarnedAmount());
        System.out.println(milkChocolate.getProductEarnedAmount());
        System.out.println(doughnut.getProductEarnedAmount());
        System.out.println(pancake.getProductEarnedAmount());

        System.out.println();

        System.out.printf("Income: $%.1f", income);

        System.out.println();
    }

    private void calculateIncome() {
        income += bubblegum.getEarnedAmount();
        income += toffee.getEarnedAmount();
        income += iceCream.getEarnedAmount();
        income += milkChocolate.getEarnedAmount();
        income += doughnut.getEarnedAmount();
        income += pancake.getEarnedAmount();
    }
}
