package com.example.demo.mirepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.*;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}

