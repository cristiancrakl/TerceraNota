package Libro;

public class Novela extends Libro {

    private String tipoNovela;

    public Novela(String titulo, String autor, int añoPublicacion, String tipoNovela) {
        super(titulo, autor, añoPublicacion);
        this.tipoNovela = tipoNovela;
    }

    public String gettipoNovela() {
        return tipoNovela;
    }

    public void settipoNovela(String tipoNovela) {
        this.tipoNovela = tipoNovela;
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();
        System.out.println("Clasificación: " + this.tipoNovela);
    }

}
