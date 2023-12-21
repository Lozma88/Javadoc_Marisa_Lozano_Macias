package javadoc;
import java.util.Arrays;
/**
 * Clase que implementa métodos para gestionar una tienda
 * @version 1.0
 * @author Marisa Lozano Macias
 */
public class Tienda {
	
	private Producto [] listaProducto;
	private int numProductos;
	private int numTrabajadores;
	
	
	public Tienda(Producto[] listaProducto, int numProductos, int numTrabajadores) {
		super();
		this.listaProducto = listaProducto;
		this.numProductos = numProductos;
		this.numTrabajadores = numTrabajadores;
	}


	public Producto[] getListaProducto() {
		return listaProducto;
	}


	public void setListaProducto(Producto[] listaProducto) {
		this.listaProducto = listaProducto;
	}


	public int getNumProductos() {
		return numProductos;
	}


	public void setNumProductos(int numProductos) {
		this.numProductos = numProductos;
	}


	public int getNumTrabajadores() {
		return numTrabajadores;
	}


	public void setNumTrabajadores(int numTrabajadores) {
		this.numTrabajadores = numTrabajadores;
	}


	@Override
	public String toString() {
		return "Tienda [listaProducto=" + Arrays.toString(listaProducto) + ", numProductos=" + numProductos
				+ ", numTrabajadores=" + numTrabajadores + "]";
	}
	

	/**
	 * Método para añadir un producto a la lista de productos de la tienda
	 * @param p: Al método se le pasa un producto al que llamamos "p"
	 * @since 1.0
	 */
	public void addProducto(Producto p) {
		
		listaProducto[numProductos]=p;	
		
		numProductos ++;
		
	}
	

	public void mostrarProductos() {

		// en vez de poner lista.length, es mejor poner el numero del tamaño, ya que así solo 

		//nos saldría los que tenemos.

		for (int i = 0; i < numProductos; i++) {

			System.out.println(listaProducto[i]);

		}

	}


	/**
	 * Método para buscar productos por sección
	 * @param seccion se le pasa la sección de los productos que deseas buscar
	 * @return devuelve la lista de productos pertenecientes a la seccion.
	 * @since 1.0
	 */

	public Producto [] buscarBySeccion(int seccion) {

		int i=0;

		Producto [] listaEncontrado = new Producto [numProductos];

		while(i < numProductos) {

			if(listaProducto[i].getSeccion()==seccion) {

				listaEncontrado[i]=listaProducto[i];
			}

			i++;
		}

		return listaEncontrado;

	}
	
	//buscar by id le pasas un id y lo compara con cada id de cada producto de la lista 
	
	
	public int  buscarById (int id) {
		boolean encontrado = false;
		int i=0;
		while(i<numProductos && !encontrado) {
			if(listaProducto[i].getId()==id) {
				encontrado=true;
			}
			else {
				i++;
			}
		}
		if(encontrado) {
			return i;
		}
		else {
			return -1;
		}
	}
	
	public Producto buscarByIdV2(int id) {
		boolean encontrado=false;
		int i=0;
		
		while(i<numProductos && !encontrado) {
			if(listaProducto[i].getId() == id) {
				encontrado =true;
			}
			else {
				i++;
			}
		}
		if(encontrado) {
			return listaProducto[i];
		}
		else {
			return null;
		}
	}

	//mostrar donde se le pasa un array

	

	public void mostrarTodosProductos() {

		for (int i = 0; i < listaProducto.length; i++) {

			if(listaProducto[i]!=null) {

				System.out.println(listaProducto[i]);
			}

		}

	}
	

	
	public void mostrarListaActivos() {
		for (int i = 0; i < listaProducto.length; i++) {
			
			if(listaProducto[i]!=null && listaProducto[i].isEnVenta()) {
				System.out.println(listaProducto[i]);
			}
			
		}
	}
	
	


	//calcular porcentaje

	//calcular el precio de venta al público

	public double calcularPrecioFinal(double ganancia, int id) {
		
		double cien=100.0;
		
		Producto p;

		p=buscarByIdV2(id);

		return p.getPrecioFabrica()+p.getPrecioFabrica()*ganancia/100;
		

	}
	
	//modificar el precio de fábrica por categoria 
	/**
	 * Método para modificar el precio de fábrica de una categoría entera.
	 * @param categoria se le pasa al método la categoría que quieres modificar.
	 * @param precioNuevo se le pasa al método el precio nuevo que quieres cambiar.
	 */
	
	public void modificarPrecioFabCategoria(int categoria, double precioNuevo) {
		
		for (int i = 0; i < numProductos; i++) {
			
			if(listaProducto[i].getSeccion() == categoria) {
				listaProducto[i].setPrecioFabrica(precioNuevo);
			}
			
		}
		
	}

	public double hacerDescuento(double descuento, double ganancia, int id) {
		double cien =100.0;
		
		return calcularPrecioFinal(ganancia, id)-calcularPrecioFinal(ganancia, id)*descuento/cien;
	
	}
	
	//Devuelve el nº de productos que hemos eliminado de la lista 
	public int eliminarCategoria(int categoria) {
		
		int contador=0;
		
		for (int i = 0; i < numProductos; i++) {
			if(listaProducto[i].getSeccion() == categoria){
				
				listaProducto[i].setEnVenta(false);
				
				contador++;
			}
			
		}
		
		return contador;
		
	}	
		
		
		
		

	
	public Producto findByCodigo (int codigo) {
		 
		int i=0;
		boolean encontrado=false;
		
		while(i<listaProducto.length && !encontrado) {
			
			Producto buscado = listaProducto [i];
			
			if(buscado.getCodigo()==codigo) {
				encontrado=true;
			}
			else {
				i++;
			}
		}
		if(encontrado) {
			return listaProducto[i];
		}
		else {
			return null;
		}
	}
}
