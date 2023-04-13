import java.util.ArrayList;

public class Compra {
	private String fechaCompra;
	private Cliente cliente;
	public Tienda unnamed_Tienda_;
	public Cliente unnamed_Cliente_;
	private ArrayList<Dispositivo> dispositivos = new ArrayList<Dispositivo>();

	public Compra() {
		throw new UnsupportedOperationException();
	}

	public String getFechaCompra() {
		return this.fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}