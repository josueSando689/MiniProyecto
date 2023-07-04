package PoyectoJr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AumentoSalario {
	 private List<ContratarEmpleado> empleados;
	 
	 public AumentoSalario() {
	        empleados = new ArrayList<>();
	    }

	    public AumentoSalario(List<ContratarEmpleado> empleados) {
	        this.empleados = empleados;
	    }

	    public void aumento () {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("BIENVENIDO AL SISTEMA PARA DAR AUMENTOSM");
	        System.out.println("");

	        System.out.println("Estos son los empleados de la empresa y sus salarios ");
	        for (ContratarEmpleado empleado : empleados) {
	            System.out.println("Nombre: " + empleado.getNombre());
	            System.out.println("Salario: " + empleado.getSalario());
	            System.out.println("");
	        }

	        System.out.println("Escribe el nombre del empleado que acreadita al aumento:");
	        String empleadoNombre = scanner.nextLine();

	        //SISTEMA DE BUSQUEDA 
	        boolean encontrado = false;
	        for (ContratarEmpleado empleado : empleados) {
	            if (empleado.getNombre().equals(empleadoNombre)) {
	                encontrado = true;

	                System.out.println("Escribe el nuevo salario:");
	                double nuevoSalario = scanner.nextDouble();
	                scanner.nextLine();

	                empleado.setSalario(nuevoSalario);

	                break;
	            }
	        }

	        if (encontrado) {
	            System.out.println("El salario se ha actulizado");
	        } else {
	            System.out.println("No se encontró al empleado en la lista.");
	        }

	    }
	}


