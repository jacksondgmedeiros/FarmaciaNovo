package br.com.alura.farmacia.modelo;

import javax.persistence.*;

@Entity
@Table(name = "produto")
public class Produto {
    @Id
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private boolean ativo;

    @ManyToOne
    private Fabricante fabricante;

    public Produto() {
    }


    public Produto(int id, String nome, String descricao, double preco, Fabricante fabricante) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
