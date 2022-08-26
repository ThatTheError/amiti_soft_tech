package com.gopal.barbershop.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gopal.barbershop.entities.User_Product;

@Repository
public interface UserProductDao extends CrudRepository<User_Product,Integer>{
    
    @Modifying
    @Transactional
    @Query(nativeQuery = true ,value = "update user_product SET product_quantity=product_quantity+1 WHERE product_id=:pid")
    public void increaseQty(@Param("pid") int pId);

}
