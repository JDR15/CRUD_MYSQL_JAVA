package model.amigos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Conexion;




public class AmigoDao {
    
    Connection con ;
    PreparedStatement ps ;
    ResultSet rs;
    String sql=null;
    String a;
    String u;
    
    public String registrar(AmigoVo friend) throws SQLException{

            sql = "Insert into amigos (id_Amigo, Nombre,Correo,Telefono,Ciudad,Password,Estado) values (?,?,?,?,?,?,?)";
            try{

                con = Conexion.conectar();
                ps = con.prepareStatement(sql);
                ps.setInt(1, friend.getIdentificacion());
                ps.setString(2, friend.getNombre());
                ps.setString(3, friend.getCorreo());
                ps.setInt(4, friend.getTelefono());
                ps.setString(5, friend.getCiudad());
                ps.setString(6, friend.getContraseña());
                ps.setInt(7, 1);
                System.out.println(ps);
                ps.executeUpdate(); 
                ps.close(); 
                System.out.println("Se registró correctamente");
            }
            catch(Exception e){
                System.out.println("Error en el regisro "+e.getMessage().toString());
            }
            finally{
                con.close();
            }

        return a;
    }

    public List<AmigoVo> listar() throws SQLException{

            List<AmigoVo> amigo = new ArrayList<>();

            sql = "SELECT * FROM amigos where id_Amigo AND estado=1";
            try {
                con=Conexion.conectar();
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery(sql);
                System.out.println(sql);
                System.out.println(ps);

                while(rs.next()){

                    AmigoVo a = new AmigoVo();

                    a.setIdentificacion (rs.getInt("id_Amigo"));
                    a.setNombre(rs.getString("Nombre"));
                    a.setCorreo(rs.getString("Correo"));
                    a.setTelefono(rs.getInt("Telefono"));
                    a.setCiudad(rs.getString("Ciudad"));
                    a.setContraseña(rs.getString("Password"));
                    a.setEstado(rs.getInt("Estado"));
                    System.out.println("hh");
                    System.out.println(a.getNombre());
                    amigo.add(a);
                }
                ps.close();
                System.out.println("consulta exitosa");
            }
            catch (Exception e) {
                System.out.println("La consulta no pudo ser ejecutada "+e.getMessage().toString());
            }
            finally{
                con.close();
            }
    
        return amigo;
        
    }


    public String update (AmigoVo uVo) throws SQLException{

        sql = "UPDATE amigos SET Nombre=?, Correo=? ,Telefono=?, Ciudad=?, Password=?, Estado=? WHERE id_Amigo=?";

        try{

            con = Conexion.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, uVo.getNombre());
            ps.setString(2, uVo.getCorreo());
            ps.setInt(3, uVo.getTelefono());
            ps.setString(4, uVo.getCiudad());
            ps.setString(5, uVo.getContraseña());
            ps.setInt(6, 1);
            ps.setInt(7, uVo.getIdentificacion());
            System.out.println(ps);
            ps.executeUpdate(); 
            ps.close(); 
            System.out.println("Se actualizo correctamente");
        }
        catch(Exception e){
            System.out.println("Error al actualizar "+e.getMessage().toString());
        }
        finally{
            con.close();
        }


        return u;
    }

    
    public boolean delete(AmigoVo sVo) throws SQLException{
        boolean state = false;
        System.out.println(sVo.getIdentificacion());
        sql = "UPDATE amigos SET estado=? WHERE id_Amigo=?";

        try{

            con = Conexion.conectar();
            ps = con.prepareStatement(sql);

            ps.setInt(1, 0);
            ps.setInt(2, sVo.getIdentificacion());
            ps.executeUpdate(); 
            ps.close(); 
            System.out.println("Se inactivo correctamente");

        } catch (Exception e) {
            System.out.println("Error al inactivar el dato" + e.getMessage().toString());
        } finally {
            con.close();
        }
        return state;
    }



}
