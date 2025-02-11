/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libros.controller;

/**
 *
 * @author Anderson
 */
import com.libros.model.Libro;
import com.libros.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {
    @Autowired
    private LibroService libroService;

    @PostMapping
    public Libro crearLibro(@RequestBody Libro libro) {
        return libroService.crearLibro(libro);
    }

    @GetMapping
    public List<Libro> obtenerLibros() {
        return libroService.obtenerLibros();
    }

    @DeleteMapping("/{id}")
    public void borrarLibro(@PathVariable Long id) {
        libroService.borrarLibro(id);
    }
}
