package com.devsuperior.userdept.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

    List<User> findByName(String name);
    
}
