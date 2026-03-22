package main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
		 
		 //Creacion de barra de opciones y sus opciones dentro de la misma
		 JMenuBar barra = new JMenuBar();
		 
		 JMenu archivo = new JMenu("Archivo");
		 JMenu cuenta = new JMenu("Cuenta");
		 
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
		 archivo.add(open);
		 archivo.add(close);
		 archivo.add(save);
		 archivo.add(NewFile);
		 
		 cuenta.add(Login);
		 cuenta.add(registro);
		 
		 barra.add(archivo);
		 barra.add(cuenta);
		 JMenu subMenu = new JMenu("Otros");
		 archivo.addSeparator();
		 
		 JMenuItem newItem = new JMenuItem("SUBMENUUITEM");
		 JMenuItem newItem2 = new JMenuItem("SEGUNDOITEM");
		 
		 subMenu.add(newItem);
		 subMenu.add(newItem2);
		 archivo.add(subMenu);
		 
		 this.setJMenuBar(barra);
		 
		 //Invocacion de las diferentes pantallas.
		 //this.login();
		 //this.registro();
		 //this.users();
		 //this.pintar();
		 this.MarioBros();
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
						|| !real_pass.equals(real_pass)) {
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
		 register_container.setLocation(650, 25);
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
		 bio_text.setBounds(100,140,300,120);
		 bio_text.setBackground(Color.decode("#D9D9D9"));
		 register_container.add(bio_text);
		 
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
		JLabel user_title = new JLabel("USERS");
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
	
	public void router(String target) {
		
		this.getContentPane().removeAll();
		
		if(target.equals("login")) {
			this.login();
		}
		if(target.equals("registro")) {
			this.registro();
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
