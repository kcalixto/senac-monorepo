package com.terceiro_semestre.ados.ado01;

public class LivroArray {
    private Livro[] livros = new Livro[0];
    private int index = livros.length;

    public LivroArray() {}

    public void sort() {
        int arraySize = livros.length;

        int elements = 1;
        int start, half, end;

        while (elements < arraySize) {
            start = 0;

            while (start + elements < arraySize) {
                half = start + elements;
                end = (start + 2) * elements;

                if (end > arraySize) {
                    end = arraySize;
                }

                Livro temp[] = new Livro[end - start];

                int i = start;
                int m = half;
                int pos = 0;

                while (i < half && m < end) {
                    if (this.livros[i].getId() <= this.livros[m].getId()) {
                        temp[pos] = this.livros[i];
                        i++;
                    } else {
                        temp[pos] = this.livros[m];
                        m++;
                    }
                    pos++;
                }

                while (i < half) {
                    temp[pos] = this.livros[i];
                    pos++;
                    i++;
                }

                while (m < end) {
                    temp[pos] = this.livros[m];
                    pos++;
                    m++;
                }

                for (int j = 0, k = start; k < end; k++, j++) {
                    this.livros[k] = temp[j];
                }

                //
                start = end;
            }

            elements = elements * 2;
        }
    }

    public int genRandomID(){
        int randomId = (int) (Math.random()*100);

        int foundedID = doBooksBinarySearchByID(randomId);
        if (foundedID > -1){
            return genRandomID();
        }

        return randomId;
    }

    public void add(Livro newLivro) {
        newLivro.setId(genRandomID());
        
        if (index >= livros.length) {
            index++;

            // Save in "cache"
            Livro[] temp = new Livro[livros.length];
            for (int i = 0; i < livros.length; i++) {
                temp[i] = livros[i];
            }

            livros = new Livro[index];
            // Get value from "cache"
            for (int i = 0; i < temp.length; i++) {
                livros[i] = temp[i];
            }
        }

        livros[index - 1] = newLivro;
    }

    public Livro remove(int id) {
        int target = doBooksBinarySearchByID(id);
        Livro removed_book = null;

        if (livros.length == 1){
            removed_book = livros[0];
        }

        // Se o ID não foi encontrado, a resposta padrão é -1
        if (target == -1) {
            return null;
        }

        Livro[] temp = new Livro[livros.length - 1];
        int j = 0;
        for (int i = 0; i < temp.length; i++) {
            if (i == target) {
                removed_book = livros[i];
                j++;
            }
            temp[i] = livros[j];
            j++;
        }

        // refilling livros
        livros = new Livro[temp.length];
        for (int i = 0; i < temp.length; i++) {
            livros[i] = temp[i];
        }

        index--;

        return removed_book;
    }

    private int doBooksBinarySearchByID(int id){
        int start = 0;
        int end = index - 1;
        int half = 0;

        while (start <= end) {
            half = (end + start) / 2;

            if (id == this.livros[half].getId()) {
                return half;
            } else if (id > this.livros[half].getId()) {
                start = half + 1;
            } else {
                end = half - 1;
            }
        }

        return -1;
    }

    public Livro search(String titulo) {
        int counter = 0;
        int arraySize = this.livros.length - 1;
        
        while (counter <= arraySize) {
            int half = counter + (arraySize - counter) / 2;
            int res = titulo.compareTo(this.livros[half].getTitulo());
 
            if (res == 0){
                return this.livros[half];
            }
 
            if (res > 0){
                counter = half + 1;
            } else{
                arraySize = half - 1;
            }
        }
 
        return null;
    }

    public int length(){
        return this.livros.length;
    }

    @Override
    public String toString() {
        String str = "";
        for (Livro livro : this.livros) {
            str += livro.toString() + "\n\n";
        }

        return str;
    }

}
