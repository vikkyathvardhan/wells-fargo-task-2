package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityId;

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private float purchasePrice;

    @Column(nullable = false)
    private int purchaseDate;

    @Column(nullable = false)
    private int quantity;

    protected Security(){

    }

    public Security(String name, String category, float purchasePrice, int purchaseDate, int quantity) {
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public Long getsecurityId() {
        return securityId;
    }

    public Long getportfolioId() {
        return portfolioId;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getcategory() {
        return name;
    }

    public void setcategory(String category) {
        this.category = category;
    }

    public float getpurchasePrice() {
        return purchasePrice;
    }

    public void setpurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getpurchaseDate() {
        return purchaseDate;
    }

    public void setpurchaseDate(int purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getquantity() {
        return quantity;
    }

    public void setquantity(int quantity) {
        this.quantity = quantity;
    }   
}
