package com.terceiro_semestre.ados.ado01;

public class LivroArray {

    private Livro[] livros = new Livro[0];
    private int index = livros.length;

    public LivroArray() {
        System.out.println(livros.length);
        System.out.println(index);
    }

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

    public void add(Livro newLivro) {
        if (index >= livros.length) {
            index++;
            System.out.println("[debug] index incremented by one, new value: " + index);

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

    public boolean remove(int id) {
        boolean found = false;

        int start = 0;
        int end = index - 1;
        int half = 0;

        int target = 0;

        while (start <= end && !found) {
            half = (end + start) / 2;

            if (id == this.livros[half].getId()) {
                target = half;
                found = true;
            } else if (id > this.livros[half].getId()) {
                start = half + 1;
            } else {
                end = half - 1;
            }
        }

        if (!found) {
            return false;
        }

        Livro[] temp = new Livro[livros.length - 1];
        int j = 0;
        for (int i = 0; i < temp.length; i++) {
            if (i == target) {
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

        return true;
    }

    public Livro search(String titulo) {
        int start = 0;
        int end = index - 1;
        int half = 0;

        while (start <= end) {
            half = (end + start) / 2;

            if (titulo.equalsIgnoreCase(this.livros[half].getTitulo())) {
                return this.livros[half];
            } else if (titulo.length() > this.livros[half].getTitulo().length()) {
                start = half + 1;
            } else {
                end = half - 1;
            }
        }
        return null;
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
