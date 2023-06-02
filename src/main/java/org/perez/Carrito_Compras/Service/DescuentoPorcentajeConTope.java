package org.perez.Carrito_Compras.Service;

public class DescuentoPorcentajeConTope extends Descuento{

//Variable 	
	private double descf=0.50;
	
//Metodo de Descuento	
	@Override
	public Double valorFinal(Double valorFinal) {
		Double vtot =0.0;
		
		if(valorFinal >=5000.0) {
			vtot= valorFinal*descf;
		}else {
			vtot=valorFinal;
		}
		return vtot;
	}

}
