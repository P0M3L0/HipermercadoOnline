package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import clases_basicas.Fruta.tipos_fruta;
import clases_basicas.Panaderia;
import clases_basicas.Verduras.tipo_verduras;
import clases_basicas.Carne;
import clases_basicas.Carne.tipo_carne;
import clases_basicas.Comida_basura;
import clases_basicas.Pescado.tipo_pescado;
import clases_basicas.User_Admin;
import clases_basicas.Verduras;
import clases_basicas.Comida_basura.tipo_sabor;
import clases_basicas.Fruta;
import clases_basicas.Panaderia.nombre_pan;
import clases_basicas.Pasta;
import clases_basicas.Pasta.tipo_pasta;
import clases_basicas.Pescado;

import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana_principal extends JFrame {

	private JPanel contentPane;

	static Ventana_principal p = new Ventana_principal();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		crearcomidas();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
									p.setVisible(true);
										} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	static HashMap<String, Integer> carro = new HashMap<String, Integer>();
	int precio_actual = 0;
	String nombre_producto;
	int coste_total;
	static HashMap<String, Fruta> mapa_frutas = new HashMap<String, Fruta>();
	static HashMap<String, Verduras> mapa_verdura = new HashMap<String, Verduras>();
	static HashMap<String, Carne> mapa_carne = new HashMap<String, Carne>();
	private JLabel lbl_precio_u;
	private JLabel lbl_precio_total;
	private JList listCompra;
	private JLabel lbl_coste_tot_total;
	static HashMap<String, Pescado> mapa_pescado = new HashMap<String, Pescado>();
	static HashMap<String, Comida_basura> mapa_comida_basura = new HashMap<String, Comida_basura>();
	static HashMap<String, Panaderia> mapa_panaderia = new HashMap<String, Panaderia>();
	static HashMap<String, Pasta> mapa_pasta = new HashMap<String, Pasta>();
	
	User_Admin useradmin = new User_Admin("Antonio", "Vicente", "Gonzalez", 20, true, "11111111L", "652315486", "antonio", "antonio", 5000, "masc");
	
	public  void updatelist() {
		
		DefaultListModel<String> model = new DefaultListModel<String>();
        
        
        Iterator<String> ite1 =carro.keySet().iterator();
        while(ite1.hasNext())
        {
        	String llave=ite1.next();
        	model.addElement(carro.get(llave)+" x "+llave);
        }
        	        
        
    	listCompra.setModel(model);
	}
	
	
	public static void crearcomidas(){
		
		//añadimso todos los alimentos a los hasmaps
		
		mapa_frutas.put("Manzana", new Fruta(25, 1, true, "Fruta", true, tipos_fruta.Manzana));
		mapa_frutas.put("Pera", new Fruta(20, 2, true, "Fruta", true, tipos_fruta.Pera));
		mapa_frutas.put("Naranja", new Fruta(60, 1, true, "Fruta", true, tipos_fruta.Naranja));
		mapa_frutas.put("Melon", new Fruta(250, 5, true, "Fruta", true, tipos_fruta.Melon));
		mapa_frutas.put("Sandia", new Fruta(180, 3, true, "Fruta", true, tipos_fruta.Sandia));
		mapa_frutas.put("Pinya", new Fruta(450, 4, true, "Fruta", true, tipos_fruta.Pinya));
		mapa_frutas.put("Mandarina", new Fruta(45, 1, true, "Fruta", true, tipos_fruta.Mandarina));
		mapa_frutas.put("Platano", new Fruta(99, 2, true, "Fruta", true, tipos_fruta.Platano));
		mapa_frutas.put("Kiwi", new Fruta(66, 1, true, "Fruta", true, tipos_fruta.Kiwi));
		mapa_frutas.put("Melocoton", new Fruta(110, 2, true, "Fruta", true, tipos_fruta.Melocoton));
		mapa_frutas.put("Paraguayo", new Fruta(75, 1, true, "Fruta", true, tipos_fruta.Paraguayo));
		
		mapa_verdura.put("Raiz", new Verduras(120, 1, true, "Verduras", true, tipo_verduras.Raiz, "Zanahoria"));
		mapa_verdura.put("Bulbo", new Verduras(220, 5, true, "Verduras", false, tipo_verduras.Bulbo, "Cebolla"));
		mapa_verdura.put("Tallo", new Verduras(410, 3, true, "Verduras", true, tipo_verduras.Tallo, "Esparrago"));
		mapa_verdura.put("Hoja", new Verduras(680, 12, false, "Verduras", true, tipo_verduras.Hoja, "Remolacha"));
		mapa_verdura.put("Flor", new Verduras(130, 7, true, "Verduras", true, tipo_verduras.Flor, "Vainilla"));
		
		mapa_carne.put("Pollo", new Carne(250, 12, true, "Carne", tipo_carne.Pollo));
		mapa_carne.put("Ternera", new Carne(210, 41, true, "Carne", tipo_carne.Ternera));
		mapa_carne.put("Cerdo", new Carne(360, 8, true, "Carne", tipo_carne.Cerdo));
		mapa_carne.put("Pato", new Carne(610, 7, true, "Carne", tipo_carne.Pato));
		mapa_carne.put("Conejo", new Carne(101, 15, true, "Carne", tipo_carne.Conejo));
		
		mapa_pescado.put("Blanco", new Pescado(410, 35, true, "Pescado", tipo_pescado.Blanco, true));
		mapa_pescado.put("Azul", new Pescado(740, 66, false, "Pescado", tipo_pescado.Azul, false));
		
		mapa_comida_basura.put("dulce", new Comida_basura(700, 4, false, "Comida Basura", tipo_sabor.dulce, "Regaliz"));
		mapa_comida_basura.put("salado", new Comida_basura(810, 3, false, "Comida Basura", tipo_sabor.salado, "Maices"));
		
		mapa_panaderia.put("Hogaza", new Panaderia(160, 2, true, "Pan", false, nombre_pan.Hogaza));
		mapa_panaderia.put("Artesana", new Panaderia(240, 4, false, "Pan", true, nombre_pan.Artesana));
		mapa_panaderia.put("Baguette", new Panaderia(90, 1, false, "Pan", false, nombre_pan.Baguette));
		mapa_panaderia.put("Chapata", new Panaderia(330, 6, true, "Pan", true, nombre_pan.Chapata));
		mapa_panaderia.put("Integral", new Panaderia(55, 2, false, "Pan", true, nombre_pan.Integral));
		mapa_panaderia.put("Blanco", new Panaderia(240, 6, false, "Pan", false, nombre_pan.Blanco));
		
		mapa_pasta.put("Canelones", new Pasta(420, 12, false, "Pasta", tipo_pasta.Canelones, true));
		mapa_pasta.put("Tortellini", new Pasta(210, 10, true, "Pasta", tipo_pasta.Tortellini, false));
		mapa_pasta.put("Espagueti", new Pasta(350, 11, false, "Pasta", tipo_pasta.Espagueti, true));
		mapa_pasta.put("Fideos", new Pasta(640, 16, false, "Pasta", tipo_pasta.Fideos,false));
		mapa_pasta.put("Lasanya", new Pasta(195, 7, true, "Pasta", tipo_pasta.Lasanya, false));
		mapa_pasta.put("Macarrones", new Pasta(650, 19, false, "Pasta", tipo_pasta.Macarrones, true));
		mapa_pasta.put("Ravioli", new Pasta(750, 22, true, "Pasta", tipo_pasta.Ravioli, true));
		mapa_pasta.put("Tallarines", new Pasta(340, 34, false, "Pasta", tipo_pasta.Tallarines, false));
		
	}
	
	
	
	/**
	 * Create the frame.
	 */
	public Ventana_principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		listCompra = new JList();
		listCompra.setBounds(573, 49, 167, 227);
		contentPane.add(listCompra);
		
		JLabel lblCarritoDeLa = new JLabel("Carrito de la compra");
		lblCarritoDeLa.setBounds(605, 24, 118, 14);
		contentPane.add(lblCarritoDeLa);
		
		JButton btnPagarYFinzalizar = new JButton("Pagar y Finzalizar");
		btnPagarYFinzalizar.setBounds(594, 435, 146, 23);
		contentPane.add(btnPagarYFinzalizar);
		btnPagarYFinzalizar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Su compra ha sido efectuada");
				System.exit(0);
			}
		});
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(462, 435, 89, 23);
		contentPane.add(btnCancelar);
		btnCancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Su carrito de la compra ha sido vaciado");
				
				System.exit(0);
				
			}
		});
		
		JLabel lblPrecio = new JLabel("Precio :");
		lblPrecio.setBounds(573, 287, 46, 14);
		contentPane.add(lblPrecio);
		
		lbl_coste_tot_total = new JLabel("......................");
		lbl_coste_tot_total.setBounds(645, 287, 78, 14);
		contentPane.add(lbl_coste_tot_total);
		
		JLabel lblNombreUsuario = new JLabel("Nombre Usuario");
		lblNombreUsuario.setBounds(45, 24, 107, 14);
		contentPane.add(lblNombreUsuario);
		
		JLabel lblNif = new JLabel("NIF");
		lblNif.setBounds(162, 24, 46, 14);
		contentPane.add(lblNif);
		
		JLabel label_rellenar_nom_usuario = new JLabel("");
		label_rellenar_nom_usuario.setBounds(38, 50, 96, 14);
		contentPane.add(label_rellenar_nom_usuario);
		label_rellenar_nom_usuario.setText(useradmin.getNombre());
		
		JLabel label_rellenarnifusuario = new JLabel("");
		label_rellenarnifusuario.setBounds(144, 50, 64, 14);
		contentPane.add(label_rellenarnifusuario);
		label_rellenarnifusuario.setText(useradmin.getNif());
		
		JComboBox comboBox_cantidad = new JComboBox();
		comboBox_cantidad.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7"}));
		comboBox_cantidad.setBounds(180, 191, 83, 20);
		contentPane.add(comboBox_cantidad);
		comboBox_cantidad.setVisible(false);
		comboBox_cantidad.setSelectedIndex(0);
		comboBox_cantidad.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String cantidad_seleccionada = (String) comboBox_cantidad.getSelectedItem();
				int cantidad_sel_num = Integer.parseInt(cantidad_seleccionada);
				int cantidad_tot = precio_actual * cantidad_sel_num;
				lbl_precio_total.setText(cantidad_tot + " €");
				
			}
		});
		
		JComboBox comboBox_Fruta = new JComboBox();
		comboBox_Fruta.setModel(new DefaultComboBoxModel(tipos_fruta.values()));
		comboBox_Fruta.setBounds(45, 191, 89, 20);
		contentPane.add(comboBox_Fruta);
		comboBox_Fruta.setVisible(false);
		comboBox_Fruta.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				Fruta fruta = mapa_frutas.get(comboBox_Fruta.getSelectedItem().toString());
				System.out.println(comboBox_Fruta.getSelectedItem());
				nombre_producto = comboBox_Fruta.getSelectedItem().toString();
				precio_actual = fruta.precio_ud;
				lbl_precio_u.setText(precio_actual + " €");
				String cantidad_seleccionada = (String) comboBox_cantidad.getSelectedItem();
				int cantidad_sel_num = Integer.parseInt(cantidad_seleccionada);
				int cantidad_tot = precio_actual * cantidad_sel_num;
				lbl_precio_total.setText(cantidad_tot + " €");
			}
		});
		
		JComboBox comboBox_Verdura = new JComboBox();
		comboBox_Verdura.setModel(new DefaultComboBoxModel(tipo_verduras.values()));
		comboBox_Verdura.setBounds(45, 191, 89, 20);
		contentPane.add(comboBox_Verdura);
		comboBox_Verdura.setVisible(false);
		comboBox_Verdura.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				Verduras verdura = mapa_verdura.get(comboBox_Verdura.getSelectedItem().toString());
				System.out.println(comboBox_Verdura.getSelectedItem());
				nombre_producto = comboBox_Verdura.getSelectedItem().toString();
				precio_actual = verdura.precio_ud;
				lbl_precio_u.setText(precio_actual + " €");
				String cantidad_seleccionada = (String) comboBox_cantidad.getSelectedItem();
				int cantidad_sel_num = Integer.parseInt(cantidad_seleccionada);
				int cantidad_tot = precio_actual * cantidad_sel_num;
				lbl_precio_total.setText(cantidad_tot + " €");
				
			}
		});
		
		JComboBox comboBox_Carne = new JComboBox();
		comboBox_Carne.setModel(new DefaultComboBoxModel(tipo_carne.values()));
		comboBox_Carne.setBounds(45, 191, 89, 20);
		contentPane.add(comboBox_Carne);
		comboBox_Carne.setVisible(false);
		comboBox_Carne.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				Carne carne = mapa_carne.get(comboBox_Carne.getSelectedItem().toString());
				System.out.println(comboBox_Carne.getSelectedItem());
				nombre_producto = comboBox_Carne.getSelectedItem().toString();
				precio_actual = carne.precio_ud;
				lbl_precio_u.setText(precio_actual + " €");
				String cantidad_seleccionada = (String) comboBox_cantidad.getSelectedItem();
				int cantidad_sel_num = Integer.parseInt(cantidad_seleccionada);
				int cantidad_tot = precio_actual * cantidad_sel_num;
				lbl_precio_total.setText(cantidad_tot + " €");
				
			}
		});
		
		JComboBox comboBox_Pescado = new JComboBox();
		comboBox_Pescado.setModel(new DefaultComboBoxModel(tipo_pescado.values()));
		comboBox_Pescado.setBounds(45, 191, 89, 20);
		contentPane.add(comboBox_Pescado);
		comboBox_Pescado.setVisible(false);
		comboBox_Pescado.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				Pescado pescado = mapa_pescado.get(comboBox_Pescado.getSelectedItem().toString());
				System.out.println(comboBox_Pescado.getSelectedItem());
				nombre_producto = comboBox_Pescado.getSelectedItem().toString();
				precio_actual = pescado.precio_ud;
				lbl_precio_u.setText(precio_actual + " €");
				String cantidad_seleccionada = (String) comboBox_cantidad.getSelectedItem();
				int cantidad_sel_num = Integer.parseInt(cantidad_seleccionada);
				int cantidad_tot = precio_actual * cantidad_sel_num;
				lbl_precio_total.setText(cantidad_tot + " €");
				
			}
		});
		
		JComboBox comboBox_ComidaBasura = new JComboBox();
		comboBox_ComidaBasura.setModel(new DefaultComboBoxModel(tipo_sabor.values()));
		comboBox_ComidaBasura.setBounds(45, 191, 89, 20);
		contentPane.add(comboBox_ComidaBasura);
		comboBox_ComidaBasura.setVisible(false);
		comboBox_ComidaBasura.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				Comida_basura comida_basura = mapa_comida_basura.get(comboBox_ComidaBasura.getSelectedItem().toString());
				System.out.println(comboBox_ComidaBasura.getSelectedItem());
				nombre_producto = comboBox_ComidaBasura.getSelectedItem().toString();
				precio_actual = comida_basura.precio_ud;
				lbl_precio_u.setText(precio_actual + " €");
				String cantidad_seleccionada = (String) comboBox_cantidad.getSelectedItem();
				int cantidad_sel_num = Integer.parseInt(cantidad_seleccionada);
				int cantidad_tot = precio_actual * cantidad_sel_num;
				lbl_precio_total.setText(cantidad_tot + " €");
				
			}
		});
		
		JComboBox comboBox_Panaderia = new JComboBox();
		comboBox_Panaderia.setModel(new DefaultComboBoxModel(nombre_pan.values()));
		comboBox_Panaderia.setBounds(45, 191, 89, 20);
		contentPane.add(comboBox_Panaderia);
		comboBox_Panaderia.setVisible(false);
		comboBox_Panaderia.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				Panaderia panaderia = mapa_panaderia.get(comboBox_Panaderia.getSelectedItem().toString());
				System.out.println(comboBox_Panaderia.getSelectedItem());
				nombre_producto = comboBox_Panaderia.getSelectedItem().toString();
				precio_actual = panaderia.precio_ud;
				lbl_precio_u.setText(precio_actual + " €");
				String cantidad_seleccionada = (String) comboBox_cantidad.getSelectedItem();
				int cantidad_sel_num = Integer.parseInt(cantidad_seleccionada);
				int cantidad_tot = precio_actual * cantidad_sel_num;
				lbl_precio_total.setText(cantidad_tot + " €");
				
			}
		});
		
		JComboBox comboBox_Pasta = new JComboBox();
		comboBox_Pasta.setModel(new DefaultComboBoxModel(tipo_pasta.values()));
		comboBox_Pasta.setBounds(45, 191, 89, 20);
		contentPane.add(comboBox_Pasta);
		comboBox_Pasta.setVisible(false);
		comboBox_Pasta.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				Pasta pasta = mapa_pasta.get(comboBox_Pasta.getSelectedItem().toString());
				System.out.println(comboBox_Pasta.getSelectedItem());
				nombre_producto = comboBox_Pasta.getSelectedItem().toString();
				precio_actual = pasta.precio_ud;
				lbl_precio_u.setText(precio_actual + " €");
				String cantidad_seleccionada = (String) comboBox_cantidad.getSelectedItem();
				int cantidad_sel_num = Integer.parseInt(cantidad_seleccionada);
				int cantidad_tot = precio_actual * cantidad_sel_num;
				lbl_precio_total.setText(cantidad_tot + " €");
				
			}
		});
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				 if(comboBox.getSelectedItem().equals("Fruta")) {
					 nombre_producto = null;
					 comboBox_Fruta.setVisible(true);
					 comboBox_Pasta.setVisible(false);
					 comboBox_Panaderia.setVisible(false);
					 comboBox_ComidaBasura.setVisible(false);
					 comboBox_Pescado.setVisible(false);
					 comboBox_Carne.setVisible(false);
					 comboBox_Verdura.setVisible(false);
					 comboBox_cantidad.setVisible(true);
					 comboBox_cantidad.setSelectedIndex(0);
				 }else if(comboBox.getSelectedItem().equals("Verdura")) {
					 nombre_producto = null;
					 comboBox_Pasta.setVisible(false);
					 comboBox_Panaderia.setVisible(false);
					 comboBox_ComidaBasura.setVisible(false);
					 comboBox_Pescado.setVisible(false);
					 comboBox_Carne.setVisible(false);
					 comboBox_Verdura.setVisible(true);
					 comboBox_Fruta.setVisible(false);
					 comboBox_cantidad.setVisible(true);
					 comboBox_cantidad.setSelectedIndex(0);
				 }else if(comboBox.getSelectedItem().equals("Carne")) {
					 nombre_producto = null;
					 comboBox_Pasta.setVisible(false);
					 comboBox_Panaderia.setVisible(false);
					 comboBox_ComidaBasura.setVisible(false);
					 comboBox_Pescado.setVisible(false);
					 comboBox_Carne.setVisible(true);
					 comboBox_Verdura.setVisible(false);
					 comboBox_Fruta.setVisible(false);
					 comboBox_cantidad.setVisible(true);
					 comboBox_cantidad.setSelectedIndex(0);
				 }else if(comboBox.getSelectedItem().equals("Pescado")) {
					 nombre_producto = null;
					 comboBox_Pasta.setVisible(false);
					 comboBox_Panaderia.setVisible(false);
					 comboBox_ComidaBasura.setVisible(false);
					 comboBox_Pescado.setVisible(true);
					 comboBox_Carne.setVisible(false);
					 comboBox_Verdura.setVisible(false);
					 comboBox_Fruta.setVisible(false);
					 comboBox_cantidad.setVisible(true);
					 comboBox_cantidad.setSelectedIndex(0);
				 }else if(comboBox.getSelectedItem().equals("Comida Basura")) {
					 nombre_producto = null;
					 comboBox_Pasta.setVisible(false);
					 comboBox_Panaderia.setVisible(false);
					 comboBox_ComidaBasura.setVisible(true);
					 comboBox_Pescado.setVisible(false);
					 comboBox_Carne.setVisible(false);
					 comboBox_Verdura.setVisible(false);
					 comboBox_Fruta.setVisible(false);
					 comboBox_cantidad.setVisible(true);
					 comboBox_cantidad.setSelectedIndex(0);
				 }else if (comboBox.getSelectedItem().equals("Panaderia")) {
					 nombre_producto = null;
					 comboBox_Pasta.setVisible(false);
					 comboBox_Panaderia.setVisible(true);
					 comboBox_ComidaBasura.setVisible(false);
					 comboBox_Pescado.setVisible(false);
					 comboBox_Carne.setVisible(false);
					 comboBox_Verdura.setVisible(false);
					 comboBox_Fruta.setVisible(false);
					 comboBox_cantidad.setVisible(true);
					 comboBox_cantidad.setSelectedIndex(0);
				 }else if(comboBox.getSelectedItem().equals("Pasta")) {
					 nombre_producto = null;
					 comboBox_Pasta.setVisible(true);
					 comboBox_Panaderia.setVisible(false);
					 comboBox_ComidaBasura.setVisible(false);
					 comboBox_Pescado.setVisible(false);
					 comboBox_Carne.setVisible(false);
					 comboBox_Verdura.setVisible(false);
					 comboBox_Fruta.setVisible(false);
					 comboBox_cantidad.setVisible(true);
					 comboBox_cantidad.setSelectedIndex(0);
				 }else {
					 nombre_producto = null;
					 comboBox_Pasta.setVisible(false);
					 comboBox_Panaderia.setVisible(false);
					 comboBox_ComidaBasura.setVisible(false);
					 comboBox_Pescado.setVisible(false);
					 comboBox_Carne.setVisible(false);
					 comboBox_Verdura.setVisible(false);
					 comboBox_Fruta.setVisible(false);
					 comboBox_cantidad.setVisible(false);
					 comboBox_cantidad.setSelectedIndex(0);
				 }
					 
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tipo de Comida ","Fruta", "Verdura", "Carne", "Pescado", "Comida Basura", "Panaderia", "Pasta"}));
		comboBox.setBounds(45, 120, 129, 20);
		contentPane.add(comboBox);
		
		JButton btnAadirAlCarrito = new JButton("A\u00F1adir al Carrito");
		btnAadirAlCarrito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnAadirAlCarrito.setBounds(45, 415, 141, 43);
		contentPane.add(btnAadirAlCarrito);
		btnAadirAlCarrito.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(nombre_producto==null) return;
				
				if(carro.containsKey(nombre_producto)) {
					 Integer cantidad_guardada = carro.get(nombre_producto);
					 String cantidad_seleccionada_tot = (String) comboBox_cantidad.getSelectedItem();
					 Integer cantidad_seleccionada_combo = Integer.parseInt(cantidad_seleccionada_tot);
					cantidad_guardada =  cantidad_guardada + cantidad_seleccionada_combo;
					carro.put(nombre_producto, cantidad_guardada);
				}else {
					String cantidad_seleccionada_tot_2 = (String) comboBox_cantidad.getSelectedItem();
					Integer cantidad_seleccionada_combo_2 = Integer.parseInt(cantidad_seleccionada_tot_2);
					carro.put(nombre_producto, cantidad_seleccionada_combo_2);	
					
				}
				updatelist();
				String coste_pracial_tot = (String) comboBox_cantidad.getSelectedItem();
				Integer coste_parcial_tot = Integer.parseInt(coste_pracial_tot);
				coste_total = coste_total + (precio_actual * coste_parcial_tot);
				lbl_coste_tot_total.setText(coste_total + " €");
				
			}
		});
		
		JLabel lblPreciou = new JLabel("Precio/u:");
		lblPreciou.setBounds(45, 367, 78, 14);
		contentPane.add(lblPreciou);
		
		JLabel lblPrecioTotal = new JLabel("Precio total:");
		lblPrecioTotal.setBounds(45, 392, 78, 14);
		contentPane.add(lblPrecioTotal);
		
		lbl_precio_u = new JLabel("0 €");
		lbl_precio_u.setBounds(162, 367, 78, 14);
		contentPane.add(lbl_precio_u);
		
		lbl_precio_total = new JLabel("0 €");
		lbl_precio_total.setBounds(162, 390, 78, 14);
		contentPane.add(lbl_precio_total);
		
		
		
		
	}
	 
	
	
	
	
}
