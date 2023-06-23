<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Menu</title>
    <link rel="stylesheet" href="assets/css/dashb.css">
    <link rel="stylesheet" href="assets/css/t.css">
    <script src="https://kit.fontawesome.com/41bcea2ae3.js" crossorigin="anonymous"></script>

</head>
<body id="body">

    <header>
        <div class="icon__menu">
            <i class="fas fa-bars" id="btn_open"></i>
        </div>
    </header>

    <div class="menu__side" id="menu_side">

        <div class="name__page">
            <i class="fa-brands fa-instagram"></i>
            <h4>Instagram</h4>
        </div>

        <div class="options__menu">


            <a href="amigo?op=l" class="selected">
                <div class="option">
                    <i class="fa-solid fa-users" title="Inicio"></i>
                    <h4>Usuario</h4>
                </div>
            </a>
    
            <a href="amigo?op=F">
                <div class="option">
                    <i class="fa-solid fa-circle-plus" title=""></i>
                    <h4>Crear</h4>
                </div>
            </a>
    
            <a href="amigo?op=R">
                <div class="option">
                    <i class="fa-solid fa-pen-to-square"  title=""></i>
                    <h4>Actualizar</h4>
                </div>
            </a>
    
            <a href="post?op=l" class="selected">
                <div class="option">
                    <i class="fa-solid fa-laptop" title=""></i>
                    <h4>Publicación</h4>
                </div>
            </a>
    
            <a href="post?op=F">
                <div class="option">
                    <i class="fa-solid fa-file-pen" title=""></i>
                    <h4>Postear</h4>
                </div>
            </a>
    
            <a href="post?op=R">
                <div class="option">
                    <i class="fa-solid fa-pen-to-square" title=""></i>
                    <h4>Actualizar</h4>
                </div>
            </a>
            
            <a href="login?op=index">
                <div class="option">
                    <i class="fa-solid fa-right-from-bracket" title="Cerrar Sesion"></i>
                    <h4>Cerrar Sesion </h4>
                </div>
            </a>
        
        
        
        </div>



    </div>
    
    <main>
        <div class="text">

            <div class="table">
                <table>
                    <thead>
                        <th>Id</th>
                        <th>Destinatario</th>
                        <th>Etiquetas</th>
                        <th>Img</th>
                        <th>Descripcion</th>
                        <th></th>
                        <th></th>
                    </thead>

                    <c:forEach var="post" items="${posts}">

                        <tbody>
                            <td>${post.getId()}</td>
                            <td>${post.getDestinatario()}</td>
                            <td>${post.getEtiquetas()}</td>
                            <td>${post.getImagen()}</td>
                            <td>${post.getDescripcion()}</td>
                            <td>
                                <div class="btn_a">
                                    <a href="post?op=renew"><button id="Actualizar${amigo.getIdentificacion()}"
                                            onclick="actualizar('${amigo.getIdentificacion()}')">Actualizar</button></a>
                                </div>
                            </td>
                            </tr>
                        </tbody>
            </div>
            </c:forEach>
            </table>

        </div>
    </main>

    <script src="assets/js/script.js"></script>
</body>
</html>