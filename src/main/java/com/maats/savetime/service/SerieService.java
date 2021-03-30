package com.maats.savetime.service;

import java.util.List;

import com.maats.savetime.model.Serie;

public interface SerieService {
    List<Serie> findAll();
    Serie findById(Long id);
    Serie save(Serie serie);
    void deleteById(long id);
}
