package com.gopal.barbershop;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gopal.barbershop.dao.ProductDao;
import com.gopal.barbershop.services.ProductServices;

import java.util.*;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class ProductTest {

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ProductServices productServices;

    // testcase for delete particular user
    @Test
    @Disabled
    void testDeletePUProducts() {
        
    }

    // testcase for get cart data
    @Test
    void testGetCartData() {
        List<Object[]> cartData = productDao.getCartData(196);
        int expectedCartSize = 5;
        assertThat(cartData.size()).isEqualTo(expectedCartSize);
    }

    // testcase for get cart total
    @Test
    @Disabled
    void testGetTotal() {
        
    }
    
}