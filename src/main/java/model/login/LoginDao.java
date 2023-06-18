package model.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Conexion;

public class LoginDao {

    Connection con ;
    PreparedStatement ps ;
    ResultSet rs;
    String sql=null;

    public boolean validate(String user, String password) throws SQLException{
        

        sql = "SELECT * FROM users where User=? AND Password=?";

        try{

            con = Conexion.conectar();
            ps = con.prepareStatement(sql);

            ps.setString(1, user);
            ps.setString(2, password);

            
            try(ResultSet rs= ps.executeQuery()){
                System.out.println("Ingreso del usuario correcto");
                return rs.next();
            }
        } catch (Exception e) {
            System.out.println("Error al ingresar " + e.getMessage().toString());
        } finally {
            con.close();
        }
        return false;
    }
    
}
