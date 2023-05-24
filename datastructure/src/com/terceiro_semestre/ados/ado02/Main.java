package com.terceiro_semestre.ados.ado02;

import com.terceiro_semestre.ados.ado02.Arvore.Arvore;
import com.terceiro_semestre.ados.ado02.Arvore.Estudante;
import com.terceiro_semestre.ados.ado02.Arvore.Generate;

/*
 *  @author github.com/kcalixto
 */
public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();

        int MIN_STUDENTS = 5;
        int MAX_STUDENTS = 10;

        int test_target = 0;
        for (int i = 0; i < Generate.randomNumber(MIN_STUDENTS, MAX_STUDENTS); i++) {
            Estudante estudante = Generate.randomEstudante();
            arvore.inserir(estudante);
            if (test_target == 0) {
                test_target = estudante.getId();
            }
        }

        System.out.println("Um método que retorne a quantidade de alunos) Quantidade: " + arvore.getTotalEstudantes());

        System.out.println(
                "Um método para pesquisa por id que retorna o objeto.) Pesquisando por id=" + test_target + ": "
                        + arvore.pesquisar(test_target, arvore.getRaiz()).toString());

        System.out.println("Um método para retornar a maior média.) Estudante com maior média: " +
                arvore.pesquisarMaiorMedia(new Estudante(), arvore.getRaiz()).toString());

        System.out.println("Um método para retornar a menor média.) Estudante com menor média: " +
                arvore.pesquisarMenorMedia(new Estudante(), arvore.getRaiz()).toString());

        System.out.println(
                "Um método que gere um relatório com todas as informações de todos os alunos ordenada por id.) ordem: ");
        arvore.ordem(arvore.getRaiz());
    }
}
