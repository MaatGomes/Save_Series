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
    @Table(name = "TB_Filmes")
    public class Filme {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotBlank
        private String nomeFilme;

        private Time timeFilme;

        @Lob
        private String anotacaoFilme;


        public Filme() {

        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNomeFilme() {
            return nomeFilme;
        }

        public void setNomeFilme(String nomeFilme) {
            this.nomeFilme = nomeFilme;
        }

        public Time getTimeFilme() {
            return timeFilme;
        }

        public void setTimeFilme(Time timeFilme) {
            this.timeFilme = timeFilme;
        }

        public String getAnotacaoFilme() {
            return anotacaoFilme;
        }

        public void setAnotacaoFilme(String anotacaoFilme) {
            this.anotacaoFilme = anotacaoFilme;
        }

        public Filme(Long id, @NotBlank String nomeFilme, Time timeFilme, String anotacaoFilme) {
            this.id = id;
            this.nomeFilme = nomeFilme;
            this.timeFilme = timeFilme;
            this.anotacaoFilme = anotacaoFilme;
        }

    }