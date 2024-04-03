package org.jilmer;

import org.jilmer.models.Empleado;
import org.jilmer.models.Desarrollador;
import org.jilmer.models.Gerente;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Empleado> empleados = new ArrayList<>();

        // Se crean empleados de tipo desarrollador
        Empleado dev01 = new Desarrollador(2001, "Juan Pérez", "Desarrollo", 3500.0,
                new String[] {"Java","Python","JS"});
        Empleado dev02 = new Desarrollador(2002, "Camila López", "Desarrollo", 4000.5,
                new String[] {".Net","C#"});
        Empleado dev03 = new Desarrollador(2003, "Carolina Luján", "Desarrollo", 2500.0,
                new String[] {"Kotlin","Python", "Java", "PHP", "JS"});
        Empleado dev04 = new Desarrollador(2004, "Federico Paz", "Desarrollo", 3000.0,
                new String[] {"Swift"});
        Empleado dev05 = new Desarrollador(2005, "Lucía Loo", "Desarrollo", 5500.0,
                new String[] {".Net","PHP", "Perl"});
        Empleado dev06 = new Desarrollador(2006, "Luis Rivas", "Desarrollo", 2000.0,
                new String[] {"Python"});

        // Se arman los equipos
        ArrayList<Empleado> team01 = new ArrayList<>();
        team01.add(dev01);
        team01.add(dev02);
        team01.add(dev03);
        ArrayList<Empleado> team02 = new ArrayList<>();
        team02.add(dev01);
        team02.add(dev02);
        team02.add(dev03);
        team02.add(dev04);
        team02.add(dev05);
        ArrayList<Empleado> team03 = new ArrayList<>();
        team03.add(dev05);
        team03.add(dev06);
        ArrayList<Empleado> team04 = new ArrayList<>();

        // Se crean empleados de tipo gerente
        Empleado gg01 = new Gerente(1001, "Diana Canaval", "Gerencia", 7500.0, team01);
        Empleado gg02 = new Gerente(1002, "José Neira", "Gerencia", 7000.0, team02);
        Empleado gg03 = new Gerente(1003, "María Díaz", "Gerencia", 8050.0, team03);
        Empleado gg04 = new Gerente(1004, "Jorge Herrera", "Gerencia", 6500.0, team04);

        // Se agregan los empleados a la lista de empleados
        empleados.add(dev01);
        empleados.add(dev02);
        empleados.add(dev03);
        empleados.add(dev04);
        empleados.add(dev05);
        empleados.add(dev06);
        empleados.add(gg01);
        empleados.add(gg02);
        empleados.add(gg03);
        empleados.add(gg04);

        // Se lista a los empleados a detalle
        for (Empleado empleado : empleados) {
            empleado.mostrarDetalles();
        }
    }
}