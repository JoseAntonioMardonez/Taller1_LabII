public class Cliente {
	private String nombre;
	private String apellido;
	private String correoElectronico;
	private int numeroContacto;
	private String estadoCivil;
	private String ciudad;

	public Cliente(String nombre, String apellido, String correoElectronico, int numeroContacto, String estadoCivil, String ciudad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correoElectronico = correoElectronico;
		this.numeroContacto = numeroContacto;
		this.estadoCivil = estadoCivil;
		this.ciudad = ciudad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public int getNumeroContacto() {
		return this.numeroContacto;
	}

	public void setNumeroContacto(int numeroContacto) {
		this.numeroContacto = numeroContacto;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
}