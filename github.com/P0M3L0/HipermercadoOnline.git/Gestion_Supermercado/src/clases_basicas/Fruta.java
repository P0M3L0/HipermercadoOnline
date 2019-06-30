package clases_basicas;

public class Fruta extends Comida {

	boolean venta_granel;
	tipos_fruta tiposfruta;
	 
	public enum tipos_fruta {
		
		Manzana, Pera, Naranja, Melon, Sandia, Pinya, Mandarina, Platano, Kiwi, Melocoton, Paraguayo
	}
	
	public Fruta(int kcal, int precio_ud, boolean es_fresco, String nombre_comida, boolean venta_granel, tipos_fruta tiposfruta) {
		super(kcal, precio_ud, true, "Fruta");
		this.venta_granel = venta_granel;
		this.tiposfruta = tiposfruta;
	}

}
