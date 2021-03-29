package com.maats.saveseries.controller;

import java.util.List;

import javax.validation.Valid;

import com.maats.saveseries.model.Filme;
import com.maats.saveseries.model.Serie;
import com.maats.saveseries.repository.FilmeRepository;
import com.maats.saveseries.repository.SerieRepository;
import com.maats.saveseries.service.FilmeService;
import com.maats.saveseries.service.SerieService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SeriesController {

    @Autowired
    SerieService serieService;

    @Autowired
    SerieRepository serieRepository;

    @Autowired
    FilmeService filmeService;

    @Autowired
    FilmeRepository filmeRepository;

    @GetMapping("/cards")
    public String getCards(Serie s, Filme f, Model model) {
        List<Serie> serieLista = serieService.findAll();
        List<Filme> filmeLista = filmeService.findAll();
        model.addAttribute("serieLista", serieLista);
        model.addAttribute("filmeLista", filmeLista);
        model.addAttribute("s", s);
        model.addAttribute("f", f);

        return "cards";
    }

    @PostMapping("/series")
    public String saveSeries(@Valid Serie serie, BindingResult result, RedirectAttributes attributes) {

        if (result.hasErrors()) {

            attributes.addFlashAttribute("serie", serie);
         
            return "redirect:/cards";
        }
            serieRepository.save(serie);
            return "redirect:/cards";
        }

        @PostMapping("/filmes")
    public String saveFilmes(@Valid Filme filme, BindingResult result, RedirectAttributes attributes) {

        if (result.hasErrors()) {
         
            attributes.addFlashAttribute("filme", filme);
            return "redirect:/cards";

        }
       
            filmeRepository.save(filme);
            return "redirect:/cards";
            

    }

    @GetMapping("/editSerie/{id}")
    public String editSerie(@PathVariable("id") Long id, Model model) {
        Serie serie = serieService.findById(id); 
        model.addAttribute("serie", serie);
        
        return "editSerie";
    }

    @PostMapping("/editSerie")
    public String saveEditSerie(@Valid Serie serie, BindingResult result, Model model,
            RedirectAttributes attributes) {

        if (result.hasErrors()) {

            return "redirect:/cards";

        }

        serieRepository.save(serie);

        return "redirect:/cards";
    }
    @GetMapping("/deleteSerie/{id}")
    public String deleteSerie(@PathVariable("id") Long id) {

        serieService.deleteById(id);

        return "redirect:/cards";
    }

    @GetMapping("/deleteFilme/{id}")
    public String deleteFilme(@PathVariable("id") Long id) {

        filmeService.deleteById(id);

        return "redirect:/cards";
    }


    
    @GetMapping("/ajuda")
    public String ajuda() {
        return "ajuda";
    }
    
    @GetMapping("/about")
    public String about() {
        return "about";
    }
  


    

}