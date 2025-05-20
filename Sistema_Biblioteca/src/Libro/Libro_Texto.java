package Libro;

public class Libro_Texto extends Libro {

    private String tipoLibro;

    public Libro_Texto(String titulo, String autor, int añoPublicacion, String tipoLibro) {
        super(titulo, autor, añoPublicacion);
        this.tipoLibro = tipoLibro;
    }

    public String gettipoPortada() {
        return tipoLibro;
    }

    public void settipoPortada(String tipoLibro) {
        this.tipoLibro = tipoLibro;
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();
        System.out.println("Clasificación: " + this.tipoLibro);
    }

}