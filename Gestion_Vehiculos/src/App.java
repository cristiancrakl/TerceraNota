import Concesionario.Concesionario;
import Vehiculo.Coche;

public class App {
    public static void main(String[] args) {

        Coche coche1 = new Coche("toyota", "trd", "1992", 5);

        Concesionario cs = new Concesionario();
        cs.agregarVehiculo(coche1);

        cs.mostrarVehiculos();

    }
}
