package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.post.PostDao;
import model.post.PostVo;

public class Post extends HttpServlet {

    PostVo pv = new PostVo();
    PostDao pd = new PostDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       System.out.println("Dentro del server");

        String op = req.getParameter("op");

        switch(op){
            case "form":
                form(req,resp);
            break;

            case "list":
                list(req,resp);
            break;

            case "renew":
                renew(req,resp);
            break;
            case "F":
                f(req,resp);
            break;

            case "l":
                l(req,resp);
            break;

            case "R":
                r(req,resp);
            break;

        }
    }

      // VISTA FORMULARIO REGISTRAR 

      private void form(HttpServletRequest req, HttpServletResponse resp){
        try{
            req.getRequestDispatcher("views/publicacion/postadd.jsp").forward(req, resp);
            System.out.println("Redireccion Correcta");
        }
        catch(Exception e){
            System.out.println("Redireccion invalida"+e.getMessage().toString());
        }
    }

      private void f(HttpServletRequest req, HttpServletResponse resp){
        try{
            req.getRequestDispatcher("views/publicacion/publicadd.jsp").forward(req, resp);
            System.out.println("Redireccion Correcta");
        }
        catch(Exception e){
            System.out.println("Redireccion invalida"+e.getMessage().toString());
        }
    }

    // VISTA TABLA DE DATOS 

    private void list(HttpServletRequest req, HttpServletResponse resp) {
        try {
            List <PostVo> post = pd.list();
            req.setAttribute("posts", post);
            System.out.println(post);
            req.getRequestDispatcher("views/publicacion/postlist.jsp").forward(req, resp);
            System.out.println("Datos listados correctamente");
        } catch (Exception e) {
            System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
        }
    }

    private void l(HttpServletRequest req, HttpServletResponse resp) {
        try {
            List <PostVo> post = pd.list();
            req.setAttribute("posts", post);
            System.out.println(post);
            req.getRequestDispatcher("views/publicacion/publiclist.jsp").forward(req, resp);
            System.out.println("Datos listados correctamente");
        } catch (Exception e) {
            System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
        }
    }

    //  VISTA FORMULARIO ACTUALIZAR 

    private void renew (HttpServletRequest req, HttpServletResponse resp){
        try{
            req.getRequestDispatcher("views/publicacion/postupdate.jsp").forward(req, resp);
            System.out.println("Redireccion Correcta");
        }catch(Exception e){
            System.out.println("Redireccion invalida"+e.getMessage().toString());
        }
    }

    private void r(HttpServletRequest req, HttpServletResponse resp){
        try{
            req.getRequestDispatcher("views/publicacion/publicupdate.jsp").forward(req, resp);
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
            case "a":
                a(req,resp);
            break;

            case "u":
                u(req, resp);
            break;
        }
    }
    
    private void add(HttpServletRequest req, HttpServletResponse resp){

        if(req.getParameter("dest") !=null){
            pv.setDestinatario(req.getParameter("dest"));
        }
        if(req.getParameter("etiq") !=null){
            pv.setEtiquetas(req.getParameter("etiq"));
        }
        if(req.getParameter("img") !=null){
            pv.setImagen(req.getParameter("img"));
        }
        if(req.getParameter("desc") !=null){
            pv.setDescripcion(req.getParameter("desc"));
        }
    
        try {
            pd.create(pv);
            System.out.println("Insercion exitosa");
            resp.sendRedirect("post?op=list");
        } catch (Exception e) {
            System.out.println("Insercion erronea"+e.getMessage().toString());
        }
    }

    private void a(HttpServletRequest req, HttpServletResponse resp){

        if(req.getParameter("dest") !=null){
            pv.setDestinatario(req.getParameter("dest"));
        }
        if(req.getParameter("etiq") !=null){
            pv.setEtiquetas(req.getParameter("etiq"));
        }
        if(req.getParameter("img") !=null){
            pv.setImagen(req.getParameter("img"));
        }
        if(req.getParameter("desc") !=null){
            pv.setDescripcion(req.getParameter("desc"));
        }
    
        try {
            pd.create(pv);
            System.out.println("Insercion exitosa");
            resp.sendRedirect("post?op=l");
        } catch (Exception e) {
            System.out.println("Insercion erronea"+e.getMessage().toString());
        }
    }

    private void update (HttpServletRequest req, HttpServletResponse resp){

        if(req.getParameter("id") !=null){
            pv.setId(Integer.parseInt(req.getParameter("id")));
        }
        if(req.getParameter("dest") !=null){
            pv.setDestinatario(req.getParameter("dest"));
        }
        if(req.getParameter("etiq") !=null){
            pv.setEtiquetas(req.getParameter("etiq"));
        }
        if(req.getParameter("img") !=null){
            pv.setImagen(req.getParameter("img"));
        }
        if(req.getParameter("desc") !=null){
            pv.setDescripcion(req.getParameter("desc"));
        }
       

        try {
            pd.update(pv);
            System.out.println("Actualizacion exitosa");
           resp.sendRedirect("post?op=list");
        } catch (Exception e) {
            System.out.println("Actualizacion erronea"+e.getMessage().toString());
        }
    }

    private void u (HttpServletRequest req, HttpServletResponse resp){

        if(req.getParameter("id") !=null){
            pv.setId(Integer.parseInt(req.getParameter("id")));
        }
        if(req.getParameter("dest") !=null){
            pv.setDestinatario(req.getParameter("dest"));
        }
        if(req.getParameter("etiq") !=null){
            pv.setEtiquetas(req.getParameter("etiq"));
        }
        if(req.getParameter("img") !=null){
            pv.setImagen(req.getParameter("img"));
        }
        if(req.getParameter("desc") !=null){
            pv.setDescripcion(req.getParameter("desc"));
        }
       

        try {
            pd.update(pv);
            System.out.println("Actualizacion exitosa");
           resp.sendRedirect("post?op=l");
        } catch (Exception e) {
            System.out.println("Actualizacion erronea"+e.getMessage().toString());
        }
    }


}
