package com.segundo_semestre.lista04;

public class Stack {
    private String stackTrace = "";
    private static final int stackPush = 0;
    private static final int stackPop = 1;

    private int[] stack = new int[] {};

    public Stack() {
    }

    public void push(int item) {
        int newStack[] = new int[stack.length + 1];
        for (int i = 0; i < newStack.length; i++) {
            if (i < stack.length) {
                newStack[i] = stack[i];
                continue;
            }
            newStack[i] = item;
        }
        stack = newStack;
        stackTrace(item, stackPush);
    }

    public void pop() {
        int poppedValue = stack[stack.length - 1];

        int newStack[] = new int[stack.length - 1];
        for (int i = 0; i < newStack.length; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
        stackTrace(poppedValue, stackPop);
    }

    public int peek() {
        return stack[stack.length - 1];
    }

    public void clear() {
        stack = new int[] {};
    }

    public boolean isEmpty() {
        return stack.length == 0;
    }

    private void stackTrace(int item, int operation) {
        if (operation == stackPush) {
            stackTrace += ("PUSH: " + item + "\n");
        }
        if (operation == stackPop) {
            stackTrace += ("POP: " + item + "\n");
        }

        for (int i : stack) {
            stackTrace += i + " ";
        }
        stackTrace += "\n\n";
    }

    public void printStackTrace() {
        System.out.println(stackTrace);
    }

}
