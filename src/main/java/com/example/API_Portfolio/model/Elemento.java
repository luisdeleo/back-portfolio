package com.example.API_Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Elemento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String descripcion;
    private String seccion;

   public Elemento(){
   }
   
   public Elemento(Long id, String titulo, String descripcion, String seccion) {
       
       this.id = id;
       this.titulo = titulo;
       this.descripcion = descripcion;
       this.seccion = seccion;
   }
}
