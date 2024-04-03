package org.jilmer.models;

public abstract class Empleado {
    protected int id;
    protected String nombre;
    protected String departamento;
    protected double salario;

    public Empleado(int id, String nombre, String departamento, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    public void mostrarDetalles() {
        // En caso de que las clases herederas no sobrescriban este método,
        // se imprime la información general del empleado
        System.out.printf("Id: %d \nNombre: %s \nDepartamento: %s \nSalario: S/ %.2f\n",
                id, nombre, departamento, salario);
        System.out.println("----*----");
    }
    public abstract double calcularBono();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
