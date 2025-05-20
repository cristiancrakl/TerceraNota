package Empleado;

public class Empleado {

    private double salario;
    private String departamento;

    public Empleado(double salario, String departamento) {
        this.salario = salario;
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void mostrarInformacion() {
        System.out.println("Salario: $" + salario);
        System.out.println("Departamento: " + departamento);
        System.out.println("");

    }

    public double calcularSalario() {
        return salario;
    }

}
