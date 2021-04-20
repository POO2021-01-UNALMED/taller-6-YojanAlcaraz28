package vehiculos;

import java.util.ArrayList;

public class Camion extends Vehiculo {
	protected int ejes;
	public static int numCamiones;
	public static  ArrayList<Camion> camiones = new ArrayList<Camion>();

	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		camiones.add(this);
		numCamiones++;
	}

	public Camion() {

	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	public static int getNumCamiones() {
		return numCamiones;
	}

	public static void setNumCamiones(int numCamiones) {
		Camion.numCamiones = numCamiones;
	}

	public static ArrayList<Camion> getCamiones() {
		return camiones;
	}

	public static void setCamiones(ArrayList<Camion> camiones) {
		Camion.camiones = camiones;
	}

}
