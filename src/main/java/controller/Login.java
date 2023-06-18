package controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.login.LoginDao;




public class Login extends HttpServlet{

    LoginDao ld = new LoginDao();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Dentro del server");

        String op = req.getParameter("op");
        switch (op) {

            case "lf":
                lf(req, resp);
                break;

            case "index":
                index(req, resp);
                break;

            case "li":
                li(req,resp);
                break;
        }
    }

     // VISTA LOGIN

     private void lf(HttpServletRequest req, HttpServletResponse resp){
        try{
            req.getRequestDispatcher("views/login/loginF.jsp").forward(req, resp);
            System.out.println("Redireccion Correcta");
        }
        catch(Exception e){
            System.out.println("Redireccion invalida"+e.getMessage().toString());
        }
    }

     private void li(HttpServletRequest req, HttpServletResponse resp){
        try{
            req.getRequestDispatcher("views/login/login.jsp").forward(req, resp);
            System.out.println("Redireccion Correcta");
        }
        catch(Exception e){
            System.out.println("Redireccion invalida"+e.getMessage().toString());
        }
    }

    //    VISTA INDEX

    private void index(HttpServletRequest req, HttpServletResponse resp){
        try{
            req.getRequestDispatcher("index.jsp").forward(req, resp);
            System.out.println("Redireccion Correcta");
        }
        catch(Exception e){
            System.out.println("Redireccion invalida"+e.getMessage().toString());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String op = req.getParameter("op");
        
        switch (op){
            case "Ingresar":
                validate(req,resp);
            break;
            case "Enter":
                next(req,resp);
            break;
        }

    }

    private void validate(HttpServletRequest req, HttpServletResponse resp) throws IOException{

        String user = req.getParameter("user");
        String password = req.getParameter("password");
        
       try{
            if(ld.validate(user, password)){
                resp.sendRedirect("amigo?op=lista");
                System.out.println("Validacion exitosa");
            }
            else{
                req.getRequestDispatcher("views/login/loginF.jsp?error=1").forward(req, resp);
            }
       }catch(Exception e){

       }
    }

    private void next(HttpServletRequest req, HttpServletResponse resp) throws IOException{

        String user = req.getParameter("user");
        String password = req.getParameter("password");
        
       try{
            if(ld.validate(user, password)){
                resp.sendRedirect("amigo?op=l");
                System.out.println("Validacion exitosa");
            }
            else{
                req.getRequestDispatcher("views/login/login.jsp?error=1").forward(req, resp);
            }
       }catch(Exception e){

       }
    }

   


    
}
