package com.example.API_Portfolio.service;

import com.example.API_Portfolio.model.Elemento;
import com.example.API_Portfolio.repository.ElemRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElemService implements IElemService{

    @Autowired
    private ElemRepository repo;

    @Override
    public List<Elemento> listar() {
        return repo.findAll();
    }

    @Override
    public Elemento listarId(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void add(Elemento e) {
        repo.save(e);
    }

    @Override
    public Elemento edit(Elemento e) {
        return repo.save(e);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
   
 }
    
