package com.maats.savetime.service.serviceImpl;

import java.util.List;

import com.maats.savetime.model.Filme;
import com.maats.savetime.repository.FilmeRepository;
import com.maats.savetime.service.FilmeService;

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

    @Override
    public void deleteById(long id) {
        filmeRepository.deleteById(id);

    }

   

   
    }