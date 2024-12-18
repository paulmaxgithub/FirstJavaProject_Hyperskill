package calculator.TASK1;

public class PrintPrices {

    Product bubblegum       = new Product("Bubblegum", 2);
    Product toffee          = new Product("Toffee", 0.2F);
    Product iceCream        = new Product("Ice cream", 5);
    Product milkChocolate   = new Product("Milk chocolate", 4);
    Product doughnut        = new Product("Doughnut", 2.5F);
    Product pancake         = new Product("Pancake", 3.2F);

        public void getProductsAndPrices() {

            System.out.println("Prices:");

            System.out.println(bubblegum.getProductAndPrice());
            System.out.println(toffee.getProductAndPrice());
            System.out.println(iceCream.getProductAndPrice());
            System.out.println(milkChocolate.getProductAndPrice());
            System.out.println(doughnut.getProductAndPrice());
            System.out.println(pancake.getProductAndPrice());
    }
}
