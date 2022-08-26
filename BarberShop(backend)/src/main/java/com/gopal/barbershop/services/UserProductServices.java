package com.gopal.barbershop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.*;
import com.gopal.barbershop.dao.UserProductDao;
import com.gopal.barbershop.entities.User_Product;

@Component
public class UserProductServices {

    @Autowired
    private UserProductDao userProductDao;

    //to check existing product of a particular user or not
    public boolean isExistingProductOfParticularUser(int uId,int pId)
    {
        List<User_Product> ups = (List<User_Product>)this.userProductDao.findAll();
        if(ups.isEmpty())
            return false;
        for(User_Product up : ups){
            if(up.getpId() == pId && up.getuId() == uId)
                return true;
        }
        return false;
    }

    // to add a product of a particular user
    public User_Product addUserProduct(User_Product up)
    {
        return(userProductDao.save(up));
    }

    public void increaseQty(int pId)
    {
        userProductDao.increaseQty(pId);
    }
}
