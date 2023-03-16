package com.terceiro_semestre.ados.ado01;

class ADO01 {
    private LivroArray livros = new LivroArray();

    public ADO01() {
        Livro four = new Livro(8, "teste", "teste", 2.0);
        Livro one = new Livro(11, "teste", "teste", 2.0);
        Livro two = new Livro(20, "teste", "teste", 2.0);
        Livro three = new Livro(37, "teste", "teste", 200.0);

        livros.add(one);
        livros.add(three);
        livros.add(four);
        livros.add(two);

        livros.sort();

        // boolean removed = livros.remove(37);
        // if (!removed)
        //     System.out.println("Não foi possível encontrar este ID no array");

        System.out.println("Array de Livros: \n" + livros.toString());
    }

    public static void main(String[] args) {
        new ADO01();
    }
}