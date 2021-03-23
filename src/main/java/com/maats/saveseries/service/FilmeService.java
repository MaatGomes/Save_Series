package com.maats.saveseries.service;

import java.util.List;

import com.maats.saveseries.model.Filme;



public interface FilmeService {
        List<Filme> findAll();
        Filme findById(Long id);
        Filme save(Filme filme);
    }
