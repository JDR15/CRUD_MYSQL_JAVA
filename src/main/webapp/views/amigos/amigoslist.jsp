<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Menu</title>
    <link rel="stylesheet" href="assets/css/dash.css">
    <link rel="stylesheet" href="assets/css/tab.css">
    <script src="https://kit.fontawesome.com/41bcea2ae3.js" crossorigin="anonymous"></script>
    <style>
        .text table {
            border-collapse: collapse;
            margin: 10px 0;
            font-size: 17px;
            width: 700px;
            border-radius: 5px 5px 0 0;
            overflow: hidden;
            box-shadow: 0 0 20px rgb(0, 0, 0, 0.15);
            font-family: sans-serif;
        }
        
        
        .text .table thead tr {
            background-color: #07ABFF;
            color: #000000;
            text-align: left;
            font-weight: bold;
        }
        
        .text .table th,
        .text .table td {
            padding: 12px 15px;
        }
        
        .text .table tbody tr {
            border-bottom: 1px solid #dddddd;
        }
        
        .text .table tbody tr:nth-of-type(even) {
            background-color: #f3f3f3;
        }
        
        .text .table tbody tr:last-of-type {
            border-bottom: 2px solid #07ABFF;
        }
        
        .text .table .btn_a button{
            /* color: #4078e0; */
            background-color:#4078e0;
            padding: 10px 10px;
            border: none;
            font-size: 16px;
            border-radius: 10px;
            color: #f3f3f3;
        }
        
        .text .table .btn_i button{
            background-color:#e04040;
            padding: 10px 10px;
            border: none;
            font-size: 16px;
            border-radius: 10px;
            color: #f3f3f3;
        }
    </style>

</head>

<body id="body">

    <header>
        <div class="icon__menu">
            <i class="fas fa-bars" id="btn_open"></i>
        </div>
    </header>

    <div class="menu__side" id="menu_side">

        <div class="name__page">
            <i class="fa-brands fa-square-facebook"></i>
            <h4>Facebook</h4>
        </div>

        <div class="options__menu">


            <a href="amigo?op=lista" class="selected">
                <div class="option">
                    <i class="fa-solid fa-users" title="Inicio"></i>
                    <h4>Usuario</h4>
                </div>
            </a>

            <a href="amigo?op=form">
                <div class="option">
                    <i class="fa-solid fa-circle-plus" title=""></i>
                    <h4>Crear</h4>
                </div>
            </a>

            <a href="amigo?op=renew">
                <div class="option">
                    <i class="fa-solid fa-pen-to-square"  title=""></i>
                    <h4>Actualizar</h4>
                </div>
            </a>

            <a href="post?op=list" class="selected">
                <div class="option">
                    <i class="fa-solid fa-laptop" title=""></i>
                    <h4>Publicación</h4>
                </div>
            </a>

            <a href="post?op=form">
                <div class="option">
                    <i class="fa-solid fa-file-pen" title=""></i>
                    <h4>Postear</h4>
                </div>
            </a>

            <a href="post?op=renew">
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
            
            <table>
                <thead>
                    <th>Identificacion</th>
                    <th>Nombre</th>
                    <th>Correo</th>
                    <th>Telefono</th>
                    <th>Ciudad</th>
                    <th>Contraseña</th>
                </thead>
            
                <c:forEach var="amigo" items="${amigos}">
            
                    <tbody>
                        <td>${amigo.getIdentificacion()}</td>
                        <td>${amigo.getNombre()}</td>
                        <td>${amigo.getCorreo()}</td>
                        <td>${amigo.getTelefono()}</td>
                        <td>${amigo.getCiudad()}</td>
                        <td>${amigo.getContraseña()}</td>
                        <td>
                            <div class="btn_a">
                                <a href="amigo?op=renew"><button id="Actualizar${amigo.getIdentificacion()}" onclick="actualizar('${amigo.getIdentificacion()}')">Actualizar</button></a>
                            </div>
                        </td>
                        <td>
                            <form action="amigo" method="post" id="Inactivar${amigo.getIdentificacion()}">
                                <input type="hidden" name="identificacion" value="${amigo.getIdentificacion()}">
                                <div class="btn_i">
                                    <button type="submit" name="op" value="delete" onclick="inactivar('${amigo.getIdentificacion()}')">Inactivar</button>
                                </div>
                            </form>
                        </td>

                    </tbody>
            
                </c:forEach>
            
            
            </table>

        </div>
    </main>

    <script src="assets/js/script.js">

        function inactivar(id) {
            var Inactivate = document.getElementById('Inactivar' + id);
            Swal.fire({
            }).then((result) => {
                if (result.isConfirmed) {
                    Inactivate.submit();
                }

            });
        }
        function actualizar(id) {
            var actualized = document.getElementById('Actualizar' + id);
            console.log(actualized)
            console.log(id)
            Swal.fire({
            }).then((result) => {
                if (result.isConfirmed) {
                    actualized.submit();
                }

            });
        }
    </script>
</body>
</html>