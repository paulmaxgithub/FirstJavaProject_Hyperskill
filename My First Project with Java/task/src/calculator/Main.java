package calculator;

import calculator.TASK1.PrintPrices;
import calculator.TASK2.PrintTotal;
import calculator.TASK3.PrintExpenses;

public class Main {
    public static void main(String[] args) {

        /*
        Use the following methods to perform some cases
        By default, the last method is open
         */
        //getPrices_TASK1();
        //getProductsIncome_TASK2();
        getExpenses_TASK3();
    }

    private static void getPrices_TASK1() {
        PrintPrices printPrices = new PrintPrices();
        printPrices.getProductsAndPrices();
    }

    private static void getProductsIncome_TASK2() {
        PrintTotal printTotal = new PrintTotal();
        printTotal.printTotalOfProducts();
    }

    private static void getExpenses_TASK3() {
        PrintTotal printTotal = new PrintTotal();
        var income = printTotal.getIncome();

        printTotal.printTotalOfProducts();

        PrintExpenses printExpenses = new PrintExpenses();
        printExpenses.printExpenses(income);
    }
}