package com.example.API_Portfolio.service;

import com.example.API_Portfolio.model.Estudio;
import com.example.API_Portfolio.repository.EduRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EduService implements IEduService {

    @Autowired
    private EduRepository repo;
    
    @Override
    public List<Estudio> listar() {
        return repo.findAll();
    }

    @Override
    public Estudio listarId(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void add(Estudio e) {
        repo.save(e);
    }

    @Override
    public Estudio edit(Estudio e) {
        return repo.save(e);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
   
    
}
