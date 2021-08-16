package br.com.infox.dal;

import java.sql.*;


public class ModuloConexao {
    //Método responsavél por estabelecer a conexão com o banco
    public static Connection conector(){
        java.sql.Connection conexao = null;
        //a linha abaixo "chama" o driver
        String driver = "com.mysql.jbdc.Driver";
        //Armazenando informaçãoes referente a banco
        String url="jdbc:mysql://localhost:3306/dbinfox";
        String user="root";
        String password = "root";
        // Estabelecendo a conexão com banco
        try {
            Class.forName(driver);
            conexao = DriverManeger.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }
    
}