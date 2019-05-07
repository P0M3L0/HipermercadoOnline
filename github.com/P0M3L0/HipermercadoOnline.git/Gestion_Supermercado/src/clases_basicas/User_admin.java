package clases_basicas;

public class User_admin extends User {
	
	int numero_integrantes_familia;
	Integer presupuesto;
	String provincia;
	
	
	
	public int getNumero_integrantes_familia() {
		return numero_integrantes_familia;
	}



	public void setNumero_integrantes_familia(int numero_integrantes_familia) {
		this.numero_integrantes_familia = numero_integrantes_familia;
	}



	public Integer getPresupuesto() {
		return presupuesto;
	}



	public void setPresupuesto(Integer presupuesto) {
		this.presupuesto = presupuesto;
	}



	public String getProvincia() {
		return provincia;
	}



	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}



	public User_admin() {
		
		
	}

}
