package model;

import java.util.Date;

public class Campaign {

    private int campaignId;
    private String campaignName;
    private String objective;
    private Date startDate;
    private Date endDate;
    private double budget;
    private String status;

    private Segment targetSegment;
    private Channel channel;
    private MarketingStaff staff;

    public Campaign() {
    }

    public Campaign(int campaignId, String campaignName,
                    String objective,
                    Date startDate, Date endDate,
                    double budget, String status,
                    Segment targetSegment,
                    Channel channel,
                    MarketingStaff staff) {

        this.campaignId = campaignId;
        this.campaignName = campaignName;
        this.objective = objective;
        this.startDate = startDate;
        this.endDate = endDate;
        this.budget = budget;
        this.status = status;
        this.targetSegment = targetSegment;
        this.channel = channel;
        this.staff = staff;
    }

    @Override
    public String toString() {
        return campaignName + " (" + status + ")";
    }
}