package model.post;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Conexion;

public class PostDao {
    
    Connection con ;
    PreparedStatement ps ;
    ResultSet rs;
    String sql=null;
    String c;
    String u;

     
    public String create(PostVo post) throws SQLException{

        sql = "insert into publicacion (Destinatario, Etiquetas, Img, Descripcion, Estado) values (?, ?, ?, ?, ?)";
        try{

            con = Conexion.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, post.getDestinatario());
            ps.setString(2, post.getEtiquetas());
            ps.setString(3, post.getImagen());
            ps.setString(4, post.getDescripcion());
            ps.setInt(5, 1);
            System.out.println(ps);
            ps.executeUpdate(); 
            ps.close(); 
            System.out.println("Se publico correctamente");
        }
        catch(Exception e){
            System.out.println("Error al publicar "+e.getMessage().toString());
        }
        finally{
            con.close();
        }

    return c;
    }

    public List<PostVo> list() throws SQLException{

        List<PostVo> post = new ArrayList<>();

        sql = "SELECT * FROM publicacion where id_Public AND estado=1";
        try {
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery(sql);
            System.out.println(sql);
            System.out.println(ps);

            while(rs.next()){

                PostVo p = new PostVo();
                
                p.setId(rs.getInt("id_Public"));
                p.setDestinatario(rs.getString("Destinatario"));
                p.setEtiquetas(rs.getString("Etiquetas"));
                p.setImagen(rs.getString("Img"));
                p.setDescripcion(rs.getString("Descripcion"));
                p.setEstado(rs.getInt("Estado"));
                System.out.println("hh");
                
                post.add(p);
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

        return post;
    
    }

    public String update (PostVo pVo) throws SQLException{

    sql = "UPDATE publicacion SET Destinatario=?, Etiquetas=? , Img=?, Descripcion=?, Estado=? WHERE id_Public=?";

    try{

        con = Conexion.conectar();
        ps = con.prepareStatement(sql);
        ps.setString(1, pVo.getDestinatario());
        ps.setString(2, pVo.getEtiquetas());
        ps.setString(3, pVo.getImagen());
        ps.setString(4, pVo.getDescripcion());
        ps.setInt(5, 1);
        ps.setInt(6, pVo.getId());
        System.out.println(ps);
        ps.executeUpdate(); 
        ps.close(); 
        System.out.println("Se actualizo el post correctamente");
    }
    catch(Exception e){
        System.out.println("Error al actualizar el post "+e.getMessage().toString());
    }
    finally{
        con.close();
    }


    return u;
    }

}
