package com.maats.savetime.service;

import java.util.List;

import com.maats.savetime.model.Filme;



public interface FilmeService {
        List<Filme> findAll();
        Filme findById(Long id);
        Filme save(Filme filme);
        void deleteById(long id);
    }
