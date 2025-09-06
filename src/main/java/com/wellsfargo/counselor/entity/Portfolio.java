package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.util.Date;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue
    private Long portfolioId;

    private Date createdAt;

    @OneToOne
    @JoinColumn(name = "client_Id")
    private Client clientId;

    public Portfolio() {

    }

    public Portfolio(Long portfolioId, Date createdAt, Date updatedAt, Client client) {
        this.portfolioId = portfolioId;
        this.createdAt = createdAt;
        this.clientId = clientId;
    }

    public Client getClient() {
        return clientId;
    }

    public void setClient(Client ClientId) {
        this.clientId = ClientId;
    }

    public Long getId() {
        return portfolioId;
    }
    public void setId(Long id) {
        this.portfolioId = id;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
