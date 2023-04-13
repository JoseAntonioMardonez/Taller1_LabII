import java.util.ArrayList;

public class Tablet extends Dispositivo {
	private String resolucionPantalla;
	private ArrayList<Accesorio> accesorios = new ArrayList<Accesorio>();

	public Tablet() {
		throw new UnsupportedOperationException();
	}

	public String getResolucionPantalla() {
		return this.resolucionPantalla;
	}

	public void setResolucionPantalla(String resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla;
	}
}