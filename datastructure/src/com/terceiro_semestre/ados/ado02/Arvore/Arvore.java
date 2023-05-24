package com.terceiro_semestre.ados.ado02.Arvore;

/*
 *  @author Professor Gerson Risso
 *  @adapted by: github.com/kcalixto
 */
public class Arvore {

    private Estudante raiz, atual;
    private int tree_size = 1;

    public Estudante getRaiz() {
        return raiz;
    }

    public void inserir(Estudante estudante) {
        if (raiz == null) {
            raiz = estudante;
        } else {
            atual = estudante;
            inserir(atual, raiz);
        }
    }

    public void inserir(Estudante atual, Estudante raiz) {
        if (atual.getId() >= raiz.getId()) {
            if (raiz.getRight() == null) {
                raiz.setRight(atual);
                atual.setRoot(raiz);
                this.tree_size++;
            } else {
                inserir(atual, raiz.getRight());
            }
        } else {
            if (raiz.getLeft() == null) {
                raiz.setLeft(atual);
                atual.setRoot(raiz);
                this.tree_size++;
            } else {
                inserir(atual, raiz.getLeft());
            }
        }
    }

    public void preOrdem(Estudante e) {
        if (e != null) {
            System.out.print(e.toString() + "\n");
            preOrdem(e.getLeft());
            preOrdem(e.getRight());
        }
    }

    public void posOrdem(Estudante e) {
        if (e != null) {
            posOrdem(e.getLeft());
            posOrdem(e.getRight());
            System.out.print(e.toString() + "\n");// Visitar o n� raiz
        }
    }

    public void ordem(Estudante e) {
        if (e != null) {
            ordem(e.getLeft());
            System.out.print(e.toString() + "\n");// Visitar o n� raiz
            ordem(e.getRight());
        }
    }

    // ADO 02

    public int getTotalEstudantes() {
        return this.tree_size;
    }

    public Estudante pesquisar(int id, Estudante next) {
        Estudante e = null;
        if (next != null) {
            if (next.getId() == id) {
                e = next;
            } else if (next.getId() < id) {
                e = pesquisar(id, next.getRight());
            } else if (next.getId() > id) {
                e = pesquisar(id, next.getLeft());
            }
        }
        return e;
    }

    public Estudante pesquisarMaiorMedia(Estudante maior, Estudante next) {
        if (next != null) {
            if (next.getRight() != null) {
                maior = pesquisarMaiorMedia(maior, next.getRight());
            } else {
                if (next.getFinalGrade() > maior.getFinalGrade()) {
                    maior = next;
                }
            }
            if (next.getLeft() != null) {
                maior = pesquisarMaiorMedia(maior, next.getLeft());
            } else {
                if (next.getFinalGrade() > maior.getFinalGrade()) {
                    maior = next;
                }
            }
        }

        return maior;
    }

    public Estudante pesquisarMenorMedia(Estudante menor, Estudante next) {
        if (next != null) {
            if (next.getRight() != null) {
                menor = pesquisarMenorMedia(menor, next.getRight());
            } else {
                if (menor.isEmpty() || next.getFinalGrade() < menor.getFinalGrade()) {
                    menor = next;
                }
            }
            if (next.getLeft() != null) {
                menor = pesquisarMenorMedia(menor, next.getLeft());
            } else {
                if (menor.isEmpty() || next.getFinalGrade() < menor.getFinalGrade()) {
                    menor = next;
                }
            }
        }

        return menor;
    }
}
