/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.lab8.DAO;

import br.senac.sp.lab8.model.Cliente;
import br.senac.sp.lab8.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author fernando.fernandes
 */
public class ClienteDAO {
    
    
    public static boolean salvar(Cliente p)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
            //Passo 1
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Passo 2 - DriverManager para abrir a conexão
            String URL = "jdbc:mysql://localhost:3306/lojamvc?useTimezone=true&serverTimezone=UTC&useSSL=false";
            
            conexao = DriverManager.getConnection(URL, "root", "");
            //conexao = GerenciadorConexao.abrirConexao();
            
            
            //Passo 3 - Executar uma instrução SQL
            instrucaoSQL = conexao.prepareStatement("INSERT INTO cliente (nome,CPF) VALUES(?, ?)"
                                                    , Statement.RETURN_GENERATED_KEYS);
            
            //Tenta estabeler a conexão com o SGBD e cria comando a ser executado conexão
            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            //conexao = GerenciadorConexao.abrirConexao();
            
//            instrucaoSQL = conexao.prepareStatement("INSERT INTO cliente (nome,CPF) VALUES(?, ?)"
//                                                    , Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar o ID do cliente
//            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, p.getNome());
            instrucaoSQL.setString(2, p.getCPFSomenteNumeros());
            
            //Executar a instrução SQL
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0)
            {
                retorno = true;
                
                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                        p.setId(generatedKeys.getInt(1));
                }
                else {
                    throw new SQLException("Falha ao obter o ID do cliente.");
                }
            }
            else{
                retorno = false;
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally{
            
            //Libero os recursos da memória
            try {
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
//                GerenciadorConexao.fecharConexao();
                conexao.close();
                
              } catch (SQLException ex) {
             }
        }
        
        return retorno;
    }
    
    public static boolean atualizar(Cliente p)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
            //Tenta estabeler a conexão com o SGBD e cria comando a ser executado conexão
            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            //conexao = GerenciadorConexao.abrirConexao();
            
            //Passo 1
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Passo 2 - DriverManager para abrir a conexão
            String URL = "jdbc:mysql://localhost:3306/lojamvc?useTimezone=true&serverTimezone=UTC&useSSL=false";
            
            conexao = DriverManager.getConnection(URL, "root", "");
            
            instrucaoSQL = conexao.prepareStatement("UPDATE cliente SET nome = ?, CPF=? WHERE idCliente =? ");
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, p.getNome());
            instrucaoSQL.setString(2, p.getCPFSomenteNumeros());
            instrucaoSQL.setInt(3, p.getId());
            
            //Mando executar a instrução SQL
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0)
            {
                retorno = true;
            }
            else{
                retorno = false;
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally{
            
            //Libero os recursos da memória
            try {
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                //GerenciadorConexao.fecharConexao();
                conexao.close();
                
              } catch (SQLException ex) {
             }
        }
        
        return retorno;
    }
    
    public static boolean excluir(int pID)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
            // Tarefa 2.2 Already done :(
            
            //Tenta estabeler a conexão com o SGBD e cria comando a ser executado conexão
            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            //conexao = GerenciadorConexao.abrirConexao();
            
            //Passo 1
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Passo 2 - DriverManager para abrir a conexão
            String URL = "jdbc:mysql://localhost:3306/lojamvc?useTimezone=true&serverTimezone=UTC&useSSL=false";
            
            conexao = DriverManager.getConnection(URL, "root", "");
            
            instrucaoSQL = conexao.prepareStatement("DELETE FROM cliente WHERE idCliente = ?");
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setInt(1, pID);

            //Mando executar a instrução SQL
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0)
            {
                retorno = true;
            }
            else{
                retorno = false;
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally{
            
            //Libero os recursos da memória
            try {
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                //GerenciadorConexao.fecharConexao();
                conexao.close();
                
              } catch (SQLException ex) {
             }
        }
        
        return retorno;
    }
    
    public static ArrayList<Cliente> consultarClientes()
    {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        //Armazeno as informaçoes da tabela (resultSet) em um ArrayList
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        
        try {
            
            //conexao = GerenciadorConexao.abrirConexao();
            //Passo 1
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Passo 2 - DriverManager para abrir a conexão
            String URL = "jdbc:mysql://localhost:3306/lojamvc?useTimezone=true&serverTimezone=UTC&useSSL=false";
            
            conexao = DriverManager.getConnection(URL, "root", "");
            
            //Passo 3 - Executo a instrução SQL
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM cliente;");

            //Executa a Query (Consulta) - Retorna um objeto da classe ResultSet
            rs = instrucaoSQL.executeQuery();
            
            //Percorrer o resultSet
            while(rs.next())
            {
                Cliente c = new Cliente();
                c.setId(rs.getInt("idcliente"));
                c.setNome(rs.getString("nome"));
                c.setCPF(rs.getString("CPF"));
                
                //Adiciono na listaClientes
                listaClientes.add(c);
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaClientes = null;
        } finally{
            //Libero os recursos da memória
            try {
                if(rs!=null)
                    rs.close();                
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                conexao.close();
                //GerenciadorConexao.fecharConexao();
                        
              } catch (SQLException ex) {
             }
        }
        
        return listaClientes;
    }
    
    public static ArrayList<Cliente> consultarClientes(String pNome)
    {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        
        try {
            
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM cliente WHERE nome LIKE ?;");
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1,"%" + pNome + '%' );

            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
                Cliente c = new Cliente();
                c.setId(rs.getInt("idcliente"));
                c.setNome(rs.getString("nome"));
                c.setCPF(rs.getString("CPF"));
                listaClientes.add(c);
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaClientes = null;
        } finally{
            //Libero os recursos da memória
            try {
                if(rs!=null)
                    rs.close();                
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                GerenciadorConexao.fecharConexao();
                        
              } catch (SQLException ex) {
             }
        }
        
        return listaClientes;
    }
    
}
