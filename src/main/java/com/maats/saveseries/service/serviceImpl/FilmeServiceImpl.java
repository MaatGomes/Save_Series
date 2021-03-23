package com.maats.saveseries.service.serviceImpl;

import java.util.List;

import com.maats.saveseries.model.Filme;
import com.maats.saveseries.repository.FilmeRepository;
import com.maats.saveseries.service.FilmeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmeServiceImpl implements FilmeService {


    @Autowired
    FilmeRepository filmeRepository;

    
    @Override
    public List<Filme> findAll() {
        return filmeRepository.findAll();
    }

    @Override
    public Filme findById(Long id) {
        return filmeRepository.findById(id).get();
    }

    @Override
    public Filme save(Filme filme) {
        return filmeRepository.save(filme);
    }

   

   
    }