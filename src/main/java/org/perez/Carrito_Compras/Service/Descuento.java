package org.perez.Carrito_Compras.Service;

public abstract class Descuento  {
	
//Variable	
	private Double valor;

//Getters Setters	
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

//Metodo Abstracto	
	public abstract Double valorFinal(Double valorFinal);
	
	
	
}
