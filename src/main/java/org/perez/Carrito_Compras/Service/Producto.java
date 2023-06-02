package org.perez.Carrito_Compras.Service;

public class Producto {

	private String nombreP;
	private int precio;
	
	public Producto(String nombreP, int precio) {
		this.nombreP = nombreP;
		this.precio = precio;
	}
	
	public Producto() {
		
	}

	public String getNombreP() {
		return nombreP;
	}

	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
}
