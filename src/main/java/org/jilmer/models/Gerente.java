package org.jilmer.models;

import org.jilmer.interfaces.EvaluacionDesempeno;

import java.util.ArrayList;

public class Gerente extends Empleado implements EvaluacionDesempeno {
    private ArrayList<Empleado> equipo;

    public Gerente(int id, String nombre, String departamento, double salario, ArrayList<Empleado> equipo) {
        super(id, nombre, departamento, salario);
        this.equipo = equipo;
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

        if (equipo.size() >= 5) {
            desempeno = "bueno";
        } else if (equipo.size() >= 3) {
            desempeno = "regular";
        } else {
            desempeno = "malo";
        }
        return desempeno;
    }
    @Override
    public void mostrarDetalles() {
        // Se sobrescribe para mostrar los detalles de los gerentes
        System.out.printf("Id: %d \nNombre: %s \nDepartamento: %s \nSalario: S/ %.2f \nBono: S/ %.2f [%S]\n",
                id, nombre, departamento, salario, calcularBono(), evaluarDesempeno());

        System.out.printf("Tiene %d personas a su cargo\n", equipo.size());

        System.out.println("----*----");
    }

    public ArrayList<Empleado> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Empleado> equipo) {
        this.equipo = equipo;
    }
}
