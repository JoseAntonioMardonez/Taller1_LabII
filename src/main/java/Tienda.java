import java.util.ArrayList;

public class Tienda {
	private String direccion;
	public Compra unnamed_Compra_;
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void agregarCliente() {
		throw new UnsupportedOperationException();
	}

	public void obtenerInformacionDispositivo() {
		throw new UnsupportedOperationException();
	}

	public void realizarVenta() {
		throw new UnsupportedOperationException();
	}
}