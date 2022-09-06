package com.gopal.barbershop;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gopal.barbershop.dao.UserDao;
import com.gopal.barbershop.entities.UserEntity;
import com.gopal.barbershop.services.UserServices;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

@SpringBootTest
public class UserTest {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserServices userServices;

    @Test
    void testFinduserid() {
        int expectedId = 196;
        int actualId =  userDao.finduserid("ssahu@nist.edu");
        assertThat(actualId).isEqualTo(expectedId);
    }

    @Test
    void testFindById() {
        UserEntity u1 =  userDao.findById(196);
        String expectedEmail = "ssahu@nist.edu";
        String expectedPass = "Sahu@subha1234";
        assertThat(u1.getuEmail()).isEqualTo(expectedEmail);
        assertThat(u1.getuPassword()).isEqualTo(expectedPass);
    }

    @Test
    void testFindAll() {
        List<UserEntity> users;
        int expectedSize = 5;
        users = userDao.findAll();
        assertThat(users.size()).isEqualTo(expectedSize);
    }

    @Test
    @Disabled
    void testAddUser() {
        
    }

    @Test
    @Disabled
    void testFinduserid2() {
        
    }

    @Test
    void testIsExistingUser() {
        UserEntity user = new UserEntity();
        user.setuEmail("gopalkrushnapatro464@gmail.com");
        user.setuPassword("Gopal@ms1998");
        user.setuConfPassword("Gopal@ms1998");
        boolean actualResult = userServices.isExistingUser(user);
        assertThat(actualResult).isTrue();
    }
    
}
