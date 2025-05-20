package Vehiculo;

public class Coche extends Vehiculo {

    private int numPuertas;

    public Coche(String marca, String modelo, String año, int numPuertas) {
        super(marca, modelo, año);
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarInfo() {

        super.mostrarInfo();
        System.out.println("Numero de puertas: " + numPuertas);
    }

}
