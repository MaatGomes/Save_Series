package com.maats.saveseries.service;

import java.util.List;

import com.maats.saveseries.model.Serie;

public interface SerieService {
    List<Serie> findAll();
    Serie findById(Long id);
    Serie save(Serie serie);
}