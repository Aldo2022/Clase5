package org.perez.Carrito_Compras.Service;

public class ItemCarrito {
	
	private Producto producto;
	private int cant;
	
	public ItemCarrito(Producto producto, int cant) {
		this.producto = producto;
		this.cant = cant;
	}

	public ItemCarrito() {
		
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}
	
	
}
