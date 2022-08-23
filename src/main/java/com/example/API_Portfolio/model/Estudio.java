package com.example.API_Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Estudio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String descripcion;
    
    public Estudio(){
   }
   
   public Estudio(Long id, String titulo, String descripcion) {
       
       this.id = id;
       this.titulo = titulo;
       this.descripcion = descripcion;
   }
}
