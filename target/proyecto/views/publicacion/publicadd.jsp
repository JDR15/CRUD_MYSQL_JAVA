<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Postear</title>
    <link rel="stylesheet" href="assets/css/add_i.css">
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
            <div class="text">Publicar</div>
            </div>
              <div class="content">
               
                <form action="post" method="post"> 
                  <div class="user-details">
                    <div class="input-box">
                      <span class="details">Destinatario</span>
                      <input name="dest" type="text" placeholder="Ingrese los destinatarios " >
                    </div>
                    <div class="input-box">
                      <span class="details">Etiquetas</span>
                      <input  name="etiq" type="text" placeholder="Ingrese las cuentas que quiere etiquetar" >
                    </div>
                    <div class="input-box">
                      <span class="details">Foto/Video</span>
                      <input name="img" type="text" placeholder="Ingrese su imagen o video" >
                    </div>
                    <div class="input-box_">
                      <span class="details_">Descripcion</span>
                      <input  name="desc" type="text" class="desc_" placeholder="Ingrese la descripcion" >
                    </div>
                    
                  <div class="button">
                    <button name="op" value="a" type="submit" >Agregar</button> 
                  </div>
                  </div>
                </form>
              </div>
           
          </section>
        
    </main>

    <script src="assets/js/script.js"></script>
</body>
</html>