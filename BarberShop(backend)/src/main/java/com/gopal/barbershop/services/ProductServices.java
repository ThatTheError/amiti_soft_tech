package com.gopal.barbershop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;
import com.gopal.barbershop.dao.ProductDao;
import com.gopal.barbershop.entities.Product;

@Component
public class ProductServices {

    @Autowired
    private ProductDao productDao;

    // to get all the products
    public List<Product> getAllProducts()
    {
        List<Product> products =  (List<Product>)this.productDao.findAll();
        return products;
    }

    //add product 
    public Product addProduct(Product product)
    {
        Product pro = this.productDao.save(product);
        return pro;
    }

    //check is existing product
    public boolean isExistingProduct(Product product)
    {
        return(productDao.existsById(product.getpNo()));
    }

    //if existing product increase the quantity
    public void increaseQty(Product product)
    {
        int qty = product.getpQty()+1;
        productDao.deleteById(product.getpNo());
        product.setpQty(qty);
        this.addProduct(product);
    }

    // to get cart details of a particular user
    public List<Object[]> getCartData(int uId)
    {
        return(productDao.getCartData(uId));
    }

    //to get total price of a particular user
    public Object getTotalPrice(int uId)
    {
        return(productDao.getTotal(uId));
    }

    // to delete product of a particular user
    public void deleteParticularUserProducts(int uId,int pId)
    {
        productDao.deletePUProducts(uId,pId);
    }

    //to delete a product(admin use)
    public void deleteProduct(Product product)
    {
        productDao.delete(product);
    }

}
