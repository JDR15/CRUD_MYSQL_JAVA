package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

//ATRIBUTOS

    private static final String bbdd = "jdbc:mysql://localhost:3306/redes";
    private static final String user = "root";
    private static final String password = "1234";
    private static Connection con;


    public static Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(bbdd, user, password);
            System.out.println("Conexion Exitosa");

        }catch(Exception e){
            System.out.println("Error "+e.getMessage().toString());

        }

        return con;
    }

// PRUEBA 

    public static void main(String[] args) {
        
        Conexion.conectar();
    }

}
