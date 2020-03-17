package com.example.prj_180281.model;

/**
 * Produto
 */
public class Produto {

    private int codigo;
    private String nome;
    private double valor;
    private int estoque;

    public Produto(int codigo, String nome, double valor, int estoque){
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;    
    }

    public Produto(){
        
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return this.estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}

