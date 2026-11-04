package com.example.backend.service;

import com.example.backend.model.Libro;
import com.example.backend.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getAllLibros() {
      return libroRepository.findAll();
    }

    public Libro getLibroById(Long id) {
      return libroRepository.findById(id).orElse(null);
    }

    public Libro saveLibro(Libro libro) {
      return libroRepository.save(libro);
    }

    public void deleteLibro(Long id) {
      libroRepository.deleteById(id);
    }

}
