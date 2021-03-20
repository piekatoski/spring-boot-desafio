package com.giovani.serverdesafio.repository;

import java.util.Optional;

import com.giovani.serverdesafio.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
  
  Optional<User> findByMail(String mail);

}
