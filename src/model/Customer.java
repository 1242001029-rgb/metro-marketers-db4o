package model;

import java.util.List;

public class Customer {

    private int customerId;
    private String name;
    private String email;
    private String phone;
    private String city;
    private int age;
    private String gender;
    private String occupation;
    private double income;

    private Segment segment;
    private CustomerProfile profile;
    private List<Purchase> purchases;

    public Customer() {
    }

    public Customer(int customerId, String name, String email, String phone,
                    String city, int age, String gender,
                    String occupation, double income) {

        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.city = city;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.income = income;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Segment getSegment() {
        return segment;
    }

    public void setSegment(Segment segment) {
        this.segment = segment;
    }

    public CustomerProfile getProfile() {
        return profile;
    }

    public void setProfile(CustomerProfile profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId +
               "\nName: " + name +
               "\nCity: " + city +
               "\nOccupation: " + occupation +
               "\nIncome: " + income;
    }
}