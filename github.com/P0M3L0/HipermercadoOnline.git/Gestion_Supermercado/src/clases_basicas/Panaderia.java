package clases_basicas;

public class Panaderia extends Comida {
	
	boolean lleva_gluten;
	nombre_pan nombrepan;
	
	public enum nombre_pan {
		
		Hogaza, Artesana, Baguette, Chapata, Integral, Blanco
	}

	public Panaderia(int kcal, int precio_ud, boolean es_fresco, String nombre_comida, boolean lleva_gluten, nombre_pan nombrepan) {
		super(kcal, precio_ud, true, "Pan");
		this.lleva_gluten = lleva_gluten;
		this.nombrepan = nombrepan;
	}

}
