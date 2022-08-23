package com.example.API_Portfolio.service;

import com.example.API_Portfolio.model.Elemento;
import java.util.List;

public interface IElemService {
    
    public List<Elemento>listar();
    public Elemento listarId(Long id);
    public void add(Elemento e);
    public Elemento edit(Elemento e);
    public void delete(Long id);
}
