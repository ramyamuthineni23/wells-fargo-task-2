package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    @Column
    private String name;
    @Column
    private String category;
    @Column
    private Long purchasePrice;
    @Column
    private Long purchaseDate;
    @Column
    private Long quantity;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolioId;

    public Security(String name, String category, Long purchasePrice, Long purchaseDate, Long quantity, Portfolio portfolioId ) {
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
        this.portfolioId = portfolioId;
    }

    public Security() {

    }

    public Long getSecurityId() {
        return securityId;
    }
    public void setSecurityId(Long securityId) {
        this.securityId = securityId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public Long getPurchasePrice() {
        return purchasePrice;
    }
    public void setPurchasePrice(Long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    public Long getPurchaseDate() {
        return purchaseDate;
    }
    public void setPurchaseDate(Long purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
    public Long getQuantity() {
        return quantity;
    }
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
