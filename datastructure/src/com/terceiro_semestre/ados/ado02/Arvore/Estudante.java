package com.terceiro_semestre.ados.ado02.Arvore;

/*
 *  @author Professor Gerson Risso
 *  @adapted by: github.com/kcalixto
 */
public class Estudante {
    private Estudante root, right, left;
    private String name;
    private double exam01, exam02;
    private int absences, id;

    public Estudante() {
    }

    public Estudante(String name, double exam01, double exam02, int absences, int id) {
        this.name = name;
        this.exam01 = exam01;
        this.exam02 = exam02;
        this.absences = absences;
        this.id = id;
    }

    public Estudante getRoot() {
        return this.root;
    }

    public void setRoot(Estudante root) {
        this.root = root;
    }

    public Estudante getRight() {
        return this.right;
    }

    public void setRight(Estudante right) {
        this.right = right;
    }

    public Estudante getLeft() {
        return this.left;
    }

    public void setLeft(Estudante left) {
        this.left = left;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExam01() {
        return this.exam01;
    }

    public void setExam01(double exam01) {
        this.exam01 = exam01;
    }

    public double getExam02() {
        return this.exam02;
    }

    public void setExam02(double exam02) {
        this.exam02 = exam02;
    }

    public int getAbsences() {
        return this.absences;
    }

    public void setAbsences(int absences) {
        this.absences = absences;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEmpty() {
        return this.name == null;
    }

    // Um método para verificar se o aluno está reprovado por faltas.
    public boolean getAbsenceStatus() {
        // 18 is 25% of 72 classes
        return this.absences > 18;
    }

    // Um método para calcular e atribuir a média de cada um dos alunos.
    public double getFinalGrade() {
        return (this.exam01 + this.exam02) / 2;
    }

    @Override
    public String toString() {
        return "{" +
                "\tname='" + getName() + "'" +
                "\texam01='" + String.format("%.2f", getExam01()) + "'" +
                "\texam02='" + String.format("%.2f", getExam02()) + "'" +
                "\tabsences='" + getAbsences() + "'" +
                "\tid='" + getId() + "'" +
                "\treprovado='" + getAbsenceStatus() + "'" +
                "\tmedia final='" + String.format("%.2f", getFinalGrade()) + "'" +
                "}";
    }
}
