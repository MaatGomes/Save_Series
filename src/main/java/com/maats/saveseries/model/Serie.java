package com.maats.saveseries.model;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "TB_SERIES")
public class Serie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    private Time time;

    @Lob
    private String anotacao;

    private Integer temp;

    private Integer ep;

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

    public String getAnotacao() {
        return anotacao;
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public Integer getEp() {
        return ep;
    }

    public void setEp(Integer ep) {
        this.ep = ep;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Serie(Long id, String nome, Time time, String anotacao, Integer temp, Integer ep) {
        this.id = id;
        this.nome = nome;
        this.time = time;
        this.anotacao = anotacao;
        this.temp = temp;
        this.ep = ep;
    }

    public Serie() {

    }

    
}
