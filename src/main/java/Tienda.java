import java.sql.SQLOutput;
import java.util.ArrayList;

public class Tienda {
	private String direccion;
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<Compra> compras = new ArrayList<Compra>();
	private ArrayList<Dispositivo> dispositivos = new ArrayList<Dispositivo>();

	public Tienda(String direccion) {
		this.direccion = direccion;
		this.clientes = new ArrayList<Cliente>();
		this.compras = new ArrayList<Compra>();
		this.dispositivos = new ArrayList<Dispositivo>();

	}


	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
		System.out.println("Cliente agregado");
	}

	public void obtenerInformacionDispositivo(Dispositivo dispositivo) {
		System.out.println(dispositivo.toString());

	}

	public void realizarVenta(String fecha, Cliente cliente) {
		Compra compra = new Compra(fecha,cliente);
		compra.setDispositivos();
		this.compras.add(compra);
	}
	public void agregarDispositivo(Dispositivo dispositivo) {
		this.dispositivos.add(dispositivo);
		System.out.println("Dispositivo agregado");
	}
}