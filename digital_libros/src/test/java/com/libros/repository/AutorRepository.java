/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libros.repository;

/**
 *
 * @author Anderson
 */
import com.libros.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AutorRepository extends JpaRepository<Autor, Long> {
}
