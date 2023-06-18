package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.amigos.AmigoDao;
import model.amigos.AmigoVo;

public class Amigo extends HttpServlet {

    AmigoVo av = new AmigoVo();
    AmigoDao ad = new AmigoDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Dentro del server");

        String op = req.getParameter("op");

        switch (op) {
            case "form":
                form(req, resp);
                break;

            case "lista":
                lista(req, resp);
                break;

            case "renew":
                renew(req, resp);
                break;

            case "F":
                f(req, resp);
                break;

            case "l":
                l(req, resp);
                break;

            case "R":
                r(req, resp);
                break;

        }
    }

    // FORMULARIO REGISTRAR VISTA

    private void form(HttpServletRequest req, HttpServletResponse resp){
        try{
            req.getRequestDispatcher("views/amigos/amigosadd.jsp").forward(req, resp);
            System.out.println("Redireccion Correcta");
        }
        catch(Exception e){
            System.out.println("Redireccion invalida"+e.getMessage().toString());
        }
    }

    private void f(HttpServletRequest req, HttpServletResponse resp){
        try{
            req.getRequestDispatcher("views/amigos/friendadd.jsp").forward(req, resp);
            System.out.println("Redireccion Correcta");
        }
        catch(Exception e){
            System.out.println("Redireccion invalida"+e.getMessage().toString());
        }
    }

    // TABLA DE DATOS VISTA

    private void lista(HttpServletRequest req, HttpServletResponse resp) {
        try {
            List <AmigoVo> amigo = ad.listar();
            req.setAttribute("amigos", amigo);
            System.out.println(amigo);
            System.out.println(av.getNombre());
            req.getRequestDispatcher("views/amigos/amigoslist.jsp").forward(req, resp);
            System.out.println("Datos listados correctamente");
        } catch (Exception e) {
            System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
        }
    }

    private void l(HttpServletRequest req, HttpServletResponse resp) {
        try {
            List <AmigoVo> amigo = ad.listar();
            req.setAttribute("amigos", amigo);
            System.out.println(amigo);
            System.out.println(av.getNombre());
            req.getRequestDispatcher("views/amigos/friendlist.jsp").forward(req, resp);
            System.out.println("Datos listados correctamente");
        } catch (Exception e) {
            System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
        }
    }

    // FORMULARIO ACTUALIZAR VISTA

    private void renew (HttpServletRequest req, HttpServletResponse resp){
        try{
            req.getRequestDispatcher("views/amigos/amigosupdate.jsp").forward(req, resp);
            System.out.println("Redireccion Correcta");
        }catch(Exception e){
            System.out.println("Redireccion invalida"+e.getMessage().toString());
        }
    }

    private void r(HttpServletRequest req, HttpServletResponse resp){
        try{
            req.getRequestDispatcher("views/amigos/friendupdate.jsp").forward(req, resp);
            System.out.println("Redireccion Correcta");
        }catch(Exception e){
            System.out.println("Redireccion invalida"+e.getMessage().toString());
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String op = req.getParameter("op");
        
        switch (op){
            case "add":
                add(req,resp);
            break;

            case "update":
                update(req, resp);
            break;

            case "delete":
                delete(req,resp);
            break;

            case "a":
                a(req,resp);
            break;

            case "u":
                u(req, resp);
            break;

            case "d":
                d(req,resp);
            break;

        }        
    }    

    private void add(HttpServletRequest req, HttpServletResponse resp){

        if(req.getParameter("identificacion") !=null){
            av.setIdentificacion( Integer.parseInt(req.getParameter("identificacion")));
        }
        if(req.getParameter("nombre") !=null){
            av.setNombre(req.getParameter("nombre"));
        }
        if(req.getParameter("correo") !=null){
            av.setCorreo(req.getParameter("correo"));
        }
        if(req.getParameter("telefono") !=null){
            av.setTelefono(Integer.parseInt(req.getParameter("telefono")));
        }
        if(req.getParameter("ciudad") !=null){
            av.setCiudad(req.getParameter("ciudad"));
        }
        if(req.getParameter("password") !=null){
            av.setContraseña(req.getParameter("password"));
        }
      

        try {
            ad.registrar(av);
            System.out.println("Insercion exitosa");
            resp.sendRedirect("amigo?op=lista");
        } catch (Exception e) {
            System.out.println("Insercion erronea"+e.getMessage().toString());
        }
    }

    private void a(HttpServletRequest req, HttpServletResponse resp){

        if(req.getParameter("identificacion") !=null){
            av.setIdentificacion( Integer.parseInt(req.getParameter("identificacion")));
        }
        if(req.getParameter("nombre") !=null){
            av.setNombre(req.getParameter("nombre"));
        }
        if(req.getParameter("correo") !=null){
            av.setCorreo(req.getParameter("correo"));
        }
        if(req.getParameter("telefono") !=null){
            av.setTelefono(Integer.parseInt(req.getParameter("telefono")));
        }
        if(req.getParameter("ciudad") !=null){
            av.setCiudad(req.getParameter("ciudad"));
        }
        if(req.getParameter("password") !=null){
            av.setContraseña(req.getParameter("password"));
        }
      

        try {
            ad.registrar(av);
            System.out.println("Insercion exitosa");
            resp.sendRedirect("amigo?op=l");
        } catch (Exception e) {
            System.out.println("Insercion erronea"+e.getMessage().toString());
        }
    }

    private void update (HttpServletRequest req, HttpServletResponse resp){

        if(req.getParameter("identificacion") !=null){
            av.setIdentificacion( Integer.parseInt(req.getParameter("identificacion")));
        }
        if(req.getParameter("nombre") !=null){
            av.setNombre(req.getParameter("nombre"));
        }
        if(req.getParameter("correo") !=null){
            av.setCorreo(req.getParameter("correo"));
        }
        if(req.getParameter("telefono") !=null){
            av.setTelefono(Integer.parseInt(req.getParameter("telefono")));
        }
        if(req.getParameter("ciudad") !=null){
            av.setCiudad(req.getParameter("ciudad"));
        }
        if(req.getParameter("password") !=null){
            av.setContraseña(req.getParameter("password"));
        }
       

        try {
            ad.update(av);
            System.out.println("Actualizacion exitosa");
            resp.sendRedirect("amigo?op=lista");
        } catch (Exception e) {
            System.out.println("Actualizacion erronea"+e.getMessage().toString());
        }
    }

    private void u (HttpServletRequest req, HttpServletResponse resp){

        if(req.getParameter("identificacion") !=null){
            av.setIdentificacion( Integer.parseInt(req.getParameter("identificacion")));
        }
        if(req.getParameter("nombre") !=null){
            av.setNombre(req.getParameter("nombre"));
        }
        if(req.getParameter("correo") !=null){
            av.setCorreo(req.getParameter("correo"));
        }
        if(req.getParameter("telefono") !=null){
            av.setTelefono(Integer.parseInt(req.getParameter("telefono")));
        }
        if(req.getParameter("ciudad") !=null){
            av.setCiudad(req.getParameter("ciudad"));
        }
        if(req.getParameter("password") !=null){
            av.setContraseña(req.getParameter("password"));
        }
       

        try {
            ad.update(av);
            System.out.println("Actualizacion exitosa");
            resp.sendRedirect("amigo?op=l");
        } catch (Exception e) {
            System.out.println("Actualizacion erronea"+e.getMessage().toString());
        }
    }

    private void delete (HttpServletRequest req, HttpServletResponse resp){

        if(req.getParameter("identificacion") !=null){
            av.setIdentificacion( Integer.parseInt(req.getParameter("identificacion")));
        }
        
        try {
            ad.delete(av);
            System.out.println("Inactivacion exitosa");
            resp.sendRedirect("amigo?op=lista");
        } catch (Exception e) {
            System.out.println("Inactivacion erronea"+e.getMessage().toString());
        }
    }

    private void d (HttpServletRequest req, HttpServletResponse resp){

        if(req.getParameter("identificacion") !=null){
            av.setIdentificacion( Integer.parseInt(req.getParameter("identificacion")));
        }
        
        try {
            ad.delete(av);
            System.out.println("Inactivacion exitosa");
            resp.sendRedirect("amigo?op=l");
        } catch (Exception e) {
            System.out.println("Inactivacion erronea"+e.getMessage().toString());
        }
    }

    
}
