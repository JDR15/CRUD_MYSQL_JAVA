<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/css/log.css">
    <title>Inicio de Sesion </title>
</head>

<body>
    <div class="caja">
        <h2>Login</h2>

        <!-- MENSAJE DE ERROR -->
        <% if (request.getParameter("error") != null) { %>
            <p class="error" >Datos incorrectos. Por favor, intentelo nuevamente.</p>
        <% } %>

        <form action="login" method="post">
            <div class="inputcaja">
                <input type="text" placeholder="Ingrese su usuario" name="user" required>
            </div>

            <div class="inputcaja">
                <input type="password" placeholder="Ingrese su contraseña" name="password" required>
            </div>

            <div > <br>
                <input type="submit" name="op" value="Enter" class="box">
                <a href="login?op=index"><input type="button" value="Regresar" class="boxx"></a>
            </div>

        </form>
    </div>
</body>
</html>