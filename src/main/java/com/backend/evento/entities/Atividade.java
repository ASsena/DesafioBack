package com.backend.evento.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_atividade")
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "atividade_id")
    private Integer id;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "nome")
    private String nome;
    @Column(name = "preco")
    private Double preco;

    @OneToMany
    private List<Bloco> blocos;

    @ManyToOne
    private Categoria categoria;


    public Atividade(Integer id, String descricao, String nome, Double preco) {
        this.id = id;
        this.descricao = descricao;
        this.nome = nome;
        this.preco = preco;
    }

    public Atividade() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public List<Bloco> getBlocos() {
        return blocos;
    }

    public void setBlocos(List<Bloco> blocos) {
        this.blocos = blocos;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
