package com.gopal.barbershop.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "Product_Number")
    private int pNo;
    @Column(name = "Product_Name")
    private String pName;
    @Column(name = "Product_Quantity")
    private int pQty;
    @Column(name = "Product_Price")
    private int pPrice;
    @Column(name = "Product_Image")
    private String pImg;

    
    public int getpNo() {
        return pNo;
    }
    public void setpNo(int pNo) {
        this.pNo = pNo;
    }
    public String getpName() {
        return pName;
    }
    public void setpName(String pName) {
        this.pName = pName;
    }
    public int getpQty() {
        return pQty;
    }
    public void setpQty(int pQty) {
        this.pQty = pQty;
    }
    public int getpPrice() {
        return pPrice;
    }
    public void setpPrice(int pPrice) {
        this.pPrice = pPrice;
    }
    public String getpImg() {
        return pImg;
    }
    public void setpImg(String pImg) {
        this.pImg = pImg;
    }
    public Product() {
    }
    public Product(int pNo, String pName, int pQty, int pPrice, String pImg) {
        this.pNo = pNo;
        this.pName = pName;
        this.pQty = pQty;
        this.pPrice = pPrice;
        this.pImg = pImg;
    }
    @Override
    public String toString() {
        return "Product [pImg=" + pImg + ", pName=" + pName + ", pNo=" + pNo + ", pPrice=" + pPrice + ", pQty=" + pQty
                + "]";
    } 
    
}
