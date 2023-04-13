import java.util.ArrayList;

public class Tienda {
	private String direccion;
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<Compra> compras = new ArrayList<Compra>();


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
		for(Dispositivo dispositivo : this.dispositivos){
			if(paciente.getRun().equals(run)){
				System.out.println("Paciente encontrado");
				return paciente;
			}
		}

		System.out.println("Paciente no encontrado");
		return null;;
	}

	public void realizarVenta(String fecha, Cliente cliente) {
		Compra compra = new Compra(fecha,cliente);
		compra.setDispositivos();
		this.compras.add(compra);
	}
}