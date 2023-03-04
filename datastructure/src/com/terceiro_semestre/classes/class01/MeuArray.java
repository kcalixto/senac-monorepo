package com.terceiro_semestre.classes.class01;

public class MeuArray {
    private static Pessoa[] lista = new Pessoa[4];
    private static int indice = 0;

    public static void inserir(Pessoa pessoa) {
        if (indice == lista.length) {
            lista = alocarNovoArray();
        }
        pessoa.setId(indice + 1);
        lista[indice++] = pessoa;
    }

    public static void mostrar() {
        System.out.println("===== Removendo .... =====");
        int id = 10000;
        if (MeuArray.remover(id)) {
            System.out.println("id=" + id + "removido com sucesso!");
        } else {
            System.out.println("Cadastro náo removido!");
        }
        MeuArray.mostrar();
    }

    /**
     * Realiza busca binaria no array de objetos lista.
     * 
     * @param id int
     * @return Pessoa
     */
    public static int pesquisar(int id) {
        int inicio = 0, fim = indice - 1, meio;
        while (inicio <= fim) {
            meio = (fim + inicio) / 2;
            if (id == lista[meio].getId()) {
                return meio;
            } else if (id > lista[meio].getId()) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    private static Pessoa[] alocarNovoArray() {
        Pessoa[] novo = new Pessoa[lista.length + 4];

        System.arraycopy(lista, 0, novo, 0, lista.length);

        return novo;
    }

    public static boolean remover(int id) {
        int rem = pesquisar(id);
        if (rem != -1) {
            for (int i = rem; i < indice - 1; i++) {
                lista[i] = lista[i + 1];

            }
            indice--;
            return true;
        }
        return false;
    }

    public static void insertionSort(Pessoa[] v) {
        for (int i = 0; i < v.length; i++) {
            Pessoa temp = v[i];
            int j = i;
            while (j > 0 && v[j - 1].getNome().compareTo(temp.getNome()) > 0) {
                v[j] = v[j - 1];
                j--;
                v[j] = temp;
            }
        }
    }
}
