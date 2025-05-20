package Libro;

public class Revista extends Libro {

    private String tipoRevista;

    public Revista(String titulo, String autor, int añoPublicacion, String tipoRevista) {
        super(titulo, autor, añoPublicacion);
        this.tipoRevista = tipoRevista;
    }

    public String gettipoRevista() {
        return tipoRevista;
    }

    public void settipoRevista(String tipoRevista) {
        this.tipoRevista = tipoRevista;
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();
        System.out.println("Clasificación: " + this.tipoRevista);
    }

}
