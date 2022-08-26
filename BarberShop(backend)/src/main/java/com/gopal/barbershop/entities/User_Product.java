package com.gopal.barbershop.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User_Product {
    @Id
    @GeneratedValue
    @Column(name = "TransactionId")
    private int tId;
    @Column(name = "UserId")
    private int uId;
    @Column(name = "ProductId")
    private int pId;
    @Column(name = "ProductQuantity")
    private int pQty;

    public int getpQty() {
        return pQty;
    }
    public void setpQty(int pQty) {
        this.pQty = pQty;
    }
    public int gettId() {
        return tId;
    }
    public void settId(int tId) {
        this.tId = tId;
    }
    public int getuId() {
        return uId;
    }
    public void setuId(int uId) {
        this.uId = uId;
    }
    public int getpId() {
        return pId;
    }
    public void setpId(int pId) {
        this.pId = pId;
    }
    public User_Product(int tId, int uId, int pId, int pQty) {
        this.tId = tId;
        this.uId = uId;
        this.pId = pId;
        this.pQty = pQty;
    }
    public User_Product() {
    }
    @Override
    public String toString() {
        return "User_Product [pId=" + pId + ", pQty=" + pQty + ", tId=" + tId + ", uId=" + uId + "]";
    }
    
}
