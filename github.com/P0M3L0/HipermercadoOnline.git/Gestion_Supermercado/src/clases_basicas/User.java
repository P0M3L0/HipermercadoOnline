package clases_basicas;

public class User {

	String nombre;
	String apellido_1;
	String apellido_2;
	int edad;
	boolean es_admin;	//Provisional
	String nif;
	String num_telefono;
	String User_name;
	String password;
	//Getter & Setters //++
	
	public User (String nombre, String apellido_1, String apellido_2, int edad, boolean es_admin, String nif, String num_telefono, String User_name, String password ) {
		this.nombre = nombre;
		this.apellido_1 = apellido_1;
		this.apellido_2 = apellido_2;
		this.edad = edad;
		this.es_admin = es_admin;
		this.nif = nif;
		this.num_telefono = num_telefono;
		this.User_name = User_name;
		this.password = password;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido_1() {
		return apellido_1;
	}
	public void setApellido_1(String apellido_1) {
		this.apellido_1 = apellido_1;
	}
	public String getApellido_2() {
		return apellido_2;
	}
	public void setApellido_2(String apellido_2) {
		this.apellido_2 = apellido_2;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean ises_admin() {
		return es_admin;
	}
	public void setes_admin(boolean es_admin) {
		this.es_admin = es_admin;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getNum_telefono() {
		return num_telefono;
	}
	public void setNum_telefono(String num_telefono) {
		this.num_telefono = num_telefono;
	}
	public String getUser_name() {
		return User_name;
	}
	public void setUser_name(String user_name) {
		User_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}
