package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @Id
    @GeneratedValue()
    private long clientId;

    @Column(nullable = false)
    private long creationDate;

    protected Portfolio(){

    }

    public Portfolio(long creationDate){
        this.creationDate = creationDate;
    }

    public Long getportfolioId() {
        return portfolioId;
    }

    public Long getClientId() {
        return clientId;
    }

    public long getcreationDate() {
        return creationDate;
    }

    public void setcreationDate(long creationDate) {
        this.creationDate = creationDate;
    }   
}
