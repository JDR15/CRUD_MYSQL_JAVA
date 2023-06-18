package model.post;

public class PostVo {

 //ATRIBUTOS
    private int id;
    private String destinatario ;
    private String etiquetas ;
    private String imagen;
    private String descripcion ;
    private int estado;

 //METODOS CONSTRUCTORES

    public PostVo(){
        
    }

    public PostVo(int id, String destinatario, String etiquetas, String imagen, String descripcion, int estado) {
        this.id = id;
        this.destinatario = destinatario;
        this.etiquetas = etiquetas;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(String etiquetas) {
        this.etiquetas = etiquetas;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    

    


}