package com.in28minutes.microservices.currency_conversion_service;

public class CurrencyConversion {
    private int id;
    private String from;
    private String to;
    private double conversionMultiple;
    private double quantity;
    private double totalCalculatedAmount;
    private String environment;

    public CurrencyConversion(int id, String from, String to, double conversionMultiple, double quantity, double totalCalculatedAmount, String environment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.quantity = quantity;
        this.totalCalculatedAmount = totalCalculatedAmount;
        this.environment = environment;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public double getTotalCalculatedAmount() {
        return totalCalculatedAmount;
    }

    public void setTotalCalculatedAmount(double totalCalculatedAmount) {
        this.totalCalculatedAmount = totalCalculatedAmount;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(double conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
