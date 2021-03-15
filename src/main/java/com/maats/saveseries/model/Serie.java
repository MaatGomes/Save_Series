package com.maats.saveseries.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="TB_SERIES")
public class Serie {
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String nome;

    @NotBlank
    private double time;

    @Lob
    private String anotacao;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getAnotacao() {
        return anotacao;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }

    public Serie(String nome, double time, String anotacao) {
        this.nome = nome;
        this.time = time;
        this.anotacao = anotacao;
    }
    

}