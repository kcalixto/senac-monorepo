package com.terceiro_semestre.classes.ListaDuplamenteLigadaTurmaA.lista;

/*
 *  Professor Gerson Risso
 */
public class Lista {

    private Elemento inicio, atual, aux;

    public boolean verificar() {
        return inicio == null;
    }
/*
                            Exerc�cio
             
             b) Um m�todo para inserir em uma posi��o qualquer
             da lista dupla. N�o deve inserir no in�cio e nem 
             no fim da lista.
             public void inserir(Object objeto, int posicao)
             
             */
    public void inserir(Object objeto, int posicao){
      if(posicao>0 && posicao<tamanho()){
        Elemento e=inicio, novo;
        for(int i=1;i<posicao;i++){
          e=e.getProx();
        }
        novo=new Elemento(objeto,e.getProx(),e);
        e.getProx().setAnt(novo);
        e.setProx(novo);
      }else{
          System.out.println("Valor inv�lido!");
      }
    }
    
    public void inserir(Object objeto) {
        if (verificar()) {
            inicio = new Elemento(objeto, null, null);
            aux = inicio;
        } else {
            atual = new Elemento(objeto, null, aux);
            aux.setProx(atual);
            aux = atual;
        }
    }

    public int tamanho() {
        int cont = 0;
        Elemento e = inicio;
        while (e != null) {
            cont++;
            e = e.getProx();
        }
        return cont;
    }

    public void exibir() {
        Elemento e = inicio;
        while (e != null) {
            System.out.println(e.getObjeto());
            e = e.getProx();
        }
    }

    public Elemento pesquisar(int id) {
        Elemento e = inicio;
        Contato c;
        while (e != null) {
            c = (Contato) e.getObjeto();
            if (id == c.getId()) {
                return e;
            }
            e = e.getProx();
        }
        return null;
    }

    /**
     * Remove um elemento da lista simplesmente ligada considerando tr�s casos:
     * Remo��o do primeiro elemento, remo��o do �ltimo e remo��o de um elemento
     * qualquer.
     *
     * @param id int
     */
    public void remover(int id) {
        Elemento e = pesquisar(id);
        if (e != null) {
            if (e == inicio) {//1-Remo��o do primero elemento
                inicio = e.getProx();
                e.setProx(null);
                inicio.setAnt(null);
            } else if (e == atual) {//2-Remo��o do �ltimo elemento
                aux = e.getAnt();
                atual = aux;
                aux.setProx(null);
                e.setAnt(null);
            } else {
                e.getAnt().setProx(e.getProx());
                e.getProx().setAnt(e.getAnt());
                e.setAnt(null);
                e.setProx(null);
            }

           
        }
    }

}
