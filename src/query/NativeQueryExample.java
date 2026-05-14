package query;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.db4o.ObjectContainer;
import com.db4o.query.Predicate;

import database.DatabaseConnection;
import model.*;

public class NativeQueryExample {

    public static void main(String[] args) {

        ObjectContainer db = DatabaseConnection.getDatabase();

        System.out.println("=== 12 NATIVE QUERIES ===");

        printCustomerResult("Native 1 - Show all customers",
                db.query(new Predicate<Customer>() {
                    public boolean match(Customer c) {
                        return true;
                    }
                }));

        printCustomerResult("Native 2 - Customers from Jakarta",
                db.query(new Predicate<Customer>() {
                    public boolean match(Customer c) {
                        return c.toString().contains("Jakarta");
                    }
                }));

        printCustomerResult("Native 3 - Customer by name Arohib Firdaus",
                db.query(new Predicate<Customer>() {
                    public boolean match(Customer c) {
                        return c.getName().equalsIgnoreCase("Arohib Firdaus");
                    }
                }));

        printCustomerResult("Native 4 - Customers with income above 10 million",
                db.query(new Predicate<Customer>() {
                    public boolean match(Customer c) {
                        return c.toString().contains("1.2E7") ||
                               c.toString().contains("1.5E7") ||
                               c.toString().contains("1.8E7") ||
                               c.toString().contains("1.1E7");
                    }
                }));

        printCustomerResult("Native 5 - Customers with occupation Student",
                db.query(new Predicate<Customer>() {
                    public boolean match(Customer c) {
                        return c.toString().contains("Student");
                    }
                }));

        printCustomerResult("Native 6 - Customers from Bekasi or Bandung",
                db.query(new Predicate<Customer>() {
                    public boolean match(Customer c) {
                        return c.toString().contains("Bekasi") ||
                               c.toString().contains("Bandung");
                    }
                }));

        printStaffResult("Native 7 - Show all marketing staff",
                db.query(new Predicate<MarketingStaff>() {
                    public boolean match(MarketingStaff s) {
                        return true;
                    }
                }));

        printStaffResult("Native 8 - Staff with position Project Manager",
                db.query(new Predicate<MarketingStaff>() {
                    public boolean match(MarketingStaff s) {
                        return s.toString().contains("Project Manager");
                    }
                }));

        printProductResult("Native 9 - Product category Beauty",
                db.query(new Predicate<Product>() {
                    public boolean match(Product p) {
                        return p.toString().contains("Premium Skincare");
                    }
                }));

        printSegmentResult("Native 10 - Segment Young Professionals",
                db.query(new Predicate<Segment>() {
                    public boolean match(Segment s) {
                        return s.toString().contains("Young Professionals");
                    }
                }));

        List<Customer> sortedCustomers = new ArrayList<Customer>(
                db.query(new Predicate<Customer>() {
                    public boolean match(Customer c) {
                        return true;
                    }
                })
        );

        sortedCustomers.sort(new Comparator<Customer>() {
            public int compare(Customer c1, Customer c2) {
                return c1.getName().compareToIgnoreCase(c2.getName());
            }
        });

        printCustomerResult("Native 11 - Customers sorted by name", sortedCustomers);

        printCustomerResult("Native 12 - Professional customers",
                db.query(new Predicate<Customer>() {
                    public boolean match(Customer c) {
                        return c.toString().contains("Architect") ||
                               c.toString().contains("Manager") ||
                               c.toString().contains("Entrepreneur");
                    }
                }));

        db.close();
    }

    public static void printCustomerResult(String title, List<Customer> result) {
        System.out.println("\n" + title);
        System.out.println("----------------------------");

        if (result.isEmpty()) {
            System.out.println("No data found.");
        }

        for (Customer c : result) {
            System.out.println(c);
            System.out.println("----------------------------");
        }
    }

    public static void printStaffResult(String title, List<MarketingStaff> result) {
        System.out.println("\n" + title);
        System.out.println("----------------------------");

        if (result.isEmpty()) {
            System.out.println("No data found.");
        }

        for (MarketingStaff s : result) {
            System.out.println(s);
            System.out.println("----------------------------");
        }
    }

    public static void printProductResult(String title, List<Product> result) {
        System.out.println("\n" + title);
        System.out.println("----------------------------");

        if (result.isEmpty()) {
            System.out.println("No data found.");
        }

        for (Product p : result) {
            System.out.println(p);
            System.out.println("----------------------------");
        }
    }

    public static void printSegmentResult(String title, List<Segment> result) {
        System.out.println("\n" + title);
        System.out.println("----------------------------");

        if (result.isEmpty()) {
            System.out.println("No data found.");
        }

        for (Segment s : result) {
            System.out.println(s);
            System.out.println("----------------------------");
        }
    }
}