import java.util.ArrayList;

public class Compra {
	private String fechaCompra;
	private Cliente cliente;
	private ArrayList<Dispositivo> dispositivos = new ArrayList<Dispositivo>();

	//Constructor
	public Compra(String fechaCompra, Cliente cliente) {
		this.fechaCompra = fechaCompra;
		this.cliente = cliente;
	}

	//Metodos
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

	public void setDispositivos(dispositivo) {
		;
	}
}