/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula3;

import javax.swing.JOptionPane;

/**
 *
 * @author fernando.fernandes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.setModelo("carro chave");

        Carro carroRodizio = new Carro();
        carroRodizio.setModelo("modelo nao tao chave");
        carroRodizio.setCor("preto fosco");
        carroRodizio.acelerar();

        JOptionPane.showMessageDialog(null, "Modelo: " + carroRodizio.getModelo() + ", Cor: " + carroRodizio.getCor() + " Velocidade: " + carroRodizio.getVelocidadeAtual());
    }

}
