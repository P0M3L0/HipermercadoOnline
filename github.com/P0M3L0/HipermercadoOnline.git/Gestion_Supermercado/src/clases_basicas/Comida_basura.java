package clases_basicas;

public class Comida_basura extends Comida {
	
	tipo_sabor tiposabor;
	String nombre_comidabasura;	
	public enum tipo_sabor {
		
		dulce, salado
	}

	public Comida_basura(int kcal, int precio_ud, boolean es_fresco, String nombre_comida, tipo_sabor tiposabor, String nombre_comidabasura) {
		super(kcal, precio_ud, false, "Comida Basura");
		this.nombre_comidabasura = nombre_comidabasura;
		this.tiposabor = tiposabor;
	}

}
