package Empresa;

import java.util.ArrayList;

import Empleado.Empleado;

public class Empresa {

    private ArrayList<Empleado> listaEmpleados;

    public void iniciarEmpresa() {
        listaEmpleados = new ArrayList<>();
    }

    public void agregarEmpleados(Empleado empleado) {

        listaEmpleados.add(empleado);
    }

    public void mostrarEmpleados() {

        for (Empleado empleado : listaEmpleados) {
            empleado.mostrarInformacion();
        }

    }

    public void calcularNominaTotal() {
        double total = 0;
        for (Empleado empleado : listaEmpleados) {
            total += empleado.calcularSalario();
        }
        System.out.println("La nomina total es de: $" + total);
    }

}
