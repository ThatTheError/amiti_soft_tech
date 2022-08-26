package com.gopal.barbershop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gopal.barbershop.entities.UserEntity;

@Repository
public interface UserDao extends CrudRepository<UserEntity,Integer>
{
    public UserEntity findById(int uId);
    List<UserEntity> findAll();

    @Query("select uId from UserEntity where uEmail = :email")
    public int finduserid(@Param("email") String uemail);
}
