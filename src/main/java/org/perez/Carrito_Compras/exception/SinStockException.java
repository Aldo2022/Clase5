package org.perez.Carrito_Compras.exception;

import org.perez.Carrito_Compras.Service.Producto;

public class SinStockException extends Exception{

	private final Producto producto;

	public Producto getProducto() {
		return producto;
	}
	
	public SinStockException (Producto producto) {
		this.producto=producto;
	}
	
}
