
package com.example.API_Portfolio.controller;

import com.example.API_Portfolio.model.Elemento;
import com.example.API_Portfolio.service.IElemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "bq1w7g1ex7509pfg59vk-mysql.services.clever-cloud.com",maxAge = 3600)
@RequestMapping({"/bq1w7g1ex7509pfg59vk/elemento"})
public class Controller {
    
     @Autowired
    private IElemService service;
    
    @GetMapping
    @ResponseBody
    public List<Elemento>listar(){
        return service.listar();
    }
    @PostMapping
    public void agregar(@RequestBody Elemento e){
         service.add(e);
    }
    @GetMapping(path = {"/{id}"})
    public Elemento listarId(@PathVariable("id")Long id){
        return service.listarId(id);
    }
    @PutMapping(path = {"/{id}"})
    public Elemento editar(@RequestBody Elemento e,@PathVariable("id") Long id){
        e.setId(id);
        return service.edit(e);
    }
    @DeleteMapping(path = {"/{id}"})
    public void delete(@PathVariable("id") Long  id){
        service.delete(id);
    }
}
