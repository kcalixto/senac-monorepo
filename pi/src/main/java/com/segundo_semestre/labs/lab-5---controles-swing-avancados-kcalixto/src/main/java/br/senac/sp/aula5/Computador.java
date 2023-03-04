/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula5;

/**
 *
 * @author kaua.calixto
 */
public class Computador {
    public static String fabricante = "Kauã Chaves Calixto";
    public String tipoComputador, sistemaOperacional, HD;
    public String[] acessorios, serviços;
    
    public Computador(){}

    public String getTipoComputador() {
        return tipoComputador;
    }

    public void setTipoComputador(String tipoComputador) {
        this.tipoComputador = tipoComputador;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getHD() {
        return HD;
    }

    public void setHD(String HD) {
        this.HD = HD;
    }

    public String[] getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(String[] acessorios) {
        this.acessorios = acessorios;
    }

    public String[] getServiços() {
        return serviços;
    }

    public void setServiços(String[] serviços) {
        this.serviços = serviços;
    }
    
    
}
