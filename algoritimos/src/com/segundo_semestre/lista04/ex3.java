package com.segundo_semestre.lista04;

public class ex3 {
    public static void main(String[] args) {
        // 3) Faça a implementação de uma pilha usando vetores. Usando ou não orientação
        // objeto.

        System.out.println(" 3) Faça a implementação de um pilha usando vetores. Usando ou não orientação objeto. ");

        new ex3();
    }

    public ex3() {
        Stack myStack = new Stack();

        myStack.push(10);
        myStack.push(12);
        myStack.push(165);
        myStack.pop();
        myStack.push(112);

        // prints Stack lifespan
        myStack.printStackTrace();
    }
}