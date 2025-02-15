package com.in28minutes.microservices.currency_exchange_service;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CurrencyExchange {

    @Id
    private long id;

    @Column(name = "currency_from")
    private String from;

    @Column(name = "currency_to")
    private String to;

    private double conversionMultiple;

    private String environment;

    public long getId() {
        return id;
    }

    public CurrencyExchange() {
        super();
    }

    public CurrencyExchange(
            long id,
            String from,
            String to,
            double conversionMultiple
    ) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(double conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
