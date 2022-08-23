package com.example.API_Portfolio.repository;


import com.example.API_Portfolio.model.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EduRepository extends JpaRepository<Estudio, Long>{

}