public class Notebook extends Dispositivo {
	//Atributos
	private String resolucionPantalla;
	private String tipoTeclado;
	private int bateria;

	//Constructor
	public Notebook(String marca, int memoriaRAM, int almacenamiento, String procesador, String modelo, int anioFabricacion, int precio, int stock, String resolucionPantalla, String tipoTeclado, int bateria) {
		super(marca,memoriaRAM,almacenamiento,procesador,modelo,anioFabricacion,precio,stock);
		this.resolucionPantalla = resolucionPantalla;
		this.tipoTeclado = tipoTeclado;
		this.bateria = bateria;
	}

	//Metodos
	public String getResolucionPantalla() {
		return this.resolucionPantalla;
	}

	public void setResolucionPantalla(String resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla;
	}

	public String getTipoTeclado() {
		return this.tipoTeclado;
	}

	public void setTipoTeclado(String tipoTeclado) {
		this.tipoTeclado = tipoTeclado;
	}

	public int getBateria() {
		return this.bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public String getTipo() {
		return "Nootebook";
	}
}