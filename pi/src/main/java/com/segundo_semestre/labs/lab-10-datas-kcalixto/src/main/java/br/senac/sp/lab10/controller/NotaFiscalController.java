/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.lab10.controller;

import br.senac.sp.lab10.DAO.NotaFiscalDAO;
import br.senac.sp.lab10.model.NotaFiscal;
import java.util.Date;

/**
 *
 * @author fernando.fernandes
 */
public class NotaFiscalController {
    
    public static boolean Salvar(int numeroNota,double valorNota, Date dataEmissao, Date dataEntrada )
    {
        NotaFiscal obj = new NotaFiscal();
        obj.setNumeroNota(numeroNota);
        obj.setValorNota(valorNota);
        obj.setDataEmissao(dataEmissao);
        obj.setDataEntrada(dataEntrada);
        
        return NotaFiscalDAO.Salvar(obj);
    }

}
