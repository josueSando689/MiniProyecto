package PoyectoJr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContratarEmpleado {
    private Scanner scanner;
    private String nombre;
    private int edad;
    private double salario;
    private List<ContratarEmpleado> empleados;

    public ContratarEmpleado() {
        scanner = new Scanner(System.in);
        empleados = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public List<ContratarEmpleado> getEmpleados() {
        return empleados;
    }

    public void guardarAtributos() {
        System.out.println("BIENVENIDO AL SISTEMA DE NUEVOS EMPLEADOS: ");
        System.out.println("");

        System.out.println("Cuando termine la inscripción escribe SALIR");
        String terminarBucleNuevoEmpleado = "";

        while (!terminarBucleNuevoEmpleado.equals("SALIR")) {
            ContratarEmpleado nuevoEmpleado = new ContratarEmpleado();

            System.out.println("Escribe el nombre del nuevo empleado");
            String nombreEmpleado = scanner.nextLine();
            nuevoEmpleado.setNombre(nombreEmpleado);

            System.out.println("Escribe la edad del nuevo empleado");
            int edadEmpleado = scanner.nextInt();
            scanner.nextLine();
            nuevoEmpleado.setEdad(edadEmpleado);

            System.out.println("Escribe el salario del nuevo empleado");
            double salarioEmpleado = scanner.nextDouble();
            scanner.nextLine();
            nuevoEmpleado.setSalario(salarioEmpleado);

            empleados.add(nuevoEmpleado);
            System.out.println("Escribe SALIR para terminar la inscripción o cualquier otra tecla para continuar");
            terminarBucleNuevoEmpleado = scanner.nextLine();
        }
    }

    public void imprimirEmpleados() {
        System.out.println("Empleados registrados:");
        for (ContratarEmpleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Edad: " + empleado.getEdad());
            System.out.println("Salario: " + empleado.getSalario());
            System.out.println("");
        }
        
        
    }
}

