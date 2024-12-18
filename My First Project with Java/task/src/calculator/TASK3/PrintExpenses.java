package calculator.TASK3;

import java.util.Scanner;

public class PrintExpenses {

    private Scanner scanner = new Scanner(System.in);

    private int staffExpenses;
    private int otherExpenses;

    public void printExpenses(Double income) {

        System.out.println("Staff expenses:");

        staffExpenses = scanner.nextInt();

        System.out.println("Other expenses:");

        otherExpenses = scanner.nextInt();

        System.out.println("Net income: $" +calculateExpenses(income));
    }

    private int calculateExpenses(Double income) {
        return (int) (income - staffExpenses - otherExpenses);
    }
}
