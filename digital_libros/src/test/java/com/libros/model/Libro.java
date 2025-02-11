/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libros.model;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
/**
 *
 * @author Anderson
 */
@Data
@Entity
public class Libro {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private Date fechaPublicacion;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;
    
}
