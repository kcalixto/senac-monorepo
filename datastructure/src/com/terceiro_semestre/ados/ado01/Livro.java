package com.terceiro_semestre.ados.ado01;

class Livro {
    private int id; // todo gerar id aleatório
    // todo documentar tudo
    private String autor;
    private String titulo;
    private double preco;

    public Livro() {
    }

    public Livro(int id, String autor, String titulo, double preco) {
        this.id = id;
        this.autor = autor;
        this.titulo = titulo;
        this.preco = preco;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("id: %d\nautor: %s\ntitulo: %s\npreço: %.2f", this.id, this.autor, this.titulo,
                this.preco);
    }
}