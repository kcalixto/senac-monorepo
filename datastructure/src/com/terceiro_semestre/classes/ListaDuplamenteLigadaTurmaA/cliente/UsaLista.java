
package com.terceiro_semestre.classes.ListaDuplamenteLigadaTurmaA.cliente;

import com.terceiro_semestre.classes.ListaDuplamenteLigadaTurmaA.lista.Contato;
import com.terceiro_semestre.classes.ListaDuplamenteLigadaTurmaA.lista.Fila;
import com.terceiro_semestre.classes.ListaDuplamenteLigadaTurmaA.lista.Pilha;

/*
*  Professor Gerson Risso
*/
public class UsaLista {
    Fila minhaFila = new Fila();
    Pilha minhaPilha = new Pilha();

    private UsaLista() {
        rodarFila();
        // rodarPilha();
    }

    private void rodarPilha() {
        System.out.println("\n[push] inserindo novo item na pilha.");
        minhaPilha.push(new Contato("calixto", "123"));
        printPilha();

        System.out.println("\n[push] inserindo novo item na pilha.");
        minhaPilha.push(new Contato("calixto", "312"));
        printPilha();

        System.out.println("\n[pop] removendo primeiro item da pilha.");
        minhaPilha.pop();
        printPilha();

        System.out.println("\n[push] inserindo novo item na pilha.");
        minhaPilha.push(new Contato("calixto", "333"));
        printPilha();

        System.out.println("\n[size] tamanho da pilha. ");
        System.out.println("size: " + minhaPilha.size());

        System.out.println("\n[top] último item da pilha. ");
        System.out.println("top: " + minhaPilha.top().toString());

        System.out.println("\npilha está vazia? " + minhaPilha.isEmpty());
        
        System.out.println("\n[pop] removendo primeiro item da pilha.");
        minhaPilha.pop();
        System.out.println("\n[pop] removendo primeiro item da pilha.");
        minhaPilha.pop();
        
        printPilha();
        System.out.println("\npilha está vazia? " + minhaPilha.isEmpty());
    }

    private void rodarFila() {
        System.out.println("\n[enqueue] inserindo novo item na fila.");
        minhaFila.enqueue(new Contato("calixto", "123"));
        printFila();

        System.out.println("\n[enqueue] inserindo novo item na fila.");
        minhaFila.enqueue(new Contato("calixto", "312"));
        printFila();

        System.out.println("\n[dequeue] removendo ultimo item da fila.");
        minhaFila.dequeue();
        printFila();

        System.out.println("\n[enqueue] inserindo novo item na fila.");
        minhaFila.enqueue(new Contato("calixto", "333"));
        printFila();

        System.out.println("\n[size] tamanho da fila. ");
        System.out.println("size: " + minhaFila.size());

        System.out.println("\n[front] último item da fila. ");
        System.out.println("front: " + minhaFila.front().toString());

        System.out.println("\nlimpando a fila...");
        minhaFila.empty();
        printFila();
    }

    private void printFila() {
        System.out.println("status da fila: " + minhaFila.toString());
    }

    private void printPilha() {
        System.out.println("status da pilha: " + minhaPilha.toString());
    }

    public static void main(String[] args) {
        new UsaLista();
    }

}
