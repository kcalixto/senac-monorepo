/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.lab10.DAO;

import br.senac.sp.lab10.model.NotaFiscal;
import br.senac.sp.lab10.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author fernando.fernandes
 */
public class NotaFiscalDAO {
    
    public static boolean Salvar(NotaFiscal pNotaFiscal)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
           //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciadorConexao.abrirConexao();
            
            instrucaoSQL = conexao.prepareStatement("INSERT INTO NotaFiscal (numeroNota,ValorNota,DataEmissao,DataEntrada) VALUES(?,?,?,?)"
                                                    , Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar o ID
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setInt(1, pNotaFiscal.getNumeroNota());
            instrucaoSQL.setDouble(2, pNotaFiscal.getValorNota());
            //Converter a dataEmissao da nota fiscal para o padrão java.sql.Date
            instrucaoSQL.setDate(3, new java.sql.Date(pNotaFiscal.getDataEmissao().getTime()));
            instrucaoSQL.setDate(4, new java.sql.Date(pNotaFiscal.getDataEntrada().getTime()));
            
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0){
                retorno = true;
                
                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                        pNotaFiscal.setIdNota(generatedKeys.getInt(1));
                }else {
                        throw new SQLException("Falha ao obter o ID da Nota Fiscal!.");
                }
            }else{
                retorno = false;
            }
            
        }catch (SQLException | ClassNotFoundException ex) {

            System.out.println(ex.getMessage());
            retorno = false;
        }finally{

            //Libero os recursos da memória
            try {
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();

                GerenciadorConexao.fecharConexao();

              } catch (SQLException ex) {
             }
        }

        return retorno;
    }
    
}
