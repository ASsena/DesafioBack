package com.backend.evento.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tb_bloco")
public class Bloco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bloco_id")
    private Integer id;
    @Column(name = "inicio")
    private Instant inicio;
    @Column(name = "fim")
    private Instant fim;

    @ManyToOne(cascade = CascadeType.ALL)
    private Atividade atividade;

    public Bloco(Integer id, Instant inicio, Instant fim) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Bloco() {
    }

    public Instant getFim() {
        return fim;
    }

    public void setFim(Instant fim) {
        this.fim = fim;
    }

    public Instant getInicio() {
        return inicio;
    }

    public void setInicio(Instant inicio) {
        this.inicio = inicio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }
}
