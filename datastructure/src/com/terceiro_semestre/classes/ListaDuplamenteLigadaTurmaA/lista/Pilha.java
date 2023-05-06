package com.terceiro_semestre.classes.ListaDuplamenteLigadaTurmaA.lista;

public class Pilha {
    private int tamanho;
    private Contato[] fila;

    public Pilha() {
        this.tamanho = 0;
        this.fila = new Contato[0];
    }

    /**
     * Inserir novo contato na Pila
     * 
     * @param novoContato
     */
    public void push(Contato novoContato) {
        this.tamanho++;
        Contato[] auxiliar = new Contato[this.tamanho];

        for (int i = 0; i < this.fila.length; i++) {
            auxiliar[i] = fila[i];
        }

        auxiliar[this.tamanho - 1] = novoContato;

        this.fila = auxiliar;
        return;
    }

    public void pop() {
        this.tamanho--;
        Contato[] auxiliar = new Contato[this.tamanho];

        for (int i = 0; i < auxiliar.length; i++) {
            auxiliar[i] = fila[i + 1];
        }

        this.fila = auxiliar;
        return;
    }

    public Contato top() {
        return this.fila[this.tamanho - 1];
    }

    public boolean isEmpty() {
        return this.fila.length <= 0;
    }

    public int size() {
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
