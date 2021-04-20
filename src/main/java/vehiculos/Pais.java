package vehiculos;

import java.util.ArrayList;

public class Pais {
	protected String nombre;
	public static  ArrayList<Pais> paises = new ArrayList<Pais>();

	

	public Pais(String pais) {
		this.nombre = pais;
		paises.add(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	
	}
	
	public static ArrayList<Pais> getPaises() {
		return paises;
	}

	public static void setPaises(ArrayList<Pais> paises) {
		Pais.paises = paises;
	}

	// Metodos.

	public static Pais paisMasVendedor() {
		int[] cuentas = new int[paises.size()];
		for (int i = 0; i < Vehiculo.getVehiculos().size();i++) {
			for (int j = 0; i < Pais.getPaises().size();j++) {
				if (Vehiculo.getVehiculos().get(i).getFabricante().getPais().equals(Pais.getPaises().get(j))) {
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
		return Pais.getPaises().get(indice);
	}
}
