package model.amigos;

public class AmigoVo {

 //ATRIBUTOS
    
    private int identificacion;
    private String nombre;
    private String correo;
    private int telefono;
    private String ciudad;
    private String contraseña;
    private int estado;

 //METODOS CONSTRUCTORES

    public AmigoVo(){

    }

    public AmigoVo(int identificacion, String nombre, String correo, int telefono, String ciudad, String contraseña,
            int estado) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.contraseña = contraseña;
        this.estado = estado;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }


}//METODOS ACCESORES 

    