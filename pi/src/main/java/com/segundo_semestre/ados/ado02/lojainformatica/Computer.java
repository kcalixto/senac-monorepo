/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.ado02.lojainformatica;

/**
 *
 * @author kcalixto
 */
public class Computer {
    private static String marca = "KauaChaves";
    private int id;
    private String hd;
    private String processador;

    public Computer(){}
    
    public Computer(String hd, String processador){
        this.hd = hd;
        this.processador = processador;
    }
    
    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        Computer.marca = marca;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
