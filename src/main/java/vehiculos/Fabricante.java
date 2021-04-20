package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
	

	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabricantes.add(this);
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


	 public static ArrayList<Fabricante> getFabricantes() {
		return fabricantes;
	}

	public static void setFabricantes(ArrayList<Fabricante> fabricantes) {
		Fabricante.fabricantes = fabricantes;
	}
	
	// Metodos.

	public static Fabricante fabricaMayorVentas() {
		int[] cuentas = new int[fabricantes.size()];
		for (int i = 0; i < Vehiculo.getVehiculos().size();i++) {
			for (int j = 0; i < Fabricante.getFabricantes().size();j++) {
				if (Vehiculo.getVehiculos().get(i).getFabricante().equals(Fabricante.getFabricantes().get(j))) {
					cuentas[j] += 1;
					break;
					
				}
				
			}
			
		}
		int maximo = cuentas[0];
		int indice = 0;
		for(int i=0; i<cuentas.length;i++) {
			if (cuentas[i]>maximo) {
				maximo = cuentas[i];
				indice = i;
			}
		}
		return Fabricante.getFabricantes().get(indice);
	}

	
	
	
	 

}
