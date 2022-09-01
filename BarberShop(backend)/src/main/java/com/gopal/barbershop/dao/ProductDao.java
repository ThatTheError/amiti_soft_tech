package com.gopal.barbershop.dao;

import java.util.*;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gopal.barbershop.entities.Product;

@Repository
public interface ProductDao extends CrudRepository<Product,Integer>{


    @Query(nativeQuery = true,value = "select p.product_number , p.product_name , p.product_price , p.product_image , up.product_quantity from product p inner join user_product up on p.product_number = up.product_id and up.user_id=:uid")
    public List<Object[]> getCartData(@Param("uid") int uId);


    @Query(nativeQuery = true,value = "select sum(up.product_quantity*p.product_price) from product p inner join user_product up on p.product_number = up.product_id and up.user_id =:uid")
    public Object getTotal(@Param("uid") int uId);


    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "delete from user_product where user_id=:uid and product_id=:pid")
    public void deletePUProducts(@Param("uid") int uId,@Param("pid") int pId);
}
