
package tp5_programacion2_gomezjuanmanuel;

class Foto {
    private String imagen;
    private String formato;

    // Constructor
    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    // Getters y Setters
    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }
    public String getFormato() { return formato; }
    public void setFormato(String formato) { this.formato = formato; }
}

class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // Asociación bidireccional

    // Constructor
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getter y Setter
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }
}

class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto; // Composición

    // Constructor
    public Pasaporte(String numero, String fechaEmision, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
    }

    // Getter y Setter
    public Foto getFoto() { return foto; }
    public void setFoto(Foto foto) { this.foto = foto; }
}
