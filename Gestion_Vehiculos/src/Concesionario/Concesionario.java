package Concesionario;

import Vehiculo.*;

import java.util.ArrayList;

public class Concesionario {

    private ArrayList<Vehiculo> listaVehiculos;

    public Concesionario() {
        listaVehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        listaVehiculos.add(vehiculo);
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        listaVehiculos.remove(vehiculo);
    }

    public Vehiculo buscarVehiculo(int indice) {
        if (indice >= 0 && indice < listaVehiculos.size()) {
            return listaVehiculos.get(indice);
        }
        return null;
    }

    public void mostrarVehiculos() {
        for (Vehiculo vehiculo : listaVehiculos) {
            vehiculo.mostrarInfo();
        }
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }
}
