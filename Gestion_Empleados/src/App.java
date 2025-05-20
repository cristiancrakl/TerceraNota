import Empleado.Gerente;
import Empresa.Empresa;

public class App {
    public static void main(String[] args) {

        Gerente gerente1 = new Gerente(2500, "administrativo", 3);
        Gerente gerente2 = new Gerente(2700, "administrativo", 1);

        Empresa em = new Empresa();

        em.iniciarEmpresa();

        em.mostrarEmpleados();

        em.agregarEmpleados(gerente1);
        em.agregarEmpleados(gerente2);
        em.mostrarEmpleados();

        em.calcularNominaTotal();

    }
}
