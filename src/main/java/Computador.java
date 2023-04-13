public class Computador extends Dispositivo {
	//Atributos
	private String tarjetaVideo;
	private String fuentePoder;
	private String chasis;
	private Pantalla pantalla;

	//Constructor
	public Computador(String marca, int memoriaRAM, int almacenamiento, String procesador, String modelo, int anioFabricacion, int precio, int stock, String tarjetaVideo, String fuentePoder, String chasis, Pantalla pantalla) {
		super(marca,memoriaRAM,almacenamiento,procesador,modelo,anioFabricacion,precio,stock);
		this.tarjetaVideo = tarjetaVideo;
		this.fuentePoder = fuentePoder;
		this.chasis = chasis;
		this.pantalla = pantalla;
	}

	//Metodos
	public String getTarjetaVideo() {
		return this.tarjetaVideo;
	}

	public void setTarjetaVideo(String tarjetaVideo) {
		this.tarjetaVideo = tarjetaVideo;
	}

	public String getFuentePoder() {
		return this.fuentePoder;
	}

	public void setFuentePoder(String fuentePoder) {
		this.fuentePoder = fuentePoder;
	}

	public String getChasis() {
		return this.chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public Pantalla getPantalla() {
		return this.pantalla;
	}

	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}

	public String getTipo() {
		return "Computador";
	}
}