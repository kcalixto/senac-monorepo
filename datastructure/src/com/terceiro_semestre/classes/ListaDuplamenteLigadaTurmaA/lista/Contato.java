package com.terceiro_semestre.classes.ListaDuplamenteLigadaTurmaA.lista;

/*
 *  Professor Gerson Risso
 */
public class Contato {
  private String nome, tel;
  private int id;
  private static int v=1;
          
    public Contato() {
    }

    public Contato(String nome, String tel) {
        this.nome = nome;
        this.tel = tel;
        this.id=v++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", tel=" + tel + ", id=" + id + '}';
    }
  
}
