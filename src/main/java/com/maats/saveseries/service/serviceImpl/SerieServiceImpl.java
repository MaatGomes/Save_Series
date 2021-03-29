package com.maats.saveseries.service.serviceImpl;

import java.util.List;

import com.maats.saveseries.model.Serie;

import com.maats.saveseries.repository.SerieRepository;

import com.maats.saveseries.service.SerieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SerieServiceImpl implements SerieService {

    @Autowired
    SerieRepository serieRepository;

    @Override
    public List<Serie> findAll() {
        return serieRepository.findAll();
    }

    @Override
    public Serie findById(Long id) {
        return serieRepository.findById(id).get();
    }

    @Override
    public Serie save(Serie serie) {
        return serieRepository.save(serie);
    }

    @Override
    public void deleteById(long id) {
        serieRepository.deleteById(id);
    }

}
