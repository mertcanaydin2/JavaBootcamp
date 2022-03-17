package FourthDay.T3.entities.concretes;

import FourthDay.T3.entities.abstracts.Entity;

public class Campaign extends Entity {
    private String campaignName;
    private double discountRate;
    private double discountedPrice;

    public Campaign() {
    }

    public Campaign(int id, String campaignName, double discountRate) {
        super(id);
        this.campaignName = campaignName;
        this.discountRate = discountRate;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }
}
