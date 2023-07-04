package PoyectoJr;

import java.util.Scanner;

public class pruebah {
	
    public static void main(String[] args) {
    	Scanner scanner = new Scanner (System.in);
     	System.out.println("Bienvenido al programa de los empleados");
    	System.out.println("Elige un numero segun la tarea que desee hacer: ");
     	System.out.println("");
	
		
		
		System.out.println("Inserta un numero");
		System.out.println("1 para agergar al sistema un nuevo empleado");
		System.out.println("2 para despedirlo");
		System.out.println("3 para ver y aumentar el sueldo");
		System.out.println("4 para ver la lista de empleados");
		System.out.println("5 para salir del sistema");

		
		
		
		int eleccion = scanner.nextInt();
		ContratarEmpleado contratarEmpleado = new ContratarEmpleado();
    	
    	
    	switch (eleccion){
    	
    	case 1: 
            contratarEmpleado.guardarAtributos();
        break;    
        
    	case 2:
    		contratarEmpleado.guardarAtributos();
    		DespedirEmpleado despedirEmpleado = new DespedirEmpleado(contratarEmpleado.getEmpleados());
            despedirEmpleado.despido();
            break;
    	case 3:
    		contratarEmpleado.guardarAtributos();
    		AumentoSalario Aumento = new AumentoSalario (contratarEmpleado.getEmpleados());
            Aumento.aumento();
    	case 4:
    		contratarEmpleado.guardarAtributos();
    		Listar lista = new Listar(contratarEmpleado.getEmpleados());
            lista.listaEmpleados();
    	case 5:
    	break;
             
    	default:
    		System.out.println("No es un numero valido");
    		break;
        
    	}
    }
}
