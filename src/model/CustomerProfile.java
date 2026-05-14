package model;

public class CustomerProfile {

    private int profileId;
    private String lifestyle;
    private String interest;
    private String preferredCategory;
    private String loyaltyLevel;

    public CustomerProfile() {
    }

    public CustomerProfile(int profileId, String lifestyle,
                           String interest,
                           String preferredCategory,
                           String loyaltyLevel) {

        this.profileId = profileId;
        this.lifestyle = lifestyle;
        this.interest = interest;
        this.preferredCategory = preferredCategory;
        this.loyaltyLevel = loyaltyLevel;
    }

    @Override
    public String toString() {
        return lifestyle + " - " + interest;
    }
}