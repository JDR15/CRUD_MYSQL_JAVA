<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registrar</title>
    <link rel="stylesheet" href="assets/css/friend.css">
    <link rel="stylesheet" href="assets/css/dashb.css">
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
      <section class="home-section">
        <div class="title">
          <div class="text">Actualizar</div>
        </div>
        <div class="content">
          
                <form action="amigo" method="post"> 
                  <div class="user-details">
                    <div class="input-box">
                      <span class="details">Identificacion</span>
                      <input name="identificacion" type="text"  placeholder="Ingrese su identificacion">
                    </div>
                    <div class="input-box">
                      <span class="details">Nombre</span>
                      <input  name="nombre" type="text" placeholder="Ingrese su nombre" >
                    </div>
                    <div class="input-box">
                      <span class="details">Correo</span>
                      <input name="correo" type="text" placeholder="Ingrese su correo" >
                    </div>
                    <div class="input-box">
                      <span class="details">Telefono</span>
                      <input  name="telefono" type="text" placeholder="Ingrese su telefono"  >
                    </div>
                    <div class="input-box">
                      <span class="details">Ciudad</span>
                      <input name="ciudad" type="text" placeholder="Ingrese su ciudad">
                    </div>
                    <div class="input-box">
                      <span class="details">Contraseña</span>
                      <input name="password" type="text" placeholder="Ingrese su contraseña" value="${amigo.getContraseña()}" >
                    </div>
                  </div>
                  <div class="button">
                   <button type="submit" name="op" value="u">Actualizar</button>
                  
                   <!-- <button type="submit" name="op" value="delete">Inactivar</button> -->
                  </div>
                </form>

              </div>
           
          </section>
        
    </main>

    <script src="assets/js/script.js"></script>
</body>
</html>