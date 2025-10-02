package com.guestpulse.GuestPulse.Model;
import java.util.List;

public class GuestResponse {
    private List<Recommendation> recommendations;
    private String aiInsight;
    private double retentionBoost;

    // Getters and Setters
    public List<Recommendation> getRecommendations() { return recommendations; }
    public void setRecommendations(List<Recommendation> recommendations) { this.recommendations = recommendations; }
    public String getAiInsight() { return aiInsight; }
    public void setAiInsight(String aiInsight) { this.aiInsight = aiInsight; }
    public double getRetentionBoost() { return retentionBoost; }
    public void setRetentionBoost(double retentionBoost) { this.retentionBoost = retentionBoost; }
}