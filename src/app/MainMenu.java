package app;

import java.util.List;
import java.util.Scanner;

import com.db4o.ObjectContainer;
import com.db4o.query.Predicate;

import database.DatabaseConnection;
import model.Customer;
import model.MarketingStaff;

public class MainMenu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ObjectContainer db =
                DatabaseConnection.getDatabase();

        int choice;

        do {

            System.out.println("\n=== METRO MARKETERS DATABASE ===");
            System.out.println("1. Show All Customers");
            System.out.println("2. Search Customer By Name");
            System.out.println("3. Show All Marketing Staff");
            System.out.println("4. Exit");
            System.out.print("Choose Menu: ");

            choice = input.nextInt();
            input.nextLine();

            switch(choice) {

            case 1:

                List<Customer> customers = db.query(
                    new Predicate<Customer>() {

                        @Override
                        public boolean match(Customer customer) {

                            return true;
                        }
                    }
                );

                System.out.println("\n=== CUSTOMER LIST ===");

                for(Customer c : customers) {

                    System.out.println(c);
                    System.out.println("-------------------");
                }

                break;

            case 2:

                System.out.print("Enter customer name: ");

                String name = input.nextLine();

                List<Customer> result = db.query(
                    new Predicate<Customer>() {

                        @Override
                        public boolean match(Customer customer) {

                            return customer.getName()
                                    .equalsIgnoreCase(name);
                        }
                    }
                );

                System.out.println("\n=== SEARCH RESULT ===");

                if(result.isEmpty()) {

                    System.out.println("Customer not found.");
                }

                else {

                    for(Customer c : result) {

                        System.out.println(c);
                        System.out.println("-------------------");
                    }
                }

                break;

            case 3:

                List<MarketingStaff> staffs = db.query(
                    new Predicate<MarketingStaff>() {

                        @Override
                        public boolean match(MarketingStaff staff) {

                            return true;
                        }
                    }
                );

                System.out.println("\n=== MARKETING STAFF LIST ===");

                for(MarketingStaff s : staffs) {

                    System.out.println(s);
                    System.out.println("-------------------");
                }

                break;

            case 4:

                System.out.println("Application Closed.");
                break;

            default:

                System.out.println("Invalid Menu.");
            }

        } while(choice != 4);

        db.close();
        input.close();
    }
}