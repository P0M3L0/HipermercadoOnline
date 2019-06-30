package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JProgressBar;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Component;
import javax.swing.UIManager;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class VentanaPrincipalCarga extends JFrame {

	private JPanel contentPane;
	private JPasswordField textField;
	private JTextField textField_1;
	
	
	
	
	/**
	 * Create the frame.
	 */
	public VentanaPrincipalCarga() {
		setForeground(SystemColor.desktop);
		setTitle("Shopping Assistant");
		setResizable(false);
		setFont(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 401, 250);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome to your Delivery Sistem Asistant");
		lblNewLabel_1.setBounds(5, 0, 385, 38);
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lblNewLabel_1.setBorder(null);
		lblNewLabel_1.setBackground(SystemColor.menu);
		lblNewLabel_1.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_1.setPreferredSize(new Dimension(121, 8));
		lblNewLabel_1.setLabelFor(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(SystemColor.activeCaptionText);
		lblNewLabel_1.setName("");
		lblNewLabel_1.setOpaque(true);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Gracias por confiar en nuestros productos");
		lblNewLabel.setBounds(50, 155, 290, 32);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setPreferredSize(new Dimension(120, 100));
		contentPane.add(lblNewLabel);
		
		textField = new JPasswordField();
		textField.setBounds(201, 77, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		textField_1.setBounds(201, 51, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(50, 51, 139, 16);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(50, 80, 139, 16);
		contentPane.add(lblPassword);
		
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean correct=false;
				try {
					Scanner sc=new Scanner(new File("accs.acc"));
			
					while(sc.hasNextLine())
					{
						String line=sc.nextLine();
						
						if(line.split(";")[0].equals(textField_1.getText()))
						{
							
							if(line.split(";")[1].toString().equals(textField.getText()))
							{
							
								correct=true;
								break;
							}
						}
						
					}
					
					sc.close();
				} catch (FileNotFoundException e) {
					JOptionPane.showMessageDialog(null, "El archivo no ha sido encontrado");
				}
				if(correct)
				{
					
					Ventana_principal p=new Ventana_principal();
					p.crearcomidas();
					p.setVisible(true);
					setVisible(false);
					dispose();
					
					
				}else
				{
					JOptionPane.showMessageDialog(null, "El usuario introducido no existe");
				}
				
				
			}
		});
		btnAceptar.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnAceptar.setForeground(SystemColor.activeCaptionText);
		btnAceptar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnAceptar.setBounds(147, 110, 97, 25);
		contentPane.add(btnAceptar);
	}
	
	public void doa() throws ParseException
	{
		this.setVisible(false);
		Ventana_principal p=new Ventana_principal();
		p.setVisible(true);
	}
	
	

			
		
	}

