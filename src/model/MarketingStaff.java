package model;

public class MarketingStaff {

    private int staffId;
    private String staffName;
    private String position;
    private String email;
    private String department;

    public MarketingStaff() {
    }

    public MarketingStaff(int staffId, String staffName,
                          String position,
                          String email,
                          String department) {

        this.staffId = staffId;
        this.staffName = staffName;
        this.position = position;
        this.email = email;
        this.department = department;
    }

    @Override
    public String toString() {
        return staffName + " - " + position;
    }
}