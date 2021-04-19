package vehiculos;

public class Fabricante {
	protected String nombre;
	protected Pais pais;

	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}

	// Getters y setters.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	// Metodos.

	/*
	 * public fabricaMayorVentas(Fabrica fabrica) { return String }
	 */

}
