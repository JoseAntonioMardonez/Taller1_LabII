import java.util.ArrayList;

public class Tablet extends Dispositivo {
	//Atributos
	private String resolucionPantalla;
	private ArrayList<Accesorio> accesorios = new ArrayList<Accesorio>();

	//Constructor
	public Tablet(String marca, int memoriaRAM, int almacenamiento, String procesador, String modelo, int anioFabricacion, int precio, int stock, String resolucionPantalla) {
		super(marca,memoriaRAM,almacenamiento,procesador,modelo,anioFabricacion,precio,stock);
		this.resolucionPantalla = resolucionPantalla;
	}

	//Metodos
	public String getResolucionPantalla() {
		return this.resolucionPantalla;
	}

	public void setResolucionPantalla(String resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla;
	}

	public String getTipo() {
		return "Tablet";
	}
}