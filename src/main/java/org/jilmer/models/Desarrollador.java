package org.jilmer.models;

import org.jilmer.interfaces.EvaluacionDesempeno;

public class Desarrollador extends Empleado implements EvaluacionDesempeno {
    private String[] lenguajes;

    public Desarrollador(int id, String nombre, String departamento, double salario, String[] lenguajes) {
        super(id, nombre, departamento, salario);
        this.lenguajes = lenguajes;
    }

    @Override
    public double calcularBono() {
        String desempeno = evaluarDesempeno();

        if (desempeno.equals("bueno")) {
            return salario * 1;
        } else if (desempeno.equals("regular")) {
            return salario * 0.5;
        } else {
            return 0;
        }
    }

    @Override
    public String evaluarDesempeno() {
        String desempeno;

        if (lenguajes.length >= 4) {
            desempeno = "bueno";
        } else if (lenguajes.length >= 2) {
            desempeno = "regular";
        } else {
            desempeno = "malo";
        }
        return desempeno;
    }
    @Override
    public void mostrarDetalles() {
        // Se sobrescribe para mostrar los detalles de los desarrolladores
        System.out.printf("Id: %d \nNombre: %s \nDepartamento: %s \nSalario: S/ %.2f \nBono: S/ %.2f [%S]\n",
                id, nombre, departamento, salario, calcularBono(), evaluarDesempeno());

        System.out.printf("Domina %d lenguaje(s)\n", lenguajes.length);

        System.out.println("----*----");
    }

    public String[] getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String[] lenguajes) {
        this.lenguajes = lenguajes;
    }
}
