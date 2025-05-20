package Vehiculo;

public class Vehiculo_De_Carga extends Vehiculo {

    private double capacidadDeCarga;

    public Vehiculo_De_Carga(String marca, String modelo, String año, int capacidadDeCarga) {
        super(marca, modelo, año);
        this.capacidadDeCarga = capacidadDeCarga;
    }

    @Override
    public void mostrarInfo() {

        super.mostrarInfo();
        System.out.println("Numero de capacidadDeCarga en toneladas: " + capacidadDeCarga);
    }

}
