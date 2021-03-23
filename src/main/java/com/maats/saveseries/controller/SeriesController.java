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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

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



<<<<<<< HEAD
    @GetMapping("/series")
    public String getFilmes(Filme f, Model model){
        List<Filme> filmes = filmeService.findAll();
        model.addAttribute("filmes", filmes);
        model.addAttribute("f", f);
        return "filmes";
    }

    @PostMapping("/series")
    public String saveCardFilme(@Valid Filme filme, BindingResult result, RedirectAttributes attributes){
        
=======

    @PostMapping("/filmes")
    public String saveFilmes(@Valid Filme filme, BindingResult result, RedirectAttributes attributes) {

>>>>>>> 9eb84b5d2493ded08a404b269670f0fbc9281de5
        if (result.hasErrors()) {
         
            attributes.addFlashAttribute("filme", filme);
            return "redirect:/cards";

        }
       
            filmeRepository.save(filme);
            return "redirect:/cards";
            

    }


  

    /*
     * /* @GetMapping("/filmes") public String getFilmes(Filme f, Model model){
     * List<Filme> filmes = filmeService.findAll(); model.addAttribute("filmes",
     * filmes); model.addAttribute("f", f); return "filmes"; }
     */
    /*
     * @PostMapping("/filmes") public String saveCardFilme(@Valid Filme filme,
     * BindingResult result, RedirectAttributes attributes){
     * 
     * if (result.hasErrors()) {
     * 
     * attributes.addFlashAttribute("filme", filme); return "redirect:/series";
     * 
     * } filmeRepository.save(filme);
     * 
     * return "redirect:/filmes";
     * 
     * }
     */

    @GetMapping("/cardDetailsSeries/{id}")
    public String getCardDetailsSerie(@PathVariable("id") Long id) {

        serieService.findById(id);

        return "series";
    }

    @GetMapping("/cardDetailsFilmes/{id}")
    public String getCardDetailsFilme(@PathVariable("id") Long id) {

        filmeService.findById(id);

        return "series";
    }

}