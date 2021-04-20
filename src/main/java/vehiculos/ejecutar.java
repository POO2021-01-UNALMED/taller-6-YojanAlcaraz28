package vehiculos;

public class ejecutar {

	public static void main(String[] args) {
		/*Pais p = new Pais("Colombia");
		Fabricante f = new Fabricante("Renault", p);
		Vehiculo ve = new Automovil("AA", "Carro", 100, 20, f, 4);
		Vehiculo ve1 = new Vehiculo("TEST", 4, 4, "SS", 100, 10, "AWD", f);
		Vehiculo ve2 = new Camion("SS", "Camion premium", 1000, 100, f, 3);
		Vehiculo ve3 = new Camioneta("CC", 5, "Ford", 500, 150, f, true);
		System.out.println(p.getNombre());
		System.out.println(f.getPais());
		System.out.println(f.getNombre());
		System.out.println(ve.getNombre());
		System.out.println("Vel max ve1:" + ve1.getVelocidadMaxima());
		System.out.println("Nombre ve1:" + ve1.getNombre());
		System.out.println("Traccion ve1:" + ve1.getTraccion());
		System.out.println(Vehiculo.getCantidadVehiculos());
		System.out.println(ve.getPuertas());
		System.out.println("Traccion ve2:" + ve2.getTraccion());
		System.out.println("Traccion ve3:" + ve3.getTraccion());
		System.out.println("Nombre ve:" + ve.getNombre());
		System.out.println("Nombre ve:" + ve2.getPuertas());*/
		
		Pais p1 = new Pais("Ecuador");
		Pais p2 = new Pais("USA");
		Pais p3 = new Pais("Canada");
		
		Fabricante f1 = new Fabricante("Renault", p1);
		Fabricante f2 = new Fabricante("Chevrolet", p1);
		Fabricante f3 = new Fabricante("Tesla", p2);
		Fabricante f4 = new Fabricante("Volvo", p3);
		
		new Camion("SS", "Camion premium", 1000, 100, f1, 3);
		new Camion("AA", "Camion", 1000, 100, f1, 3);
		new Automovil("NN", "Mac 100", 820, 20, f1, 4);
		new Camioneta("CC", 5, "Ford", 500, 150, f1, true);
		new Camioneta("CC", 5, "Ford", 500, 150, f1, true);
		new Automovil("NN", "Mac 100", 820, 20, f2, 4);
		new Camioneta("CC", 5, "Ford", 500, 150, f2, true);
		
		new Camion("SS", "Camion premium", 1000, 100, f3, 3);
		new Camion("AA", "Camion", 1000, 100, f3, 3);
		new Automovil("NN", "Mac 100", 820, 20, f3, 4);
		
		new Camioneta("CC", 5, "Ford", 500, 150, f4, true);
		new Automovil("NN", "Mac 100", 820, 20, f4, 4);
		
		System.out.println(Pais.paisMasVendedor().getNombre());
		System.out.println(Fabricante.fabricaMayorVentas().getNombre());

	}

}
