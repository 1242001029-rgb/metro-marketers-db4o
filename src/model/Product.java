package model;

public class Product {

    private int productId;
    private String productName;
    private String category;
    private double price;
    private String brand;

    public Product() {
    }

    public Product(int productId, String productName,
                   String category, double price,
                   String brand) {

        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return productName + " - " + price;
    }
}