package org.perez.Carrito_Compras.Service;

public class DescuentoPorcentaje  extends Descuento{

	//Metodo de Descuento
	@Override
	public Double valorFinal(Double valorFinal) {
		
		return valorFinal - (valorFinal * this.getValor());
	}

	
}
