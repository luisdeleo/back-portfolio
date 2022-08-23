package com.example.API_Portfolio.service;


import com.example.API_Portfolio.model.Estudio;
import java.util.List;

public interface IEduService {
    
    public List<Estudio>listar();
    public Estudio listarId(Long id);
    public void add(Estudio e);
    public Estudio edit(Estudio e);
    public void delete(Long id);
}
