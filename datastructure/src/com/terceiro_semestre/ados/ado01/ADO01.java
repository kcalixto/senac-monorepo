package com.terceiro_semestre.ados.ado01;

import java.util.Scanner;

class ADO01 {
    private LivroArray livros = new LivroArray();

    public ADO01() {
        Livro four = new Livro("autor1", "title1", 2.0);
        Livro one = new Livro("autor2", "t", 2.0);
        Livro two = new Livro("autor3", "TTTTitle3", 2.0);
        Livro three = new Livro("autor4", "Aloha!", 200.0);

        livros.add(one);
        livros.add(three);
        livros.add(four);
        livros.add(two);

        livros.sort();

        Livro removed = livros.remove(37);
        if (removed == null){
            System.out.println("Não foi possível encontrar este ID no array");
        }else{
            System.out.println("removido com sucesso: "+ removed.toString());
        }

        System.out.println("Array de Livros: \n" + livros.toString());
        
        Livro foundedBook = livros.search("Aloha!");
        if (foundedBook == null){
            System.out.println("Book Not Found.");
        }else{
            System.out.println("Found: \n" + foundedBook.toString());
        }

    }

    public int ask(Scanner input){
        try {
            System.out.println("Qual opção você quer executar?\n");
            int selected = Integer.parseInt(input.nextLine());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            ADO01 ado01 = new ADO01();

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}