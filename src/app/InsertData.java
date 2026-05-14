package app;

import java.util.Date;

import com.db4o.ObjectContainer;

import database.DatabaseConnection;
import model.*;

public class InsertData {

    public static void main(String[] args) {

        ObjectContainer db = DatabaseConnection.getDatabase();

        Segment segment =
                new Segment(1,
                        "Young Professionals",
                        "Urban workers",
                        "Age 20-35");

                CustomerProfile profile =
                new CustomerProfile(1, "Urban", "Beauty & Fashion", "Skincare", "Gold");

        Customer customer =
                new Customer(1, "Alice Tan", "alice@email.com", "08123456789",
                        "Jakarta", 28, "Female", "Marketing Executive", 8500000);

        customer.setSegment(segment);
        customer.setProfile(profile);

                Customer customer2 =
                new Customer(2, "Arohib Firdaus", "arohib@email.com", "0811111111",
                        "Bekasi", 22, "Male", "Student", 3500000);

        CustomerProfile profile2 =
                new CustomerProfile(2, "Digital Lifestyle", "Technology", "Electronics", "Silver");

        customer2.setSegment(segment);
        customer2.setProfile(profile2);

                Customer customer3 =
                new Customer(3, "Elliya Wulandari", "elliya@email.com", "0822222222",
                        "Jakarta", 24, "Female", "Graphic Designer", 6000000);

        CustomerProfile profile3 =
                new CustomerProfile(3, "Creative Lifestyle", "Fashion", "Beauty", "Gold");

        customer3.setSegment(segment);
        customer3.setProfile(profile3);

              Customer customer4 =
                new Customer(4, "Brian Lee", "brian@email.com", "0833333333",
                        "Bandung", 31, "Male", "Software Engineer", 12000000);

        CustomerProfile profile4 =
                new CustomerProfile(4, "Tech Lifestyle", "Gaming", "Electronics", "Platinum");

        customer4.setSegment(segment);
        customer4.setProfile(profile4);

                Customer customer5 =
                new Customer(5, "Catherine Lim", "catherine@email.com", "0844444444",
                        "Surabaya", 26, "Female", "Fashion Stylist", 7500000);

        CustomerProfile profile5 =
                new CustomerProfile(5, "Luxury Lifestyle", "Fashion", "Beauty", "Gold");

        customer5.setSegment(segment);
        customer5.setProfile(profile5);

                Customer customer6 =
                new Customer(6, "Daniel Wijaya", "daniel@email.com", "0855555555",
                        "Medan", 29, "Male", "Entrepreneur", 15000000);

        CustomerProfile profile6 =
                new CustomerProfile(6, "Business Lifestyle", "Investment", "Finance", "Platinum");

        customer6.setSegment(segment);
        customer6.setProfile(profile6);

                Customer customer7 =
                new Customer(7, "Farah Putri", "farah@email.com", "0866666666",
                        "Yogyakarta", 23, "Female", "Content Creator", 5000000);

        CustomerProfile profile7 =
                new CustomerProfile(7, "Social Media Lifestyle", "Travel", "Fashion", "Silver");

        customer7.setSegment(segment);
        customer7.setProfile(profile7);

                Customer customer8 =
                new Customer(8, "George Tan", "george@email.com", "0877777777",
                        "Semarang", 35, "Male", "Manager", 18000000);

        CustomerProfile profile8 =
                new CustomerProfile(8, "Executive Lifestyle", "Automotive", "Luxury", "Gold");

        customer8.setSegment(segment);
        customer8.setProfile(profile8);

                Customer customer9 =
                new Customer(9, "Hana Saputra", "hana@email.com", "0888888888",
                        "Bali", 27, "Female", "Photographer", 6500000);

        CustomerProfile profile9 =
                new CustomerProfile(9, "Creative Lifestyle", "Photography", "Travel", "Silver");

        customer9.setSegment(segment);
        customer9.setProfile(profile9);

                Customer customer10 =
                new Customer(10, "Ivan Gunawan", "ivan@email.com", "0899999999",
                        "Makassar", 33, "Male", "Architect", 11000000);

        CustomerProfile profile10 =
                new CustomerProfile(10, "Professional Lifestyle", "Architecture", "Home Design", "Gold");

        customer10.setSegment(segment);
        customer10.setProfile(profile10);

        Product product =
                new Product(1,
                        "Premium Skincare",
                        "Beauty",
                        250000,
                        "GlowCare");

                MarketingStaff staffMarie =
                new MarketingStaff(1,
                        "Marie Weber",
                        "Data Administrator",
                        "marie@metro.com",
                        "Marketing Data");

        MarketingStaff staffMonica =
                new MarketingStaff(2,
                        "Monica Lopez",
                        "Oracle Database Administrator Candidate",
                        "monica@metro.com",
                        "Database Administration");

        MarketingStaff staffGerald =
                new MarketingStaff(3,
                        "Gerald Bruester",
                        "Marketing Database Administrator Candidate",
                        "gerald@metro.com",
                        "Marketing Database");

        MarketingStaff staffJim =
                new MarketingStaff(4,
                        "Jim Reedy",
                        "Project Manager",
                        "jim@metro.com",
                        "System Development");

        Channel channel =
                new Channel(1,
                        "Instagram Ads",
                        "Social Media",
                        "Instagram");

        Campaign campaign =
                new Campaign(1,
                        "Beauty Promo May",
                        "Increase skincare sales",
                        new Date(),
                        new Date(),
                        5000000,
                        "Active",
                        segment,
                        channel,
                        staffMarie);

        Purchase purchase =
                new Purchase(1,
                        new Date(),
                        2,
                        500000,
                        "Credit Card",
                        customer,
                        product);

        db.store(segment);

        db.store(profile);
        db.store(customer);

        db.store(profile2);
        db.store(customer2);

        db.store(profile3);
        db.store(customer3);

        db.store(profile4);
        db.store(customer4);

        db.store(profile5);
        db.store(customer5);

        db.store(profile6);
        db.store(customer6);

        db.store(profile7);
        db.store(customer7);

        db.store(profile8);
        db.store(customer8);

        db.store(profile9);
        db.store(customer9);

        db.store(profile10);
        db.store(customer10);

        db.store(product);

        db.store(staffMarie);
        db.store(staffMonica);
        db.store(staffGerald);
        db.store(staffJim);

        db.store(channel);
        db.store(campaign);
        db.store(purchase);

        System.out.println("Data inserted successfully!");

        db.close();
    }
}