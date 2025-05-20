package Vehiculo;

public class Moto extends Vehiculo {

    private double cilindrada;

    public Moto(String marca, String modelo, String año, double cilindrada) {
        super(marca, modelo, año);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInfo() {

        super.mostrarInfo();
        System.out.println("Numero de cilindrada: " + cilindrada);
    }

}
