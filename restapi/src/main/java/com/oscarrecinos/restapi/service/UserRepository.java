package com.oscarrecinos.restapi.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oscarrecinos.restapi.model.Entities.User;

public interface UserRepository extends JpaRepository<User,Integer>{
    
}
