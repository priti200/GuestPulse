package com.guestpulse.GuestPulse.Model;

public class Recommendation {
    private String hotel;
    private double adjustedPrice;
    private String reason;
    private String perk;

    // Constructor, Getters, Setters
    public Recommendation(String hotel, double adjustedPrice, String reason, String perk) {
        this.hotel = hotel;
        this.adjustedPrice = adjustedPrice;
        this.reason = reason;
        this.perk = perk;
    }

    public String getHotel() { return hotel; }
    public void setHotel(String hotel) { this.hotel = hotel; }
    public double getAdjustedPrice() { return adjustedPrice; }
    public void setAdjustedPrice(double adjustedPrice) { this.adjustedPrice = adjustedPrice; }
    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }
    public String getPerk() { return perk; }
    public void setPerk(String perk) { this.perk = perk; }
}