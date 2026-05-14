package model;

import java.util.Date;

public class Purchase {

    private int purchaseId;
    private Date purchaseDate;
    private int quantity;
    private double totalAmount;
    private String paymentMethod;

    private Customer customer;
    private Product product;

    public Purchase() {
    }

    public Purchase(int purchaseId, Date purchaseDate,
                    int quantity, double totalAmount,
                    String paymentMethod,
                    Customer customer,
                    Product product) {

        this.purchaseId = purchaseId;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
        this.customer = customer;
        this.product = product;
    }

    public double calculateTotal() {
        return quantity * totalAmount;
    }

    @Override
    public String toString() {
        return "Purchase ID: " + purchaseId +
               "\nCustomer: " + customer.getName() +
               "\nProduct: " + product.toString() +
               "\nQuantity: " + quantity +
               "\nTotal: " + totalAmount;
    }
}