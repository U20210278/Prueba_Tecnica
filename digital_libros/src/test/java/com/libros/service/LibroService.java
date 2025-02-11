/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libros.service;

/**
 *
 * @author Anderson
 */
import com.libros.model.Libro;
import com.libros.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public Libro crearLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    public List<Libro> obtenerLibros() {
        return libroRepository.findAll();
    }

    public void borrarLibro(Long id) {
        libroRepository.deleteById(id);
    }
}
