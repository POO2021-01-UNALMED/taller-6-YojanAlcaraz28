package vehiculos;

import java.util.ArrayList;

public class Automovil extends Vehiculo {
	protected int puestos;
	public static int numAutos;
	public static  ArrayList<Automovil> automoviles = new ArrayList<Automovil>();

	

	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		automoviles.add(this);
		numAutos++;
	}

	public Automovil() {

	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public int getNumAutos() {
		return numAutos;
	}

	public void setNumAutos(int numAutos) {
		this.numAutos = numAutos;
	
	}
	
	public static ArrayList<Automovil> getAutomoviles() {
		return automoviles;
	}

	public static void setAutomoviles(ArrayList<Automovil> automoviles) {
		Automovil.automoviles = automoviles;
	}

}
