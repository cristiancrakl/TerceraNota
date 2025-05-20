package Empleado;

public class Gerente extends Empleado {

    int puesto;

    public Gerente(double salario, String departamento, int puesto) {
        super(salario, departamento);
        this.puesto = puesto;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    @Override
    public double calcularSalario() {

        double salarioFinal = 0;

        switch (puesto) {
            case 1:
                System.out.println(salarioFinal = (getSalario() + (getSalario() * 0.3)));
                break;

            case 2:
                System.out.println(salarioFinal = (getSalario() + (getSalario() * 0.2)));
                break;
            case 3:
                System.out.println(salarioFinal = (getSalario() + (getSalario() * 0.1)));
                break;

            default:
                System.out.println("ingrese puesto dentro del 1 hasta el 3");
                break;
        }
        return salarioFinal;
    }
}
