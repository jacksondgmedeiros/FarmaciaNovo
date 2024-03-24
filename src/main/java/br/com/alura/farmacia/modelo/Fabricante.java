package br.com.alura.farmacia.modelo;

import javax.persistence.*;

@Entity
@Table(name = "fabricante")
public class Fabricante {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;

    public Fabricante() {
    }

    public Fabricante(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
