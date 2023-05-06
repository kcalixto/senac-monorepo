package com.terceiro_semestre.classes.ListaDuplamenteLigadaTurmaA.lista;

public class Fila extends Lista {
    private int tamanho;
    private Contato[] fila;

    public Fila() {
        this.tamanho = 0;
        this.fila = new Contato[0];
    }

    /**
     * Inserir novo contato na Fila
     * 
     * @param novoContato
     */
    public void enqueue(Contato novoContato) {
        this.tamanho++;
        Contato[] auxiliar = new Contato[this.tamanho];

        for (int i = 0; i < this.fila.length; i++) {
            auxiliar[i] = fila[i];
        }

        auxiliar[this.tamanho - 1] = novoContato;

        this.fila = auxiliar;
        return;
    }

    public void dequeue() {
        this.tamanho--;
        Contato[] auxiliar = new Contato[this.tamanho];

        for (int i = 0; i < auxiliar.length; i++) {
            auxiliar[i] = fila[i];
        }

        this.fila = auxiliar;
        return;
    }

    public Contato front() {
        return this.fila[this.tamanho - 1];
    }

    public void empty() {
        this.fila = new Contato[0];
    }

    public int size(){
        return this.tamanho;
    }

    @Override
    public String toString() {
        String str = "";

        for (int i = 0; i < this.fila.length; i++) {
            str += "\n" + i + ":" + this.fila[i].toString();
        }

        return str;
    }
}
