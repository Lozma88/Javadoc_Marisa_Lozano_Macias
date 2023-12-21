package javadoc;

	/**
	 * @author: Marisa Lozano Macias
	 */
	public class Producto {

		private int id;
		private String nombre;
		private double precioFabrica;
		private int seccion; //1 alimentacion, 2 electronica, 3 ropa
		private boolean enVenta;
		private int codigo;
		
		
		

		
		
		public Producto() {

		}
		public Producto(String nombre, double precioFabrica, int seccion, boolean enVenta, int codigo) {

			super();
		}


		public Producto(int id, String nombre, double precioFabrica, int seccion, boolean enVenta) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.precioFabrica = precioFabrica;
			this.seccion = seccion;
			this.enVenta = enVenta;
			this.codigo = codigo;
		}




		public String getNombre() {
			return nombre;
		}




		public void setNombre(String nombre) {
			this.nombre = nombre;
		}




		public double getPrecioFabrica() {
			return precioFabrica;
		}




		public void setPrecioFabrica(double precioFabrica) {
			this.precioFabrica = precioFabrica;
		}




		public int getSeccion() {
			return seccion;
		}




		public void setSeccion(int seccion) {
			this.seccion = seccion;
		}




		public boolean isEnVenta() {
			return enVenta;
		}




		public void setEnVenta(boolean enVenta) {
			this.enVenta = enVenta;
		}
		

		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}




		public int getCodigo() {
			return codigo;
		}




		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}




		@Override
		public String toString() {

			return "Producto [id=" + id + ", nombre=" + nombre + ", precioFabrica=" + precioFabrica + ", seccion=" + seccion
					+ ", enVenta=" + enVenta + "]";

			
		}


		
		
		
	}	
		
		
		

