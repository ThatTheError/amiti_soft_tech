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

    public List<Object[]> getCartData(int uId)
    {
        return(productDao.getCartData(uId));
    }

}
