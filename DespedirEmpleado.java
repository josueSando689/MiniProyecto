package PoyectoJr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DespedirEmpleado {
    private List<ContratarEmpleado> empleados;

    public DespedirEmpleado() {
        empleados = new ArrayList<>();
    }

    public DespedirEmpleado(List<ContratarEmpleado> empleados) {
        this.empleados = empleados;
    }

    public void despido() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("BIENVENIDO AL SISTEMA PARA DESPEDIR EMPLEADOS");
        System.out.println("");

        System.out.println("Estos son los empleados de la empresa:");
        for (ContratarEmpleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Edad: " + empleado.getEdad());
            System.out.println("Salario: " + empleado.getSalario());
            System.out.println("");
        }

        System.out.println("Escribe el nombre del empleado a despedir. ");
        String empleadoDespedido = scanner.nextLine();

        boolean encontrado = false;
        for (ContratarEmpleado empleado : empleados) {
            if (empleado.getNombre().equals(empleadoDespedido)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
           empleados.removeIf(empleado -> empleado.getNombre().equals(empleadoDespedido));
            System.out.println("El empleado ha sido despedido.");
        } else {
          System.out.println("No se encontró al empleado en la lista.");
        }

    }
}
