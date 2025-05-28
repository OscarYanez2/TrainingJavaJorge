/**
 * 
 */
package com.entity;

/**
 * 
 */
public class Empleado extends Persona {
	private String area;
	private double salarioMensual;
	
	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}
	/**
	 * @param areaParam the area to set
	 */
	public void setArea(String areaParam) {
		area = areaParam;
	}
	/**
	 * @return the salarioMensual
	 */
	public double getSalarioMensual() {
		return salarioMensual;
	}
	/**
	 * @param salarioMensual the salarioMensual to set
	 */
	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}
	
}
