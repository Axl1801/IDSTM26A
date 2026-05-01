package Views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Controllers.HomeController;
import Models.AuthModel;

public class AuthView {
	
	private AuthModel model;
	public AuthView() {
		
		model = new AuthModel();
		
	}
	
	public void loginView() {
		//Creacion de ventana y ajuste de sus parametros
		JFrame ventana = new JFrame();
		
		ventana.setSize(1200,800);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setTitle("Login");
		ventana.setMinimumSize(new Dimension(200,200));
		ventana.setMaximumSize(new Dimension(1200,800));
		ventana.setBackground(Color.black);
		ventana.getContentPane().setBackground(Color.black);
		ventana.setLayout(null);
		
		 //Contenedor login
		 JPanel contenedor = new JPanel();
		 contenedor.setOpaque(true);
		 contenedor.setBackground(Color.gray);
		 contenedor.setSize(1000,600);
		 contenedor.setLayout(null);
		 contenedor.setLocation(100,100);
		 contenedor.setVisible(true);
		 ventana.add(contenedor);
		 
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
				
				String passText = new String(password.getPassword());
				Boolean flag1 = false, flag2 = false;
				
				if(passText.equals("") ) {
					password.setBorder(BorderFactory.createLineBorder(Color.red,2,true));
					password.setBackground(Color.decode("#FFCFCF"));
					JOptionPane.showMessageDialog(null, "Datos Incorrectos,"
							+ " Porfavor Verifique sus datos o regisrtrese en el sistema");
				}
				else {
					password.setBorder(BorderFactory.createLineBorder(Color.green,2,true));
					password.setBackground(Color.decode("#D1FFCF"));
					flag1 = true;
				}
				
				if(username.getText().equals("") ) {
					username.setBorder(BorderFactory.createLineBorder(Color.red,2,true));
					username.setBackground(Color.decode("#FFCFCF"));
					JOptionPane.showMessageDialog(null, "Datos Incorrectos,"
							+ " Porfavor Verifique sus datos o regisrtrese en el sistema");
				}
				else {
					username.setBorder(BorderFactory.createLineBorder(Color.green,2,true));
					username.setBackground(Color.decode("#D1FFCF"));
					flag2 = true;
				}
				
				if(flag1 && flag2) {
					if(model.login(username.getText(), passText)){
						JOptionPane.showMessageDialog(null, "Bienvenido.");
						
						ventana.dispose();
						
						HomeController hm = new HomeController();
						hm.home();
					}else {
						JOptionPane.showMessageDialog(null, "Error al acceder","verifique su información",JOptionPane.WARNING_MESSAGE);
					}
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
			 ventana.dispose();
			 showRegister();
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
		 ventana.setVisible(true);
	}

	public void showRegister() {
		
		//Creacion de ventana y ajuste de sus parametros
		JFrame ventana = new JFrame();
		
		ventana.setSize(1200,800);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setTitle("Login");
		ventana.setMinimumSize(new Dimension(200,200));
		ventana.setMaximumSize(new Dimension(1200,800));
		ventana.setBackground(Color.black);
		ventana.getContentPane().setBackground(Color.black);
		ventana.setLayout(null);
		
		//Contenedor registro
		JPanel register_container = new JPanel();
		register_container.setSize(500,500);
		register_container.setLocation(350, 100);
		register_container.setOpaque(true);
		register_container.setBackground(Color.decode("#FFFFFF"));
		register_container.setLayout(null);
		ventana.add(register_container);
		 
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
			 ventana.dispose();
			 loginView();
		 });
		 //Repintado de los elemetos
		 register_container.repaint();
		 ventana.setVisible(true);
	}
}
