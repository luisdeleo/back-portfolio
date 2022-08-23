package com.example.API_Portfolio.repository;

import com.example.API_Portfolio.model.Elemento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElemRepository extends JpaRepository<Elemento, Long>{

 

}
