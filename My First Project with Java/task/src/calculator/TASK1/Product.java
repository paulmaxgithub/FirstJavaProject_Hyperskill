package calculator.TASK1;

public class Product {

    String name;
    float price;
    int earnedAmount;

    public int getEarnedAmount() {
        return earnedAmount;
    }

    Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, int earnedAmount) {
        this.name = name;
        this.earnedAmount = earnedAmount;
    }

    public String getProductAndPrice() {
        return name + ": $" + price;
    }

    public String getProductEarnedAmount() {
        return name + ": $" + earnedAmount;
    }
}
