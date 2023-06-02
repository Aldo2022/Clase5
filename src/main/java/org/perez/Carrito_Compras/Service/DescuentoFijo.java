package org.perez.Carrito_Compras.Service;

public class DescuentoFijo extends Descuento{

//Metodo de Descuento	
	@Override
	public Double valorFinal(Double valorFinal) {
		
		return valorFinal-this.getValor();
	}

}
