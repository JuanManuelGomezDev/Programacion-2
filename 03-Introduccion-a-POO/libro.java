
package tp3_programacion2_gomezjuanmanuel;

public class libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion >= 1450 && añoPublicacion <= 2023) {
            this.añoPublicacion = añoPublicacion;
        } else {
            System.out.println("Año inválido");
        }
    }
}
