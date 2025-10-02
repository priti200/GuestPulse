package com.guestpulse.GuestPulse.Model;

public class GuestRequest {
    private String preferences;
    private String feedback;
    private String location;

    // Getters and Setters
    public String getPreferences() { return preferences; }
    public void setPreferences(String preferences) { this.preferences = preferences; }
    public String getFeedback() { return feedback; }
    public void setFeedback(String feedback) { this.feedback = feedback; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}