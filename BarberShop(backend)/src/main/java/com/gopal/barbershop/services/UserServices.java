package com.gopal.barbershop.services;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.gopal.barbershop.dao.UserDao;
import com.gopal.barbershop.entities.UserEntity;


@Component
public class UserServices 
{
    @Autowired
    private UserDao userDao;

    // to set user details
    public UserEntity addUser(UserEntity user)
    {
        UserEntity res =  this.userDao.save(user);
        return res;
    }

    public boolean isExistingUser(UserEntity user)
    {
        List<UserEntity> users;
        users = (List<UserEntity>)userDao.findAll();
        for(UserEntity u : users){
            if(!users.isEmpty() && u.getuEmail().equals(user.getuEmail()) && u.getuPassword().equals(user.getuPassword()) && u.getuConfPassword().equals(user.getuConfPassword()))
            {
                return true;
            }
        }
        return false;
    }

    // to find userId by UserEmail
    public int finduserid(String email){
        int n = userDao.finduserid(email);
        return n;
    }
    
}
