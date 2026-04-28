package Views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AuthView {
	public AuthView() {
		
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
			 ventana.dispose();
			 //ventana.register();
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
	
}
