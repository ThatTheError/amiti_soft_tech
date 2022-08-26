package com.gopal.barbershop.dao;
import java.util.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gopal.barbershop.entities.Product;

@Repository
public interface ProductDao extends CrudRepository<Product,Integer>{


    @Query(nativeQuery = true,value = "select p.product_number , p.product_name , p.product_price , up.product_quantity from product p inner join user_product up on p.product_number = up.product_id and up.user_id=:uid")
    public List<Object[]> getCartData(@Param("uid") int uId);

}
