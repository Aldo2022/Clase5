package org.perez.Carrito_Compras;

import java.util.ArrayList;

import org.perez.Carrito_Compras.*;
import org.perez.Carrito_Compras.Service.Carrito;
import org.perez.Carrito_Compras.Service.DescuentoFijo;
import org.perez.Carrito_Compras.Service.DescuentoPorcentaje;
import org.perez.Carrito_Compras.Service.DescuentoPorcentajeConTope;
import org.perez.Carrito_Compras.Service.ItemCarrito;

public class App{ 

    public static void main( String[] args ){
    	Carrito c = new Carrito();
    	//ArrayList<ItemCarrito>listaItems = new ArrayList<>();
    	DescuentoFijo df = new DescuentoFijo ();
    	df.setValor(20.0);
    	
    	DescuentoPorcentaje dp = new DescuentoPorcentaje();
    	dp.setValor(0.3);
    	
    	DescuentoPorcentajeConTope dt = new DescuentoPorcentajeConTope();
        dt.setValor(2000.0);
        
        System.out.println("el valor Total es de "+df.valorFinal(100.0));
        System.out.println("el valor Total es de "+dp.valorFinal(100.0));
        System.out.println("el valor Total es de "+dt.valorFinal(3001.0));
        
        c.RecibirLista();
    }
    
    
}
