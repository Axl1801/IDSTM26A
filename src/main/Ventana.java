package main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	public Ventana() {
		//Creacion de ventana y ajuste de sus parametros
		 this.setSize(1200,800);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setLocationRelativeTo(null);
		 this.setTitle("Login");
		 this.setMinimumSize(new Dimension(200,200));
		 this.setMaximumSize(new Dimension(1200,800));
		 this.setBackground(Color.black);
		 this.getContentPane().setBackground(Color.black);
		 this.setLayout(null);
		 
		 //Cargar Imegen para el icono de la ventana y setearlo
		 ImageIcon icon = new ImageIcon("IconoVentana2.PNG");
		 this.setIconImage(icon.getImage());
		 
		 this.menu();
		 
		 //Invocacion de las diferentes pantallas.
		 this.login();
		 this.setVisible(true);
		
	}
	
	public void login() {
		 //Contenedor login
		 JPanel contenedor = new JPanel();
		 contenedor.setOpaque(true);
		 contenedor.setBackground(Color.gray);
		 contenedor.setSize(1000,600);
		 contenedor.setLayout(null);
		 contenedor.setLocation(100,100);
		 contenedor.setVisible(true);
		 this.add(contenedor);
		 
		 //Imagen para login
		 JLabel title_login = new JLabel();
		 ImageIcon icon2 = new ImageIcon("IconoLogin2.png");
		 title_login.setIcon(icon2);
		 title_login.setLocation(390,50);
		 title_login.setSize(250,150);
		 contenedor.add(title_login);
		 
		 //Creacion de etiquetas y campos para el login
		 JLabel title_username = new JLabel();
		 title_username.setText("Usuario");
		 title_username.setSize(50,10);
		 title_username.setOpaque(true);
		 title_username.setLocation(350,200);
		 title_username.setBackground(Color.decode("#FAFAFA"));
		 title_username.setFont(new Font("Arial",Font.BOLD,12));
		 title_username.setHorizontalAlignment(JLabel.CENTER);
		 //title_username.setBorder(BorderFactory.createLineBorder(Color.BLACK,1,true));
		 contenedor.add(title_username);
		 
		 JTextField username = new JTextField();
		 username.setSize(300,30);
		 username.setLocation(350,215);
		 username.setFont(new Font("Arial",Font.BOLD,22));
		 contenedor.add(username);
		 
		 JLabel title_password = new JLabel();
		 title_password.setText("Contraseña");
		 title_password.setSize(80,10);
		 title_password.setOpaque(true);
		 title_password.setLocation(345,265);
		 title_password.setBackground(Color.decode("#FAFAFA"));
		 title_password.setFont(new Font("Arial",Font.BOLD,12));
		 title_password.setHorizontalAlignment(JLabel.CENTER);
		 contenedor.add(title_password);
		 
		 
		 JPasswordField password = new JPasswordField();
		 password.setSize(300,30);
		 password.setLocation(350, 280);
		 password.setFont(new Font("Arial",Font.BOLD,22));
		 contenedor.add(password);
		 
		 JLabel title_ForgotPassword= new JLabel();
		 title_ForgotPassword.setText("¿Has olvidado tu contraseña?");
		 title_ForgotPassword.setSize(180,15);
		 title_ForgotPassword.setOpaque(true);
		 title_ForgotPassword.setLocation(345,315);
		 title_ForgotPassword.setBackground(Color.decode("#FAFAFA"));
		 title_ForgotPassword.setFont(new Font("Arial",Font.BOLD,12));
		 title_ForgotPassword.setForeground(Color.blue);
		 title_ForgotPassword.setHorizontalAlignment(JLabel.CENTER);
		 contenedor.add(title_ForgotPassword);
		 
		 JCheckBox remember = new JCheckBox();
		 remember.setSize(120,15);
		 remember.setText("Recordarme");
		 remember.setBackground(Color.decode("#FAFAFA"));
		 remember.setOpaque(true);
		 remember.setLocation(555, 315);
		 remember.setFont(new Font("Arial",Font.BOLD,12));
		 //remember.setHorizontalTextPosition(JLabel.CENTER);
		 contenedor.add(remember);
		 
		 JButton acceder = new JButton();
		 acceder.setText("Acceder");
		 acceder.setBackground(Color.black);
		 acceder.setForeground(Color.white);
		 acceder.setLocation(440, 350);
		 acceder.setSize(120,50);
		 acceder.setFont(new Font("Arial",Font.BOLD,18));
		 acceder.setFocusPainted(false);		 
		 contenedor.add(acceder);
		 
		 //Action Listener para crear la funcion del boton, validaciones del login
		 acceder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String username_val = username.getText();
				String password_val = new String(password.getPassword());
				String real_user = "Axel123";
				String real_pass = "ExtrañoAMiEx123";
				if(username_val.equals("") || username_val.contains(" ") || !username_val.equals(real_user) 
						|| !password_val.equals(real_pass)) {
					username.setBorder(BorderFactory.createLineBorder(Color.red,2,true));
					username.setBackground(Color.decode("#FFCFCF"));
					password.setBorder(BorderFactory.createLineBorder(Color.red,2,true));
					password.setBackground(Color.decode("#FFCFCF"));
					JOptionPane.showMessageDialog(null, "Datos Incorrectos, Porfavor Verifique sus datos o regisrtrese en el sistema");
				}
				else {
					username.setBorder(BorderFactory.createLineBorder(Color.green,2,true));
					username.setBackground(Color.decode("#D1FFCF"));
					password.setBorder(BorderFactory.createLineBorder(Color.green,2,true));
					password.setBackground(Color.decode("#D1FFCF"));
				}
			}});
		 
		 
		 
		 JButton registro = new JButton("¿Aún no tienes cuenta?");
		 registro.setText("Registrarse");
		 registro.setBackground(Color.black);
		 registro.setForeground(Color.white);
		 registro.setLocation(425, 420);
		 registro.setSize(150,50);
		 registro.setFont(new Font("Arial",Font.BOLD,18));
		 registro.setFocusPainted(false);		 
		 contenedor.add(registro);
		 
		 registro.addActionListener(e-> {
			 this.router("registro");
		 });
		 
		 //Carga y set de la imgaen de fondo del login
		 JLabel fondoImagen = new JLabel();
		 fondoImagen.setBounds(300,50,400,450);
		 fondoImagen.setOpaque(true);
		 fondoImagen.setBackground(Color.decode("#FAFAFA"));
		 contenedor.add(fondoImagen);
		 
		 ImageIcon imagenFondo = new ImageIcon("fondo.JPG");
		 JLabel imagen1 = new JLabel(imagenFondo);
		 imagen1.setBounds(0, 0, 1000, 600);
		 imagen1.setOpaque(true);
		 contenedor.add(imagen1);
		 
		 ImageIcon imagenBienvenido = new ImageIcon("Bienvenido.JPG");
		 JLabel imagen2 = new JLabel(imagenBienvenido);
		 imagen2.setBounds(0,0,0,0);
		 
		 //Comandos para asegurar que todos los componentes se generan correctamente
		 contenedor.repaint();
		 contenedor.revalidate();
	}
	
	public void registro() {
		 //Contenedor registro
		 JPanel register_container = new JPanel();
		 register_container.setSize(500,500);
		 register_container.setLocation(350, 100);
		 register_container.setOpaque(true);
		 register_container.setBackground(Color.decode("#FFFFFF"));
		 register_container.setLayout(null);
		 this.add(register_container);
		 
		 //Creacion de las etiquetas y TextFields de la ventana de registro
		 JLabel bio_tag = new JLabel("---Registro---");
		 bio_tag.setBounds(0,30,500,30);
		 bio_tag.setBackground(Color.black);
		 bio_tag.setOpaque(true);
		 bio_tag.setHorizontalAlignment(JLabel.CENTER);
		 bio_tag.setFont(new Font("Arial",Font.BOLD,22));
		 bio_tag.setForeground(Color.white);
		 register_container.add(bio_tag);
		 
		 JLabel reg_user = new JLabel("Nombre de usuario");
		 reg_user.setBounds(0, 45, 500, 70);
		 reg_user.setHorizontalAlignment(JLabel.CENTER);
		 reg_user.setFont(new Font("Arial",Font.BOLD, 15));
		 //reg_user.setBorder(BorderFactory.createLineBorder(Color.BLACK,1,true));
		 register_container.add(reg_user);
		 
		 JTextField reg_username = new JTextField();
		 reg_username.setSize(300,30);
		 reg_username.setLocation(100,90);
		 reg_username.setFont(new Font("Arial",Font.BOLD,15));
		 register_container.add(reg_username);
		 
		 JLabel reg_bio = new JLabel("Biografia");
		 reg_bio.setBounds(0, 100, 500, 60);
		 reg_bio.setHorizontalAlignment(JLabel.CENTER);
		 reg_bio.setFont(new Font("Arial",Font.BOLD, 15));
		 register_container.add(reg_bio);
		 
		 JTextArea bio_text = new JTextArea();
		 bio_text.setBounds(100,140,300,60);
		 bio_text.setBackground(Color.decode("#D9D9D9"));
		 register_container.add(bio_text);
		 
		 JLabel tag_correo = new JLabel("Correo Electronico");
		 tag_correo.setBounds(0, 200, 500, 30);
		 tag_correo.setHorizontalAlignment(JLabel.CENTER);
		 tag_correo.setFont(new Font("Arial",Font.BOLD, 15));
		 register_container.add(tag_correo);
		 
		 JTextField reg_correo = new JTextField();
		 reg_correo.setSize(300,30);
		 reg_correo.setLocation(100,225);
		 reg_correo.setFont(new Font("Arial",Font.BOLD,15));
		 register_container.add(reg_correo);
		 
		 JLabel reg_pref = new JLabel("Preferencias");
		 reg_pref.setBounds(0, 260, 500, 30);
		 reg_pref.setHorizontalAlignment(JLabel.CENTER);
		 reg_pref.setFont(new Font("Arial",Font.BOLD, 15));
		 register_container.add(reg_pref);
		 
		 //Creacion de los botones de marcado para la seleccion del usuario
		 JCheckBox sweet_option = new JCheckBox("Dulce");
		 sweet_option.setBounds(100,285,100,40);
		 register_container.add(sweet_option);
		
		 
		 JCheckBox salty_option = new JCheckBox("Salado");
		 salty_option.setBounds(200,285,100,40);
		 register_container.add(salty_option);
		 
		 JCheckBox healthy_option = new JCheckBox("Saludable");
		 healthy_option.setBounds(300,285,100,40);
		 //healthy_option.setBorder(BorderFactory.createLineBorder(Color.BLACK,1,true));
		 //healthy_option.setBorderPainted(true);
		 register_container.add(healthy_option);
		 
		 JLabel reg_terms = new JLabel("TERMINOS Y CONDICIONES");
		 reg_terms.setBounds(100, 330, 300, 30);
		 reg_terms.setBackground(Color.black);
		 reg_terms.setOpaque(true);
		 reg_terms.setForeground(Color.white);
		 reg_terms.setHorizontalAlignment(JLabel.CENTER);
		 reg_terms.setFont(new Font("Arial",Font.BOLD, 15));
		 
		 register_container.add(reg_terms);
		 
		 //Cracion de botones para la seleccion del usuario (De tipo RadioButton)
		 JRadioButton acceptance_terms = new JRadioButton("Acepto los terminos");
		 acceptance_terms.setBounds(100, 365, 150,30);
		 register_container.add(acceptance_terms);
		 
		 JRadioButton reject_terms = new JRadioButton("Rechazo los terminos");
		 reject_terms.setBounds(250, 365, 150, 30);
		 register_container.add(reject_terms);
		 
		 //Creacion de un Grupo de botones para que el usuario pueda seleccionar unicamente una opcion de los RadioButton
		 ButtonGroup terms = new ButtonGroup();
		 terms.add(reject_terms);
		 terms.add(acceptance_terms);
		 
		 //Creacion de un arreglo para introducir cada copcion dentro de un ComboBox
		 String[] colonias = {"Elija su localidad", "Camino York", "La fuente", "villas del encanto", "Cihuatan"};
		 JComboBox list = new JComboBox(colonias);
		 list.setBounds(120, 400, 250, 30);
		 register_container.add(list);
		 
		 //Boton de crear
		 JButton reg_crear = new JButton();
		 reg_crear.setText("Crear cuenta");
		 reg_crear.setLocation(100, 435);
		 reg_crear.setSize(150,50);
		 reg_crear.setFont(new Font("Arial",Font.BOLD,18));
		 register_container.add(reg_crear);
		 //Validaciones al pulsar boton
		 reg_crear.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String username_val = reg_username.getText();
					String desc_val = bio_text.getText();
					boolean valid = true;
					//REGISTRO DE USUARIO
					if(username_val.equals("") || username_val.contains(" ") ) {
						reg_username.setBorder(BorderFactory.createLineBorder(Color.red,2,true));
						reg_username.setBackground(Color.decode("#FFCFCF"));
						valid = false;
					}else {
						reg_username.setBorder(BorderFactory.createLineBorder(Color.green,2,true));
						reg_username.setBackground(Color.decode("#D1FFCF"));
					}
					//BIOGRAFIA
					if(desc_val.length() > 0 && desc_val.length() < 6) {
						bio_text.setBorder(BorderFactory.createLineBorder(Color.red,2,true));
						bio_text.setBackground(Color.decode("#FFCFCF"));
						valid = false;
					}else {
						bio_text.setBorder(BorderFactory.createLineBorder(Color.green,2,true));
						bio_text.setBackground(Color.decode("#D1FFCF"));
					}
					//OPCIONES DE PREFERENCIA
					if(!healthy_option.isSelected() && !salty_option.isSelected() && !sweet_option.isSelected()) {
						healthy_option.setBorder(BorderFactory.createLineBorder(Color.red,2,true));
						healthy_option.setBackground(Color.decode("#FFCFCF"));
						salty_option.setBorder(BorderFactory.createLineBorder(Color.red,2,true));
						salty_option.setBackground(Color.decode("#FFCFCF"));
						sweet_option.setBorder(BorderFactory.createLineBorder(Color.red,2,true));
						sweet_option.setBackground(Color.decode("#FFCFCF"));
						valid = false;
						
					}else {
						healthy_option.setBorder(BorderFactory.createLineBorder(Color.green,2,true));
						healthy_option.setBackground(Color.decode("#D1FFCF"));
						salty_option.setBorder(BorderFactory.createLineBorder(Color.green,2,true));
						salty_option.setBackground(Color.decode("#D1FFCF"));
						sweet_option.setBorder(BorderFactory.createLineBorder(Color.green,2,true));
						sweet_option.setBackground(Color.decode("#D1FFCF"));
					}
					//ACEPTAR TERMINOS Y CONDICIONES
					if(!acceptance_terms.isSelected()) {
						acceptance_terms.setBorder(BorderFactory.createLineBorder(Color.red,2,true));
						acceptance_terms.setBackground(Color.decode("#FFCFCF"));
						valid = false;
					}else {
						acceptance_terms.setBorder(BorderFactory.createLineBorder(Color.green,2,true));
						acceptance_terms.setBackground(Color.decode("#D1FFCF"));	
					}
					
					//MOSTRAR VENTANA DE ERROR
					if(!valid) {
						JOptionPane.showMessageDialog(null,"Error, llene correctamente los datos o vuelva a intentarlo");
					}
					
				}});
		 //Boton para volver al login
		 JButton login_back = new JButton("¿Ya tienes cuenta?");
		 login_back.setLocation(250, 435);
		 login_back.setSize(150,50);
		 login_back.setFont(new Font("Arial",Font.BOLD,13));
		 login_back.setFocusPainted(false);		 
		 register_container.add(login_back);
		 
		 login_back.addActionListener(e-> {
			 this.router("login");
		 });
		 //Repintado de los elemetos
		 register_container.repaint();
	}
	
	public void users() {
		//Creacion del Panel de usuraios
		JPanel users = new JPanel();
		users.setSize(1000,500);
		users.setLocation(100, 50);
		users.setBackground(Color.white);
		users.setLayout(null);
		this.add(users);
		
		//Etiquetas y botones para la pantalla de users
		JLabel user_title = new JLabel("Consul");
		user_title.setBounds(400, 50, 100,40);
		user_title.setHorizontalAlignment(JLabel.CENTER);
		user_title.setFont(new Font("Arial",Font.BOLD,22));
		user_title.setOpaque(true);
		user_title.setBackground(Color.cyan);
		users.add(user_title);
		
		JButton export = new JButton("Exportar");
		export.setBounds(30,120,100,40);
		users.add(export);
		
		JButton add = new JButton("Añadir");
		add.setBounds(130,120,100,40);
		users.add(add);
		
		//Creacion de un arreglo de opciones  para los apartados de una tabla
		Object [] table_head = {"No. control","Nombre","Apellidos","Semestre","Promedio","Acciones"};
		//Creacion de una matriz para los datos de una tabla 
		Object [][] table_content = {
				{"No. control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"22040150", "Alejandro", "García Pérez", "4", "88.5", "Editar"},
				{"23040012", "Sofía", "Martínez Ruiz", "2", "95.0", "Editar"},
				{"21040890", "Carlos", "López Castro", "6", "78.2", "Editar"},
				{"20040331", "Mariana", "Hernández Díaz", "8", "92.4", "Editar"},
				{"22040150", "Alejandro", "García Pérez", "4", "88.5", "Editar"},
				{"23040012", "Sofía", "Martínez Ruiz", "2", "95.0", "Editar"},
				{"21040890", "Carlos", "López Castro", "6", "78.2", "Editar"},
				{"22040150", "Alejandro", "García Pérez", "4", "88.5", "Editar"},
				{"23040012", "Sofía", "Martínez Ruiz", "2", "95.0", "Editar"},
				{"21040890", "Carlos", "López Castro", "6", "78.2", "Editar"},
				{"20040331", "Mariana", "Hernández Díaz", "8", "92.4", "Editar"},
				{"22040150", "Alejandro", "García Pérez", "4", "88.5", "Editar"},
				{"23040012", "Sofía", "Martínez Ruiz", "2", "95.0", "Editar"},
				{"21040890", "Carlos", "López Castro", "6", "78.2", "Editar"},
				{"22040150", "Alejandro", "García Pérez", "4", "88.5", "Editar"},
				{"23040012", "Sofía", "Martínez Ruiz", "2", "95.0", "Editar"},
				{"21040890", "Carlos", "López Castro", "6", "78.2", "Editar"},
				{"20040331", "Mariana", "Hernández Díaz", "8", "92.4", "Editar"},
				{"22040150", "Alejandro", "García Pérez", "4", "88.5", "Editar"},
				{"23040012", "Sofía", "Martínez Ruiz", "2", "95.0", "Editar"},
				{"21040890", "Carlos", "López Castro", "6", "78.2", "Editar"},
				{"20040331", "Mariana", "Hernández Díaz", "8", "92.4", "Editar"}
		};
		
		//Creacion de la tabla para usuario con datos, campos y una scrollBar para navegacion
		JTable users_table = new JTable(table_content,table_head);
		JScrollPane scrollPane = new JScrollPane(users_table);
		scrollPane.setLocation(30, 180);
		scrollPane.setSize(800,200);
		//users_table.setBorder(BorderFactory.createLineBorder(Color.black));
		users.add(scrollPane);
	}
	
	public void password_recovery() {
		//Contenedor login
		 JPanel cont_pass = new JPanel();
		 cont_pass.setOpaque(true);
		 cont_pass.setBackground(Color.white);
		 cont_pass.setSize(600,400);
		 cont_pass.setLayout(null);
		 cont_pass.setLocation(300,150);
		 cont_pass.setVisible(true);
		 this.add(cont_pass);
		 
		 //Creacion de etiquetas y campos para el login
		 JLabel title_recpass = new JLabel();
		 title_recpass.setText("Recuperar contraseña");
		 title_recpass.setSize(400,30);
		 title_recpass.setOpaque(true);
		 title_recpass.setLocation(100,50);
		 title_recpass.setBackground(Color.black);
		 title_recpass.setForeground(Color.white);
		 title_recpass.setFont(new Font("Arial",Font.BOLD,20));
		 title_recpass.setHorizontalAlignment(JLabel.CENTER);
		 cont_pass.add(title_recpass);
		 
		 JLabel title_correo = new JLabel();
		 title_correo.setText("Introduzca el correo asociado a su cuenta.");
		 title_correo.setSize(300,80);
		 title_correo.setOpaque(true);
		 title_correo.setLocation(150,100);
		 title_correo.setBackground(Color.white);
		 title_correo.setFont(new Font("Arial",Font.BOLD,13));
		 title_correo.setHorizontalAlignment(JLabel.CENTER);
		 cont_pass.add(title_correo);
		 
		 JTextField field_correo = new JTextField();
		 field_correo.setSize(300,30);
		 field_correo.setLocation(150,190);
		 field_correo.setFont(new Font("Arial",Font.BOLD,15));
		 cont_pass.add(field_correo);
		 
		 JButton boton_enviar = new JButton();
		 boton_enviar.setText("Enviar");
		 boton_enviar.setBackground(Color.black);
		 boton_enviar.setForeground(Color.white);
		 boton_enviar.setLocation(300, 280);
		 boton_enviar.setSize(150,50);
		 boton_enviar.setFont(new Font("Arial",Font.BOLD,18));
		 boton_enviar.setFocusPainted(false);		 
		 cont_pass.add(boton_enviar);
		 
		 JButton boton_volver = new JButton();
		 boton_volver.setText("volver");
		 boton_volver.setBackground(Color.black);
		 boton_volver.setForeground(Color.white);
		 boton_volver.setLocation(150, 280);
		 boton_volver.setSize(150,50);
		 boton_volver.setFont(new Font("Arial",Font.BOLD,18));
		 boton_volver.setFocusPainted(false);
		 boton_volver.addActionListener(e ->{
			 this.router("login");
		 });
		 cont_pass.add(boton_volver);
		 
		 //Comandos para asegurar que todos los componentes se generan correctamente
		 cont_pass.repaint();
		 cont_pass.revalidate();
		 
	}
	
	public void alta() {
		//Contenedor login
		 JPanel alta = new JPanel();
		 alta.setOpaque(true);
		 alta.setBackground(Color.white);
		 alta.setSize(1000,600);
		 alta.setLayout(null);
		 alta.setLocation(100,100);
		 alta.setVisible(true);
		 this.add(alta);
		 
		 //Creacion de etiquetas y campos para el login
		 JLabel title_alta = new JLabel();
		 title_alta.setText("Alta Usuario");
		 title_alta.setSize(300,30);
		 title_alta.setOpaque(true);
		 title_alta.setLocation(350,50);
		 title_alta.setBackground(Color.white);
		 title_alta.setFont(new Font("Arial",Font.BOLD,20));
		 title_alta.setHorizontalAlignment(JLabel.CENTER);
		 alta.add(title_alta);
		 
		 JPanel panel_datos = new JPanel();
		 panel_datos.setOpaque(true);
		 panel_datos.setBackground(Color.decode("#DBD5D5"));
		 panel_datos.setSize(600,300);
		 panel_datos.setLayout(new GridLayout(5, 2, 0, 0));
		 panel_datos.setLocation(200,100);
		 panel_datos.setVisible(true);
		 alta.add(panel_datos);
		 
		 JLabel lab_id = new JLabel();
		 lab_id.setSize(100,75);
		 lab_id.setText("No. Control: ");
		 lab_id.setFont(new Font("Arial",Font.BOLD,15));
		 lab_id.setBackground(Color.black);
		 lab_id.setForeground(Color.white);
		 lab_id.setHorizontalAlignment(JLabel.CENTER);
		 lab_id.setOpaque(true);
		 panel_datos.add(lab_id);
		 
		 JTextField field_id = new JTextField();
		 field_id.setSize(300,30);
		 field_id.setLocation(150,220);
		 field_id.setFont(new Font("Arial",Font.BOLD,15));
		 panel_datos.add(field_id);
		 
		 JLabel lab_nombre = new JLabel();
		 lab_nombre.setSize(100,75);
		 lab_nombre.setText("Nombre(s): ");
		 lab_nombre.setFont(new Font("Arial",Font.BOLD,15));
		 lab_nombre.setBackground(Color.black);
		 lab_nombre.setForeground(Color.white);
		 lab_nombre.setHorizontalAlignment(JLabel.CENTER);
		 lab_nombre.setOpaque(true);
		 panel_datos.add(lab_nombre);
		 
		 JTextField field_nombre = new JTextField();
		 field_nombre.setSize(300,30);
		 field_nombre.setLocation(150,220);
		 field_nombre.setFont(new Font("Arial",Font.BOLD,15));
		 panel_datos.add(field_nombre);
		 
		 JLabel lab_apellido = new JLabel();
		 lab_apellido.setSize(100,75);
		 lab_apellido.setText("Apellido(s): ");
		 lab_apellido.setFont(new Font("Arial",Font.BOLD,15));
		 lab_apellido.setBackground(Color.black);
		 lab_apellido.setForeground(Color.white);
		 lab_apellido.setHorizontalAlignment(JLabel.CENTER);
		 lab_apellido.setOpaque(true);
		 panel_datos.add(lab_apellido);
		 
		 JTextField field_apellido = new JTextField();
		 field_apellido.setSize(300,30);
		 field_apellido.setLocation(150,220);
		 field_apellido.setFont(new Font("Arial",Font.BOLD,15));
		 panel_datos.add(field_apellido);
		 
		 JLabel lab_semestre = new JLabel();
		 lab_semestre.setSize(100,75);
		 lab_semestre.setText("Semestre: ");
		 lab_semestre.setFont(new Font("Arial",Font.BOLD,15));
		 lab_semestre.setBackground(Color.black);
		 lab_semestre.setForeground(Color.white);
		 lab_semestre.setHorizontalAlignment(JLabel.CENTER);
		 lab_semestre.setOpaque(true);
		 panel_datos.add(lab_semestre);
		 
		 JTextField field_semestre = new JTextField();
		 field_semestre.setSize(300,30);
		 field_semestre.setLocation(150,220);
		 field_semestre.setFont(new Font("Arial",Font.BOLD,15));
		 panel_datos.add(field_semestre);
		 
		 JLabel lab_prommedio = new JLabel();
		 lab_prommedio.setSize(100,75);
		 lab_prommedio.setText("Promedio: ");
		 lab_prommedio.setFont(new Font("Arial",Font.BOLD,15));
		 lab_prommedio.setBackground(Color.black);
		 lab_prommedio.setForeground(Color.white);
		 lab_prommedio.setHorizontalAlignment(JLabel.CENTER);
		 lab_prommedio.setOpaque(true);
		 panel_datos.add(lab_prommedio);
		 
		 JTextField field_prommedio = new JTextField();
		 field_prommedio.setSize(300,30);
		 field_prommedio.setLocation(150,220);
		 field_prommedio.setFont(new Font("Arial",Font.BOLD,15));
		 panel_datos.add(field_prommedio);
		 
		 JButton boton_alta = new JButton();
		 boton_alta.setText("Alta");
		 boton_alta.setBackground(Color.black);
		 boton_alta.setForeground(Color.white);
		 boton_alta.setLocation(350, 480);
		 boton_alta.setSize(150,50);
		 boton_alta.setFont(new Font("Arial",Font.BOLD,18));
		 boton_alta.setFocusPainted(false);		 
		 alta.add(boton_alta);
		 
		 JButton boton_volver = new JButton();
		 boton_volver.setText("volver");
		 boton_volver.setBackground(Color.black);
		 boton_volver.setForeground(Color.white);
		 boton_volver.setLocation(200, 480);
		 boton_volver.setSize(150,50);
		 boton_volver.setFont(new Font("Arial",Font.BOLD,18));
		 boton_volver.setFocusPainted(false);
		 boton_volver.addActionListener(e ->{
			 this.router("login");
		 });
		 alta.add(boton_volver);
		 
		 //Comandos para asegurar que todos los componentes se generan correctamente
		 alta.repaint();
		 alta.revalidate();
	}
	
	public void baja() {
		//Contenedor login
		 JPanel baja = new JPanel();
		 baja.setOpaque(true);
		 baja.setBackground(Color.white);
		 baja.setSize(1000,600);
		 baja.setLayout(null);
		 baja.setLocation(100,100);
		 baja.setVisible(true);
		 this.add(baja);
		 
		 //Creacion de etiquetas y campos para el login
		 JLabel title_baja = new JLabel();
		 title_baja.setText("Baja Usuario");
		 title_baja.setSize(300,30);
		 title_baja.setOpaque(true);
		 title_baja.setLocation(350,50);
		 title_baja.setBackground(Color.decode("#FAFAFA"));
		 title_baja.setFont(new Font("Arial",Font.BOLD,20));
		 title_baja.setHorizontalAlignment(JLabel.CENTER);
		 baja.add(title_baja);
		 
		 JPanel panel_datos = new JPanel();
		 panel_datos.setOpaque(true);
		 panel_datos.setBackground(Color.decode("#DBD5D5"));
		 panel_datos.setSize(600,300);
		 panel_datos.setLayout(new GridLayout(3, 2, 0, 0));
		 panel_datos.setLocation(200,100);
		 panel_datos.setVisible(true);
		 baja.add(panel_datos);
		 
		 JLabel lab_id = new JLabel();
		 lab_id.setSize(100,75);
		 lab_id.setText("No. Control: ");
		 lab_id.setFont(new Font("Arial",Font.BOLD,15));
		 lab_id.setBackground(Color.black);
		 lab_id.setForeground(Color.white);
		 lab_id.setHorizontalAlignment(JLabel.CENTER);
		 lab_id.setOpaque(true);
		 panel_datos.add(lab_id);
		 
		 JTextField field_id = new JTextField();
		 field_id.setSize(300,30);
		 field_id.setLocation(150,220);
		 field_id.setFont(new Font("Arial",Font.BOLD,15));
		 panel_datos.add(field_id);
		 
		 JLabel lab_nombre = new JLabel();
		 lab_nombre.setSize(100,75);
		 lab_nombre.setText("Nombre(s): ");
		 lab_nombre.setFont(new Font("Arial",Font.BOLD,15));
		 lab_nombre.setBackground(Color.black);
		 lab_nombre.setForeground(Color.white);
		 lab_nombre.setHorizontalAlignment(JLabel.CENTER);
		 lab_nombre.setOpaque(true);
		 panel_datos.add(lab_nombre);
		 
		 JTextField field_nombre = new JTextField();
		 field_nombre.setSize(300,30);
		 field_nombre.setLocation(150,220);
		 field_nombre.setFont(new Font("Arial",Font.BOLD,15));
		 panel_datos.add(field_nombre);
		 
		 JLabel lab_apellido = new JLabel();
		 lab_apellido.setSize(100,75);
		 lab_apellido.setText("Apellido(s): ");
		 lab_apellido.setFont(new Font("Arial",Font.BOLD,15));
		 lab_apellido.setBackground(Color.black);
		 lab_apellido.setForeground(Color.white);
		 lab_apellido.setHorizontalAlignment(JLabel.CENTER);
		 lab_apellido.setOpaque(true);
		 panel_datos.add(lab_apellido);
		 
		 JTextField field_apellido = new JTextField();
		 field_apellido.setSize(300,30);
		 field_apellido.setLocation(150,220);
		 field_apellido.setFont(new Font("Arial",Font.BOLD,15));
		 panel_datos.add(field_apellido);
		 
		 JButton boton_baja = new JButton();
		 boton_baja.setText("Baja");
		 boton_baja.setBackground(Color.black);
		 boton_baja.setForeground(Color.white);
		 boton_baja.setLocation(350, 480);
		 boton_baja.setSize(150,50);
		 boton_baja.setFont(new Font("Arial",Font.BOLD,18));
		 boton_baja.setFocusPainted(false);		 
		 baja.add(boton_baja);
		 
		 JButton boton_volver = new JButton();
		 boton_volver.setText("volver");
		 boton_volver.setBackground(Color.black);
		 boton_volver.setForeground(Color.white);
		 boton_volver.setLocation(200, 480);
		 boton_volver.setSize(150,50);
		 boton_volver.setFont(new Font("Arial",Font.BOLD,18));
		 boton_volver.setFocusPainted(false);
		 boton_volver.addActionListener(e ->{
			 this.router("login");
		 });
		 baja.add(boton_volver);
		 
		 //Comandos para asegurar que todos los componentes se generan correctamente
		 baja.repaint();
		 baja.revalidate();
		 

	}
	
	public void consult() {
		//Contenedor login
		 JPanel consult = new JPanel();
		 consult.setOpaque(true);
		 consult.setBackground(Color.white);
		 consult.setSize(900,500);
		 consult.setLayout(null);
		 consult.setLocation(150,100);
		 consult.setVisible(true);
		 this.add(consult);
		 
		 //Creacion de etiquetas y campos para el login
		 JLabel title_consult = new JLabel();
		 title_consult.setText("Consultar Usuario");
		 title_consult.setSize(300,30);
		 title_consult.setOpaque(true);
		 title_consult.setLocation(300,50);
		 title_consult.setBackground(Color.white);
		 title_consult.setFont(new Font("Arial",Font.BOLD,20));
		 title_consult.setHorizontalAlignment(JLabel.CENTER);
		 //title_username.setBorder(BorderFactory.createLineBorder(Color.BLACK,1,true));
		 consult.add(title_consult);
		 
			JButton export = new JButton("Exportar");
			export.setBounds(30,120,100,40);
			export.setBackground(Color.black);
			export.setForeground(Color.white);
			consult.add(export);
			
			JButton add = new JButton("Añadir");
			add.setBounds(130,120,100,40);
			add.setBackground(Color.black);
			add.setForeground(Color.white);
			consult.add(add);
		 
		//Creacion de un arreglo de opciones  para los apartados de una tabla
			Object [] table_head = {"No. control","Nombre","Apellidos","Semestre","Promedio","Acciones"};
			//Creacion de una matriz para los datos de una tabla 
			Object [][] table_content = {
					{"No. control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
					{"22040150", "Alejandro", "García Pérez", "4", "88.5", "Editar"},
					{"23040012", "Sofía", "Martínez Ruiz", "2", "95.0", "Editar"},
					{"21040890", "Carlos", "López Castro", "6", "78.2", "Editar"},
					{"20040331", "Mariana", "Hernández Díaz", "8", "92.4", "Editar"},
					{"22040150", "Alejandro", "García Pérez", "4", "88.5", "Editar"},
					{"23040012", "Sofía", "Martínez Ruiz", "2", "95.0", "Editar"},
					{"21040890", "Carlos", "López Castro", "6", "78.2", "Editar"},
					{"22040150", "Alejandro", "García Pérez", "4", "88.5", "Editar"},
					{"23040012", "Sofía", "Martínez Ruiz", "2", "95.0", "Editar"},
					{"21040890", "Carlos", "López Castro", "6", "78.2", "Editar"},
					{"20040331", "Mariana", "Hernández Díaz", "8", "92.4", "Editar"},
					{"22040150", "Alejandro", "García Pérez", "4", "88.5", "Editar"},
					{"23040012", "Sofía", "Martínez Ruiz", "2", "95.0", "Editar"},
					{"21040890", "Carlos", "López Castro", "6", "78.2", "Editar"},
					{"22040150", "Alejandro", "García Pérez", "4", "88.5", "Editar"},
					{"23040012", "Sofía", "Martínez Ruiz", "2", "95.0", "Editar"},
					{"21040890", "Carlos", "López Castro", "6", "78.2", "Editar"},
					{"20040331", "Mariana", "Hernández Díaz", "8", "92.4", "Editar"},
					{"22040150", "Alejandro", "García Pérez", "4", "88.5", "Editar"},
					{"23040012", "Sofía", "Martínez Ruiz", "2", "95.0", "Editar"},
					{"21040890", "Carlos", "López Castro", "6", "78.2", "Editar"},
					{"20040331", "Mariana", "Hernández Díaz", "8", "92.4", "Editar"}
			};
			
			//Creacion de la tabla para usuario con datos, campos y una scrollBar para navegacion
			JTable users_table = new JTable(table_content,table_head);
			JScrollPane scrollPane = new JScrollPane(users_table);
			scrollPane.setLocation(30, 180);
			scrollPane.setSize(800,200);
			
			consult.add(scrollPane);
			
			JButton boton_volver = new JButton();
			 boton_volver.setText("volver");
			 boton_volver.setBackground(Color.black);
			 boton_volver.setForeground(Color.white);
			 boton_volver.setLocation(30, 400);
			 boton_volver.setSize(150,50);
			 boton_volver.setFont(new Font("Arial",Font.BOLD,18));
			 boton_volver.setFocusPainted(false);
			 boton_volver.addActionListener(e ->{
				 this.router("login");
			 });
			 consult.add(boton_volver);
	}
	
	public void how_create() {
		//Contenedor login
		 JPanel cont_create = new JPanel();
		 cont_create.setOpaque(true);
		 cont_create.setBackground(Color.white);
		 cont_create.setSize(1000,600);
		 cont_create.setLayout(null);
		 cont_create.setLocation(100,100);
		 cont_create.setVisible(true);
		 this.add(cont_create);
		 
		 //Creacion de etiquetas y campos para el login
		 JLabel title_create = new JLabel();
		 title_create.setText("Crear Usuario");
		 title_create.setSize(300,30);
		 title_create.setOpaque(true);
		 title_create.setLocation(350,50);
		 title_create.setBackground(Color.decode("#FAFAFA"));
		 title_create.setFont(new Font("Arial",Font.BOLD,20));
		 title_create.setHorizontalAlignment(JLabel.CENTER);
		 //title_username.setBorder(BorderFactory.createLineBorder(Color.BLACK,1,true));
		 cont_create.add(title_create);
		 
		 JPanel cont_texto = new JPanel();
		 cont_texto.setOpaque(true);
		 cont_texto.setBackground(Color.white);
		 cont_texto.setSize(600,300);
		 cont_texto.setLayout(null);
		 cont_texto.setLocation(200,100);
		 cont_texto.setBackground(Color.decode("#FAF5F5"));
		 cont_texto.setVisible(true);
		 cont_create.add(cont_texto);
		 
		 JTextArea text = new JTextArea();
		 text.setBounds(0,0,600,300);
		 text.setFont(new Font("Arial",Font.BOLD,12));
		 text.setText("Para crear un usuario se debe iniciar la aplicacion y hacer click en el botón de REGISTRARSE."
		 		+ "\n"
		 		+ "\nUna vez dentro del menu es necesario rellenar todos los campos solicitados en el menú."
		 		+ "\n"
		 		+ "\nUna vez rellenados los datos se debe hacer click en el botón de Crear cuenta."
		 		+ "\n"
		 		+ "\nNombre de usuario --> Nombre corto con el cual se identificara dentro del sistema."
		 		+ "\n"
		 		+ "\nBiografia --> Descripción del usuario con datos que se desean compartir publicamente"
		 		+ "\n"
		 		+ "\nCorreo Electronico--> Direccion de correo electronico asociado a la cuenta para recuperacion.."
		 		+ "\n"
		 		+ "\nPreferencias --> Seleccionar los datos preferentes para compartir publicamente."
		 		+ "\n"
		 		+ "\nTerminos y Condiciones --> Leer los TyC y aceptarlos en caso de estar de acuerdo o rechazarlos al no estar de acuerdo."
		 		+ "\n"
		 		+ "\nElija su localidad --> Elegir localidad la cual se mantendra privada."
		 		+ "\n"
		 		+ "\nEn caso de rellenar todos los campos de manera correcta se creara el usuario junto a las credenciales."
		 		+ "\n"
		 		+ "\nEn caso de que algun dato no cumpla con las caracteristicas necesarias el campo se marcara de rojo."
		 		+ "\n"
		 		+ "\nUna vez creado el usuario volvera a la pantalla de inicio de sesión y podra acceder al sistema con el usuario registrado");
		 text.setEditable(true);
		 cont_texto.add(text);
		 
			JButton boton_volver = new JButton();
			 boton_volver.setText("volver");
			 boton_volver.setBackground(Color.black);
			 boton_volver.setForeground(Color.white);
			 boton_volver.setLocation(200, 450);
			 boton_volver.setSize(150,50);
			 boton_volver.setFont(new Font("Arial",Font.BOLD,18));
			 boton_volver.setFocusPainted(false);
			 boton_volver.addActionListener(e ->{
				 this.router("login");
			 });
			 cont_create.add(boton_volver);
	}
	
	public void how_log() {
		//Contenedor login
		 JPanel cont_log = new JPanel();
		 cont_log.setOpaque(true);
		 cont_log.setBackground(Color.white);
		 cont_log.setSize(1000,600);
		 cont_log.setLayout(null);
		 cont_log.setLocation(100,100);
		 cont_log.setVisible(true);
		 this.add(cont_log);
		 
		 //Creacion de etiquetas y campos para el login
		 JLabel title_log = new JLabel();
		 title_log.setText("Acceder al sistema");
		 title_log.setSize(300,30);
		 title_log.setOpaque(true);
		 title_log.setLocation(350,50);
		 title_log.setBackground(Color.decode("#FAFAFA"));
		 title_log.setFont(new Font("Arial",Font.BOLD,20));
		 title_log.setHorizontalAlignment(JLabel.CENTER);
		 //title_username.setBorder(BorderFactory.createLineBorder(Color.BLACK,1,true));
		 cont_log.add(title_log);
		 
		 JPanel cont_texto = new JPanel();
		 cont_texto.setOpaque(true);
		 cont_texto.setBackground(Color.white);
		 cont_texto.setSize(600,300);
		 cont_texto.setLayout(null);
		 cont_texto.setLocation(200,100);
		 cont_texto.setBackground(Color.decode("#FAF5F5"));
		 cont_texto.setVisible(true);
		 cont_log.add(cont_texto);
		 
		 JTextArea text = new JTextArea();
		 text.setBounds(0,0,600,300);
		 text.setFont(new Font("Arial",Font.BOLD,12));
		 text.setText("Para Acceder al sistema se debe contar con un usuario creado."
		 		+ "\n"
		 		+ "\nEn caso de no contar con uno consultar guia ¿Como crear un usuario?."
		 		+ "\n"
		 		+ "\nUna vez contamos con un usuario registrado en el sistema deberemos inciar la aplicación."
		 		+ "\n"
		 		+ "\nSe deberan rellenar los datos solicitados para poder iniciar sesion y acceder al sistema"
		 		+ "\n"
		 		+ "\nUsuario --> Nombre corto con el cual se identifica dentro del sistema y registrado al crear el usuario."
		 		+ "\n"
		 		+ "\nContraseña --> Contraseña registrada al crear al usuario"
		 		+ "\n"
		 		+ "\nEn caso de no contar con la contraseña puede hacer click en el apartado ¿Has olvidado tu cointraseña?."
		 		+ "\n"
		 		+ "\nEn caso de que el usuario lo quiera puede marcar la opcion Recordarme para no iniciar sesion la proxima vez que ingrese al sistema."
		 		+ "\n"
		 		+ "\nUna vez rellenados los campos correctamente hacer click en el botón Acceder y ya habra ingresado en el sistema.");
		 text.setEditable(true);
		 cont_texto.add(text);
		 
			JButton boton_volver = new JButton();
			 boton_volver.setText("volver");
			 boton_volver.setBackground(Color.black);
			 boton_volver.setForeground(Color.white);
			 boton_volver.setLocation(200, 450);
			 boton_volver.setSize(150,50);
			 boton_volver.setFont(new Font("Arial",Font.BOLD,18));
			 boton_volver.setFocusPainted(false);
			 boton_volver.addActionListener(e ->{
				 this.router("login");
			 });
			 cont_log.add(boton_volver);
	}
	
	public void how_recover() {
		//Contenedor login
		 JPanel cont_recover = new JPanel();
		 cont_recover.setOpaque(true);
		 cont_recover.setBackground(Color.white);
		 cont_recover.setSize(1000,600);
		 cont_recover.setLayout(null);
		 cont_recover.setLocation(100,100);
		 cont_recover.setVisible(true);
		 this.add(cont_recover);
		 
		 //Creacion de etiquetas y campos para el login
		 JLabel title_recover = new JLabel();
		 title_recover.setText("Recuperar Contraseña");
		 title_recover.setSize(300,30);
		 title_recover.setOpaque(true);
		 title_recover.setLocation(350,50);
		 title_recover.setBackground(Color.decode("#FAFAFA"));
		 title_recover.setFont(new Font("Arial",Font.BOLD,20));
		 title_recover.setHorizontalAlignment(JLabel.CENTER);
		 //title_username.setBorder(BorderFactory.createLineBorder(Color.BLACK,1,true));
		 cont_recover.add(title_recover);
		 
		 JPanel cont_texto = new JPanel();
		 cont_texto.setOpaque(true);
		 cont_texto.setBackground(Color.white);
		 cont_texto.setSize(600,300);
		 cont_texto.setLayout(null);
		 cont_texto.setLocation(200,100);
		 cont_texto.setBackground(Color.decode("#FAF5F5"));
		 cont_texto.setVisible(true);
		 cont_recover.add(cont_texto);
		 
		 JTextArea text = new JTextArea();
		 text.setBounds(0,0,600,300);
		 text.setFont(new Font("Arial",Font.BOLD,12));
		 text.setText("En caso de olvidar su contraseña puede recuperarla facilmente. "
		 		+ "\n"
		 		+ "\nUna vez este en la pantalla de inicio de sesión debera hacer click en el boton:"
		 		+ "\n"
		 		+ "\n¿Has olvidado tu contraseña? Marcado de color azul en la parte inferior del inicio de sesión."
		 		+ "\n"
		 		+ "\nEl sistema le pedira como requisito el correo asociado a la cuenta."
		 		+ "\n"
		 		+ "\nUna vez rellenado el campo, hacer click en el boton Enviar."
		 		+ "\n"
		 		+ "\nLlegará un correo electronico al correo ingresado con las credenciales de la cuenta."
		 		+ "\n"
		 		+ "\nUna vez recuperada la contraseña debera volver al apartado de inicio de sesión.");
		 text.setEditable(true);
		 cont_texto.add(text);
		 
			JButton boton_volver = new JButton();
			 boton_volver.setText("volver");
			 boton_volver.setBackground(Color.black);
			 boton_volver.setForeground(Color.white);
			 boton_volver.setLocation(200, 450);
			 boton_volver.setSize(150,50);
			 boton_volver.setFont(new Font("Arial",Font.BOLD,18));
			 boton_volver.setFocusPainted(false);
			 boton_volver.addActionListener(e ->{
				 this.router("login");
			 });
			 cont_recover.add(boton_volver);
	}
	public void menu() {
		 //Creacion de barra de opciones y sus opciones dentro de la misma
		 JMenuBar barra = new JMenuBar();
		 
		 JMenu archivo = new JMenu("Archivo");
		 JMenu cuenta = new JMenu("Cuenta");
		 JMenu usuarios = new JMenu("Usuarios");
		 JMenu ayuda = new JMenu("Ayuda");
		 
		 JMenuItem open = new JMenuItem("Abrir");
		 JMenuItem close = new JMenuItem("Cerrar");
		 JMenuItem save = new JMenuItem("Guardar");
		 JMenuItem NewFile = new JMenuItem("Nuevo archivo");
		 
		 JMenuItem Login = new JMenuItem("Login");
		 Login.addActionListener(e-> {
			 this.router("login");
		 });
		 
		 JMenuItem registro = new JMenuItem("Registro");
		 registro.addActionListener(e-> {
			 this.router("registro");
		 });
		 
		 JMenuItem password_recovery = new JMenuItem("Recuperar Contraseña");
		 password_recovery.addActionListener(e -> {
			 this.router("password_recovery");
		 });
		 
		 JMenuItem alta = new JMenuItem("Alta");
		 alta.addActionListener(e -> {
			 this.router("alta");
		 });
		 
		 JMenuItem baja = new JMenuItem("Baja");
		 baja.addActionListener(e -> {
			 this.router("baja");
		 });
		 
		 JMenuItem consult = new JMenuItem("Consultar");
		 consult.addActionListener(e -> {
			 this.router("consult");
		 });

		 
		 JMenuItem crear_usuario = new JMenuItem("¿Cómo crear un usuario?");
		 crear_usuario.addActionListener(e -> {
			 this.router("how_create");
		 });
		 
		 JMenuItem acceder_sistema = new JMenuItem("¿Cómo acceder al sistema?");
		 acceder_sistema.addActionListener(e -> {
			 this.router("how_log");
		 });
		 
		 JMenuItem olv_cont = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		 olv_cont.addActionListener(e -> {
			 this.router("how_recover");
		 });
		 
		 archivo.add(open);
		 archivo.add(close);
		 archivo.add(save);
		 archivo.add(NewFile);
		 
		 cuenta.add(Login);
		 cuenta.add(registro);
		 cuenta.add(password_recovery);
		 
		 usuarios.add(alta);
		 usuarios.add(baja);
		 usuarios.add(consult);
		 
		 ayuda.add(crear_usuario);
		 ayuda.add(acceder_sistema);
		 ayuda.add(olv_cont);
		 
		 barra.add(archivo);
		 barra.add(cuenta);
		 barra.add(usuarios);
		 barra.add(ayuda);
		 JMenu subMenu = new JMenu("Otros");
		 archivo.addSeparator();
		 
		 JMenuItem newItem = new JMenuItem("SUBMENUUITEM");
		 JMenuItem newItem2 = new JMenuItem("SEGUNDOITEM");
		 
		 subMenu.add(newItem);
		 subMenu.add(newItem2);
		 archivo.add(subMenu);
		 
		 this.setJMenuBar(barra);
	}
	
	public void router(String target) {
		
		this.getContentPane().removeAll();
		
		if(target.equals("login")) {
			this.login();
		}
		else if(target.equals("registro")) {
			this.registro();
		}
		else if(target.equals("password_recovery")) {
			this.password_recovery();
		}
		else if(target.equals("alta")) {
			this.alta();
		}
		else if(target.equals("baja")) {
			this.baja();
		}
		else if(target.equals("consult")) {
			this.consult();
		}
		else if(target.equals("how_create")) {
			this.how_create();
		}
		else if(target.equals("how_log")) {
			this.how_log();
		}
		else if(target.equals("how_recover")) {
			this.how_recover();
		}
		
		
		this.setVisible(true);
		this.repaint();
		this.revalidate();
	}
	
	public void pintar() {
        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //Convertir a Graphics 2
                Graphics2D g2d = (Graphics2D) g;
                
                //Cuadrado para la tierra subterranea y color Cafe
                g2d.setColor(Color.decode("#A35400"));
                g2d.fillRect(0, 650, 1200, 150);
                
                //Arco para la montaña sobre la cual esta la casa
                g2d.setColor(Color.decode("#02B050"));
                g2d.fillArc(0, 350, 1200, 600, 0, 180);
               
                //Casa de paredes amarillas
                g2d.setColor(Color.decode("#FFF75C"));
                g2d.fillRect(450, 150, 300, 320);
                
                //Chimenea atras del techo
                g2d.setColor(Color.gray);
                g2d.fillRect(650, 20, 60, 100);
                g2d.fillRect(640, 20, 80, 20);
                
                //Poligono para el techo de la casa
                g2d.setColor(Color.decode("#FFF75C"));
                g2d.fillPolygon(new int[] {450,650,750}, new int[] {150,50,150}, 3);
                
                //Poligono para la parte roja del techo
                g2d.setColor(Color.red);
                g2d.fillPolygon(new int[] {450,550,650,550}, new int[] {150,50,50,150}, 4);
                
                //Lineas divisoria de la pared y techo
                g2d.setColor(Color.black);
                g2d.setStroke(new BasicStroke(3));
                g2d.drawLine(450, 150, 450, 470); //Linea izq puerta
                g2d.drawLine(550, 150, 550, 470); //Linea der puerta
                g2d.drawLine(750, 150, 750, 470); // Linea der de la casa
                g2d.drawLine(450, 150, 550, 150);//Linea inferior techo rojo casa
                g2d.drawLine(550, 150, 650,51);//Linea der del techo de la casa
                g2d.drawLine(450, 150, 550,50); //Linea delantera del techo de la casa
                g2d.drawLine(650, 50, 750, 150); //Linea trasera del techo de la casa
                g2d.drawLine(650, 50, 550, 50);//Linea de la parte superior del techo
                g2d.drawLine(450, 470, 750, 470);//Linea del suelo de la casa
                
                //Puerta con picaporte
                g2d.setColor(Color.decode("#FFF996"));
                g2d.fillRect(475, 350, 30, 118);
                g2d.setColor(Color.black);
                g2d.drawOval(490, 420, 8, 10);
                
                //Ventanas
                g2d.setColor(Color.white);//Fondo de las ventanas
                g2d.fillRect(460, 195, 60, 70); //V1
                g2d.fillRect(595, 195, 120,70); //V2
                g2d.fillRect(595, 345, 120,70); //V3
                g2d.setColor(Color.cyan);//Cristal de las ventanas
                g2d.fillRect(465, 200, 50, 60);
                g2d.fillRect(600, 200, 110, 60);
                g2d.fillRect(600, 350, 110, 60);
                g2d.setColor(Color.white); //cuadriculas de las ventanas
                g2d.drawLine(465,230,515,230 );
                g2d.drawLine(488,200,488,260 );
                g2d.drawLine(600,230,710,230 );
                g2d.drawLine(655,200,655,260 );
                g2d.drawLine(600,380,710,380 );
                g2d.drawLine(655,350,655,410 );
                
                //Cercos
                g2d.setColor(Color.white);//Ciclo para imprimir las cercas
                for(int i = 1; i<= 12;) { //Numero de cercas
                	g2d.fillPolygon(new int[] {(i*100),(i*100)+15,(i*100)+30}, new int[] {450,430,450}, 3); //Posicion de los triangulos
                	g2d.fillRect((i*100), 450, 30, 80);//Posicion de los rectangulos
                	if(i<11) {//Condicion para imprimir las uniones de las cercas
                		g2d.fillRect((i*100),500,100,20);
                		g2d.fillRect((i*100),470,100,20); 
                	}
                	i++;
                }
                
                //Decoraciones
                g2d.setColor(Color.yellow);
                g2d.fillOval(900, 110, 130, 130); // Sol
                
                g2d.setColor(Color.white);
                for(int i = 1; i<=3; i++) { //Ciclo para dibujar nubes
                		g2d.fillOval(i*100, 80, 150, 100);                		
                }
                
                for(int i = 8; i<=10; i++) {
            		g2d.fillOval(i*100, 180, 150, 100);                		
                }
                
                BufferedImage image;
				try {
					image = ImageIO.read(new File("src/recursos/familia.png"));
					g2d.drawImage(image, 50,500, null);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}   
            }
        };
        
        pane.setLocation(0,0);
        pane.setSize(1200,800);
        pane.setBackground(Color.decode("#09EAF6"));
        this.add(pane);
	}
	
	public void MarioBros() {
        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //Convertir a Graphics 2
                Graphics2D g2d = (Graphics2D) g;
                
                //guia del centro del espacio
                //g2d.setColor(Color.white);
                //g2d.drawLine(0, 248, 1200, 248);
                
                //Cuadrado para la tierra subterranea y color Cafe
                g2d.setColor(Color.decode("#F09469"));
                g2d.fillRect(0, 500, 1200, 300);
                // contorno del suelo
                g2d.setColor(Color.black);
                g2d.fillRect(0, 495, 1200, 60);
                //Suelo
                g2d.setColor(Color.decode("#F8C7C3"));
                g2d.fillRect(0, 500, 1200, 50);
                //ciclo para el diseño del suelo
                g2d.setStroke(new BasicStroke(5));
                for(int i = 0; i<1200;) {
                	if(i%2==0) {
                		g2d.setColor(Color.black);
                		g2d.drawLine(i, 555, i+38, 850);
                	}else {
                		g2d.setColor(Color.decode("000000"));
                		g2d.drawLine(i, 555, i+38, 850);
                	}
                	i+=50;
                }
                //Conjunto de figuras cuadradas
                //Figura1 azul
                g2d.setColor(Color.black);
                g2d.fillRect(425, 250, 200, 245);
                g2d.setColor(Color.decode("#84BFFF"));
                g2d.fillRect(425, 250,175, 245);
                g2d.setColor(Color.black);
                g2d.drawRect(425, 250,200, 245);
                //Figura2 crema
                g2d.setColor(Color.black);
                g2d.fillRect(325, 308, 150, 187);
                g2d.setColor(Color.decode("#FFC3B8"));
                g2d.fillRect(290, 310, 165, 185);
                g2d.setColor(Color.black);
                g2d.drawRect(290, 310, 165, 185);
                //Figura3 verde
                g2d.setColor(Color.black);
                g2d.fillRect(1000, 308, 250, 187);
                g2d.setColor(Color.decode("#51D96B"));
                g2d.fillRect(1000, 308, 165, 187);
                g2d.setColor(Color.black);
                g2d.drawRect(1000, 308, 250, 187);
                
                //Figura4 Cuadro powerUp
                g2d.setColor(Color.decode("#FF915C"));
                g2d.fillRect(100, 240, 65, 50);
                g2d.setColor(Color.black);
                g2d.drawRect(100, 240, 65, 50);
                
                //Figura5 cuadros de powerUp
                g2d.setColor(Color.decode("#FF915C"));
                g2d.fillRect(170, 100, 130, 50);
                g2d.setColor(Color.black);
                g2d.drawRect(170, 100, 130, 50);
                g2d.drawLine(235, 100, 235, 150);
                
                //Figura6 Cuadro powerUp
                g2d.setColor(Color.decode("#FF915C"));
                g2d.fillRect(1100, 150, 65, 50);
                g2d.setColor(Color.black);
                g2d.drawRect(1100, 150, 65, 50);
                
                //Tuberia
                g2d.setColor(Color.decode("#188810"));
                g2d.fillRect(765, 308, 130, 187);
                g2d.setColor(Color.black);
                g2d.drawRect(765, 308, 130, 187);
                g2d.setColor(Color.decode("#188810"));
                g2d.fillRect(750, 308, 160, 50);
                g2d.setColor(Color.black);
                g2d.drawRect(750, 308, 160, 50);
                
                //Decoraciones
                //Signos de interrogacion
                Font fuente = new Font("Pixelify Sans",Font.BOLD,40);
                g2d.setColor(Color.decode("#F6CCCA"));
                g2d.setFont(fuente);
                g2d.drawString("?",190, 140);
                g2d.drawString("?",255, 140);
                g2d.drawString("?",1120, 190);
                g2d.drawString("?",120, 280);
                //Ajustar ancho de dibujado
                g2d.setStroke(new BasicStroke(3));
                //Rectangulos y Cuadrados
                g2d.setColor(Color.decode("#148FE2"));
                g2d.fillRect(590, 253, 10, 240);//Sombra Azul
                g2d.setColor(Color.decode("#EA956E"));
                g2d.fillRect(442, 313, 10, 180);//Sombra Crema
                //Tornillos
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillOval(300, 318, 15, 15);//Crema
                g2d.fillOval(300, 470, 15, 15);//Crema
                g2d.fillOval(430, 318, 15, 15);//Crema
                g2d.fillOval(430, 470, 15, 15);//Crema
                g2d.fillOval(440, 265, 15, 15);//Azul
                g2d.fillOval(575, 265, 15, 15);//Azul
                g2d.fillOval(575, 470, 15, 15);//Azul
                g2d.fillOval(1010, 318, 15, 15);//Verde
                g2d.fillOval(1010, 470, 15, 15);//Verde
                g2d.fillOval(1140, 318, 15, 15);//Verde
                g2d.fillOval(1140, 470, 15, 15);//Verde
                g2d.setColor(Color.black);
                g2d.drawOval(300,318, 15, 15);//Crema
                g2d.drawOval(300,470, 15, 15);//Crema
                g2d.drawOval(430,318, 15, 15);//Crema
                g2d.drawOval(430,470, 15, 15);//Crema
                g2d.drawOval(440, 265, 15, 15);//Azul
                g2d.drawOval(575, 265, 15, 15);//Azul
                g2d.drawOval(575, 470, 15, 15);//Azul
                g2d.drawOval(1010, 318, 15, 15);//Verde
                g2d.drawOval(1010, 470, 15, 15);//Verde
                g2d.drawOval(1140, 318, 15, 15);//Verde
                g2d.drawOval(1140, 470, 15, 15);//Verde
                //Tuberia
                g2d.setColor(Color.decode("#45DE632")); 
                g2d.fillRect(765, 310, 18, 46);//Tuberia Superior
                g2d.fillRect(785, 310, 30, 46);//Tuberia Superior
                g2d.fillRect(818, 310, 7, 46);//Tuberia Superior
                g2d.fillRect(826, 310, 1, 46);//Tuberia Superior
                g2d.fillRect(828, 310, 1, 46);//Tuberia Superior
                g2d.fillRect(840, 310, 4, 46);//Tuberia Superior
                g2d.fillRect(770, 361, 18, 132);//Tuberia inferior
                g2d.fillRect(790, 361, 30, 132);//Tuberia inferior
                g2d.fillRect(822, 361, 7, 132);//Tuberia inferior
                g2d.fillRect(831, 361, 1, 132);//Tuberia inferior
                g2d.fillRect(833, 361, 1, 132);//Tuberia inferior
                g2d.fillRect(835, 361, 4, 132);//Tuberia inferior
                g2d.setColor(Color.black);
                g2d.fillRect(846, 310, 4, 46);//Tuberia Superior
                g2d.fillRect(852, 310, 2, 46);//Tuberia Superior
                g2d.fillRect(856, 310, 16,46);//Tuberia Superior
                g2d.fillRect(876, 310, 8, 46);//Tuberia Superior
                g2d.fillRect(890, 310, 5, 46);//Tuberia Superior
                g2d.fillRect(898, 310, 3, 46);//Tuberia Superior
                g2d.fillRect(846, 361, 4, 132);//Tuberia Inferior
                g2d.fillRect(852, 361, 2, 132);//Tuberia Inferior
                g2d.fillRect(856, 361, 16,132);//Tuberia Inferior
                g2d.fillRect(876, 361, 8, 132);//Tuberia Inferior
                g2d.fillRect(890, 361, 5, 132);//Tuberia Inferior
                //MarioBros.png
                BufferedImage image;
				try {
					image = ImageIO.read(new File("src/recursos/plantaMario.png"));
					g2d.drawImage(image, 760,180, null);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//Dibujo de Mario Bros
                BufferedImage image2;
				try {
					image = ImageIO.read(new File("src/recursos/Mario.png"));
					g2d.drawImage(image, 550,365, null);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
            }
        };
        
        pane.setLocation(0,0);
        pane.setSize(1200,800);
        pane.setBackground(Color.decode("#B2EEFE"));
        this.add(pane);
	}
	
	
}
