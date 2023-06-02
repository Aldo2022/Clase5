package org.perez.Carrito_Compras.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Carrito {
	
	Scanner leer = new Scanner(System.in);

//Atributos	
	private ArrayList<ItemCarrito>listaItems;
	private String nombre;
	
//Constructores	
	public Carrito(ArrayList<ItemCarrito> listaItems, String nombre) {
		this.listaItems = listaItems;
		this.nombre = nombre;
	}
	
	public Carrito() {
		
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
//Metodos	
	
	 public void RecibirLista(){
		
		 listaItems = new ArrayList<>();
		 
		// Producto p = new Producto();
		 
		 
		 String archivoLista = "E:\\ARG_PRO_GIT\\JavaBasico\\Clase5\\src\\resources\\listaproductos.csv";
		 String separador=",";
		 String linea="";
		 BufferedReader br = null;
		 double precioFinal=0.0;
		 try {
			 System.out.println("ingrese datos del dueño del carrito ");
			 System.out.println("nombre");
			 String name = leer.nextLine();
			 System.out.println("apellido");
			 String apellido = leer.nextLine();
			 int item=0;
			 br = new BufferedReader(new FileReader(archivoLista));
			 br.readLine(); 
			 while(( linea = br.readLine() )!= null) {
				 String [] datos = linea.split(separador);
				 System.out.println("cantidad "+datos[0]+" precio "+datos[1]+" producto "+datos[2] );
				 ItemCarrito ic = new ItemCarrito();
				 Producto p = new Producto();
				 ic.setCant(Integer.parseInt(datos[0]));
				 	p.setPrecio(Integer.parseInt(datos[1]));
				 	p.setNombreP(datos[2]);
				 ic.setProducto(p);
				 listaItems.add(ic);
				 precioFinal=precioFinal+(p.getPrecio()*ic.getCant());
				 item++;
			 }
			 System.out.println("Lista de compras de "+name);
			 for (ItemCarrito iC : listaItems) {
				System.out.println("cant "+iC.getCant()+" precio "+iC.getProducto().getPrecio()+" producto "+iC.getProducto().getNombreP());
			}
			double pagar =precio(precioFinal, item);
			System.out.println("El total a pagar es de : "+pagar+ " $");
			br.close();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally{
			 try {
				 if(br != null) {
					 br.close();
				 }
			 }catch(Exception e) {
				 e.printStackTrace();
			 }
		 }
		 
	}
	 public double precio(double precioFinal,int item) {
		 DescuentoFijo df = new DescuentoFijo();
		 DescuentoPorcentajeConTope dt = new DescuentoPorcentajeConTope();
		 DescuentoPorcentaje dp = new DescuentoPorcentaje();
		 double pFinal=0.0;
		 if(item<2) {
				pFinal=df.valorFinal(precioFinal);
			}
		 if(item>=2 && precioFinal<3000) {
				pFinal=dt.valorFinal(precioFinal);
			}
		 if(item>=2 && precioFinal>3001) {
				pFinal=dp.valorFinal(precioFinal);
			}
	 return pFinal;
	 }
	
}
