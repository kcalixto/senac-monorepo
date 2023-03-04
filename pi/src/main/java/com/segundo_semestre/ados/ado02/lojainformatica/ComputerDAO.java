/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.ado02.lojainformatica;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author kcalixto
 */
public class ComputerDAO {

    public Computer computer;
    public BD bd;
    private PreparedStatement st;
    private ResultSet rs;
    private String sql;
    public static final byte INSERT = 1;
    public static final byte UPDATE = 2;
    public static final byte DELETE = 3;

    private static final String TABLE_NAME = "computadores";

    public ComputerDAO() {
        bd = new BD();
        computer = new Computer();
    }

    public ArrayList<Computer> findAll() {
        ArrayList<Computer> response = new ArrayList<>();
        sql = "select * from " + TABLE_NAME + ";";
        try {
            if (bd.getConnection()) {
                st = bd.c.prepareStatement(sql);
                
                rs = st.executeQuery();
                while (rs.next()) {
                    Computer c = new Computer(
                            rs.getString("hd"),
                            rs.getString("processador")
                    );
                    c.setId(rs.getInt("id"));
                    c.setMarca(rs.getString("marca"));
                    response.add(c);
                };

                return response;
            }
            return response;
        } catch (SQLException erro) {
            System.out.println("error: " + erro.getMessage());
            return response;
        }
    }

    public ArrayList<String> findAllProcessors() {
        ArrayList<String> response = new ArrayList<>();
        sql = "select processador from " + TABLE_NAME + " group by processador;";
        try {
            if (bd.getConnection()) {
                st = bd.c.prepareStatement(sql);

                rs = st.executeQuery();
                while (rs.next()) {;
                    response.add(rs.getString("processador"));
                };

                return response;
            }
            return response;
        } catch (SQLException erro) {
            System.out.println("error: " + erro.getMessage());
            return response;
        }
    }

    public ArrayList<Computer> findByProcessor(String processor) {
        ArrayList<Computer> response = new ArrayList<>();
        sql = "select * from " + TABLE_NAME + " where processador like ?;";
        try {
            if (bd.getConnection()) {
                st = bd.c.prepareStatement(sql);
                st.setString(1, processor);

                rs = st.executeQuery();
                while (rs.next()) {
                    Computer c = new Computer(
                            rs.getString("hd"),
                            rs.getString("processador")
                    );
                    c.setId(rs.getInt("id"));
                    c.setMarca(rs.getString("marca"));
                    response.add(c);
                };

                return response;
            }
            return response;
        } catch (SQLException erro) {
            System.out.println("error: " + erro.getMessage());
            return response;
        }
    }

    public void execute(Computer c, int op) {
        try {
            if (op == INSERT) {
                sql = "insert into " + TABLE_NAME + "(marca, hd, processador) values (?,?,?)";
                st = bd.c.prepareStatement(sql);

                st.setString(1, c.getMarca());
                st.setString(2, c.getHd());
                st.setString(3, c.getProcessador());

            } else if (op == UPDATE) {
                sql = "update " + TABLE_NAME + " set processador = ?, hd = ? where id = ?";
                st = bd.c.prepareStatement(sql);

                st.setString(1, c.getProcessador());
                st.setString(2, c.getHd());
                st.setInt(3, c.getId());
            } else if (op == DELETE) {
                sql = "delete from " + TABLE_NAME + " where id = ?";
                st = bd.c.prepareStatement(sql);
                st.setInt(1, c.getId());
            }
            if (st.executeUpdate() == 0) {
                System.out.println("error: operation failed");
            }
            System.out.println("sql done.");
        } catch (SQLException e) {
            System.out.println("error: " + e.getMessage());
        }
    }

}
