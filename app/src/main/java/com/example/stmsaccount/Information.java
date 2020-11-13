package com.example.stmsaccount;

public class Information {
    private String street;
    private String percentage;

    public Information (String street, String percentage){
        this.street = street;
        this.percentage = percentage;
    }

    public String getStreet() {
        return street;
    }

    public String getPercentage() {
        return percentage;
    }
}
