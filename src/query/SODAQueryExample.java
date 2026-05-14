package query;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;

import database.DatabaseConnection;
import model.*;

public class SODAQueryExample {

    public static void main(String[] args) {

        ObjectContainer db = DatabaseConnection.getDatabase();

        System.out.println("=== 12 SODA QUERIES ===");

                Query q1 = db.query();
        q1.constrain(Customer.class);
        printResult("SODA 1 - Show all customers", q1.execute());

                Query q2 = db.query();
        q2.constrain(Customer.class);
        q2.descend("name").constrain("Alice Tan");
        printResult("SODA 2 - Customer name Alice Tan", q2.execute());

                Query q3 = db.query();
        q3.constrain(Customer.class);
        q3.descend("city").constrain("Jakarta");
        printResult("SODA 3 - Customers from Jakarta", q3.execute());

                Query q4 = db.query();
        q4.constrain(Customer.class);
        q4.descend("gender").constrain("Female");
        printResult("SODA 4 - Female customers", q4.execute());

                Query q5 = db.query();
        q5.constrain(Customer.class);
        q5.descend("occupation").constrain("Student");
        printResult("SODA 5 - Occupation Student", q5.execute());

              Query q6 = db.query();
        q6.constrain(Customer.class);
        q6.descend("city").constrain("Jakarta").not();
        printResult("SODA 6 - Customers not from Jakarta", q6.execute());

                Query q7 = db.query();
        q7.constrain(Customer.class);
        q7.descend("income").constrain(10000000.0).greater();
        printResult("SODA 7 - Income greater than 10 million", q7.execute());

                Query q8 = db.query();
        q8.constrain(Customer.class);
        q8.descend("income").constrain(7000000.0).smaller();
        printResult("SODA 8 - Income less than 7 million", q8.execute());

                Query q9 = db.query();
        q9.constrain(Customer.class);
        q9.descend("city").constrain("Jakarta");
        q9.descend("gender").constrain("Female");
        printResult("SODA 9 - Jakarta and Female customers", q9.execute());

                Query q10 = db.query();
        q10.constrain(Customer.class);
        q10.descend("city").constrain("Bekasi")
                .or(q10.descend("city").constrain("Bandung"));
        printResult("SODA 10 - Customers from Bekasi or Bandung", q10.execute());

                Query q11 = db.query();
        q11.constrain(Customer.class);
        q11.descend("name").orderAscending();
        printResult("SODA 11 - Customers sorted by name", q11.execute());

                Query q12 = db.query();
        q12.constrain(MarketingStaff.class);
        q12.descend("position").constrain("Project Manager");
        printResult("SODA 12 - Staff position Project Manager", q12.execute());

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
            System.out.println("----------------------------");
        }
    }
}