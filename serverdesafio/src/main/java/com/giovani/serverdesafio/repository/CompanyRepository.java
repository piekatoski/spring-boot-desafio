package com.giovani.serverdesafio.repository;

import com.giovani.serverdesafio.model.Company;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long>{
  
}
