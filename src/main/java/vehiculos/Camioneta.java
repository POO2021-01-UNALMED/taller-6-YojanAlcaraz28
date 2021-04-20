package vehiculos;

import java.util.ArrayList;

public class Camioneta extends Vehiculo {
	protected boolean volco;
	public static  ArrayList<Camioneta> camionetas = new ArrayList<Camioneta>();
	public static int numCamionetas;

	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante,
			boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		camionetas.add(this);
		numCamionetas++;

	}

	public Camioneta() {

	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	public int getNumCamionetas() {
		return numCamionetas;
	}

	public void setNumCamionetas(int numCamionetas) {
		this.numCamionetas = numCamionetas;
	}

	public static ArrayList<Camioneta> getCamionetas() {
		return camionetas;
	}

	public static void setCamionetas(ArrayList<Camioneta> camionetas) {
		Camioneta.camionetas = camionetas;
	}

}
