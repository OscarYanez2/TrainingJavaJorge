/**
 * 
 */
package com.curso;

import java.util.Scanner;

import com.entity.Empleado;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Hola Mundo!");
		
		Scanner sc = new Scanner(System.in);
		
		Empleado jorch = new Empleado();
		
		jorch.setNombre( sc.next() );
		jorch.setEdad( sc.nextInt() );
		jorch.setSalarioMensual( sc.nextDouble() );
		jorch.setArea( sc.next() );
		
		double salarioAnual = calculaSalarioAnual( jorch.getSalarioMensual() );
		
		System.out.println("Imprime el nombre del objeto jorch: " + jorch.getNombre());
		
		System.out.println("Nombre: " + jorch.getNombre());
		System.out.println("Edad: " + jorch.getEdad());
		System.out.println("Área: " + jorch.getArea());
		System.out.println("Salario anual: " + salarioAnual);
	}
	
	public static double calculaSalarioAnual( double salarioMensual ) {
		return salarioMensual * 12;
	}

}
