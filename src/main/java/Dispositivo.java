public abstract class Dispositivo {
	private String marca;
	private int memoriaRAM;
	private int almacenamiento;
	private String procesador;
	private String modelo;
	private int anioFabricacion;
	private int precio;
	private int stock;

	public Dispositivo(String marca, int memoriaRAM, int almacenamiento, String procesador, String modelo, int anioFabricacion, int precio, int stock) {
		this.marca = marca;
		this.memoriaRAM = memoriaRAM;
		this.almacenamiento = almacenamiento;
		this.procesador = procesador;
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
		this.precio = precio;
		this.stock = stock;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getMemoriaRAM() {
		return this.memoriaRAM;
	}

	public void setMemoriaRAM(int memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}

	public int getAlmacenamiento() {
		return this.almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public String getProcesador() {
		return this.procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnioFabricacion() {
		return this.anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public abstract String getTipo();
}