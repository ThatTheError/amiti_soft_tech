package com.gopal.barbershop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.gopal.barbershop.entities.Product;
import com.gopal.barbershop.entities.UserEntity;
import com.gopal.barbershop.entities.User_Product;
import com.gopal.barbershop.services.ProductServices;
import com.gopal.barbershop.services.UserProductServices;
import com.gopal.barbershop.services.UserServices;

@RestController
public class Controller 
{
    @Autowired
    UserServices userServices;

    @Autowired
    ProductServices productServices;

    @Autowired
    UserProductServices userProductServices;

    // New User Registration
    @CrossOrigin(origins = "http://localhost:8081/")
    @PostMapping("/susers")
    public ResponseEntity<UserEntity> signUp(@RequestBody UserEntity user)
    {
        if(!userServices.isExistingUser(user))
        {
            try{
                this.userServices.addUser(user);
                return ResponseEntity.status(HttpStatus.CREATED).build();
            }
            catch(Exception e){
                e.printStackTrace();
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
            }  
        }
        return ResponseEntity.status(HttpStatus.ALREADY_REPORTED).build();  
    }
    

    // User Login
    @CrossOrigin(origins = "http://localhost:8081/")
    @PostMapping("/lusers")
    public int logIn(@RequestBody UserEntity user)
    {
        if(userServices.isExistingUser(user))
        {
            return 1;
        }
        return 0;
    }

    // Add Products
    @CrossOrigin(origins = "http://localhost:8081/")
    @PostMapping("aproducts")
    public void addProduct(@RequestBody Product product)
    {
        if(!productServices.isExistingProduct(product)){
            this.productServices.addProduct(product);
        }
        else{
            this.productServices.increaseQty(product);
        }

    }

    // Get All Products
    @CrossOrigin(origins = "http://localhost:8081/")
    @GetMapping("gproducts")
    public List<Object[]> getAllProduct(@RequestParam String uEmail)
    {
        int uId = userServices.finduserid(uEmail);
        List<Object[]> details = productServices.getCartData(uId);
        for(Object[] o : details){
            for(Object ob : o){
                System.out.println(ob);
            }
        }
        List<Product> products =  productServices.getAllProducts();
        for(Product p : products){
            System.out.println(p);
        }
        return details;
    }

    // to set product of a particular user
    @CrossOrigin(origins = "http://localhost:8081/")
    @PostMapping("spproducts")
    public void setParticularProducts(@RequestBody User_Product up , @RequestParam String uEmail)
    {
        int uId = userServices.finduserid(uEmail);
        boolean b =userProductServices.isExistingProductOfParticularUser(uId, up.getpId());
        if(b){
            System.out.println("b is true"+b);
            userProductServices.increaseQty(up.getpId());
        }
        else{
            System.out.println("b is false"+b);
            up.setuId(uId);
            userProductServices.addUserProduct(up);
        }
    }
}
