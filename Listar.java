package PoyectoJr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class Listar {

 private List<ContratarEmpleado> empleados;
	 
	 public Listar() {
	        empleados = new ArrayList<>();
	    }

	    public Listar(List<ContratarEmpleado> empleados) {
	        this.empleados = empleados;
	    }
	    
	public void listaEmpleados () {
		  Scanner scanner = new Scanner(System.in);
	        System.out.println("BIENVENIDO AL LISTADO DE LOS EMPLEADOS");
	        System.out.println("");
		  System.out.println("Estos son los empleados de la empresa:");
	        for (ContratarEmpleado empleado : empleados) {
	            System.out.println("Nombre: " + empleado.getNombre());
		
		}
	
	}
}