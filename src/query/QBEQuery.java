package query;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import database.DatabaseConnection;
import model.*;

public class QBEQuery {

    public static void main(String[] args) {

        ObjectContainer db = DatabaseConnection.getDatabase();

        System.out.println("=== 12 QBE QUERIES ===");

                printResult("QBE 1 - Customer by name Alice Tan",
                db.queryByExample(new Customer(0, "Alice Tan", null, null, null, 0, null, null, 0)));

                printResult("QBE 2 - Customer from Jakarta",
                db.queryByExample(new Customer(0, null, null, null, "Jakarta", 0, null, null, 0)));

                printResult("QBE 3 - Female customer",
                db.queryByExample(new Customer(0, null, null, null, null, 0, "Female", null, 0)));

                printResult("QBE 4 - Customer occupation Student",
                db.queryByExample(new Customer(0, null, null, null, null, 0, null, "Student", 0)));

                printResult("QBE 5 - Product category Beauty",
                db.queryByExample(new Product(0, null, "Beauty", 0, null)));

                printResult("QBE 6 - Product brand GlowCare",
                db.queryByExample(new Product(0, null, null, 0, "GlowCare")));

                printResult("QBE 7 - Segment Young Professionals",
                db.queryByExample(new Segment(0, "Young Professionals", null, null)));

                printResult("QBE 8 - Segment criteria Age 20-35",
                db.queryByExample(new Segment(0, null, null, "Age 20-35")));

                printResult("QBE 9 - Campaign status Active",
                db.queryByExample(new Campaign(0, null, null, null, null, 0, "Active", null, null, null)));

              printResult("QBE 10 - Campaign Beauty Promo May",
                db.queryByExample(new Campaign(0, "Beauty Promo May", null, null, null, 0, null, null, null, null)));

                printResult("QBE 11 - Staff Marie Weber",
                db.queryByExample(new MarketingStaff(0, "Marie Weber", null, null, null)));

                printResult("QBE 12 - Staff Project Manager",
                db.queryByExample(new MarketingStaff(0, null, "Project Manager", null, null)));

        db.close();
    }

    public static void printResult(String title, ObjectSet<?> result) {

        System.out.println("\n" + title);
        System.out.println("----------------------------");

        if (!result.hasNext()) {
            System.out.println("No data found.");
        }

        while (result.hasNext()) {
            System.out.println(result.next());
        }
    }
}