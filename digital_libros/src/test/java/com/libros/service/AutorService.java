/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libros.service;

/**
 *
 * @author Anderson
 */
import com.libros.model.Autor;
import com.libros.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public Autor crearAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public List<Autor> obtenerAutores() {
        return autorRepository.findAll();
    }
}