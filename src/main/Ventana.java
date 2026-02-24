package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	public Ventana() {
		 this.setVisible(true);
		 this.setSize(1200,600);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setLocationRelativeTo(null);
		 this.setTitle("Sup Bro");
		 this.setMinimumSize(new Dimension(200,200));
		 this.setMaximumSize(new Dimension(800,800));
		 this.setBackground(Color.black);
		 this.setLayout(null);
		 
		 //Contenedor login
		 JPanel contenedor = new JPanel();
		 contenedor.setOpaque(true);
		 contenedor.setBackground(Color.white);
		 contenedor.setSize(500,500);
		 contenedor.setLayout(null);
		 contenedor.setLocation(0,50);
		 contenedor.setVisible(true);
		 this.add(contenedor);
		 
		 JLabel title_login = new JLabel();
		 title_login.setText("¡¡¡Bienvenido!!!");
		 title_login.setSize(500,30);
		 title_login.setOpaque(true);
		 title_login.setLocation(0,50);
		 title_login.setBackground(Color.BLACK);
		 title_login.setFont(new Font("Arial",Font.BOLD,22));
		 title_login.setForeground(Color.WHITE);
		 title_login.setHorizontalAlignment(JLabel.CENTER);
		 contenedor.add(title_login);
		 
		 JLabel title_username = new JLabel();
		 title_username.setText("Usuario");
		 title_username.setSize(50,10);
		 title_username.setOpaque(true);
		 title_username.setLocation(100,115);
		 title_username.setBackground(Color.white);
		 title_username.setFont(new Font("Arial",Font.BOLD,12));
		 title_username.setHorizontalAlignment(JLabel.CENTER);
		 contenedor.add(title_username);
		 
		 JTextField username = new JTextField();
		 username.setSize(300,30);
		 username.setLocation(100,130);
		 username.setFont(new Font("Arial",Font.BOLD,22));
		 contenedor.add(username);
		 
		 JLabel title_password = new JLabel();
		 title_password.setText("Contraseña");
		 title_password.setSize(80,10);
		 title_password.setOpaque(true);
		 title_password.setLocation(100,180);
		 title_password.setBackground(Color.white);
		 title_password.setFont(new Font("Arial",Font.BOLD,12));
		 title_password.setHorizontalAlignment(JLabel.CENTER);
		 contenedor.add(title_password);
		 
		 
		 JPasswordField password = new JPasswordField();
		 password.setSize(300,30);
		 password.setLocation(100, 195);
		 password.setFont(new Font("Arial",Font.BOLD,22));
		 contenedor.add(password);
		 
		 JLabel title_ForgotPassword= new JLabel();
		 title_ForgotPassword.setText("¿Has olvidado tu contraseña?");
		 title_ForgotPassword.setSize(180,15);
		 title_ForgotPassword.setOpaque(true);
		 title_ForgotPassword.setLocation(220,230);
		 title_ForgotPassword.setBackground(Color.white);
		 title_ForgotPassword.setFont(new Font("Arial",Font.BOLD,12));
		 title_ForgotPassword.setForeground(Color.blue);
		 title_ForgotPassword.setHorizontalAlignment(JLabel.CENTER);
		 contenedor.add(title_ForgotPassword);
		 
		 JCheckBox remember = new JCheckBox();
		 remember.setSize(120,15);
		 remember.setText("Recordarme");
		 remember.setBackground(Color.white);
		 remember.setOpaque(true);
		 remember.setLocation(100, 230);
		 remember.setFont(new Font("Arial",Font.BOLD,12));
		 //remember.setHorizontalTextPosition(JLabel.CENTER);
		 contenedor.add(remember);
		 
		 JButton acceder = new JButton();
		 acceder.setText("Acceder");
		 acceder.setLocation(190, 350);
		 acceder.setSize(120,50);
		 acceder.setFont(new Font("Arial",Font.BOLD,18));
		 contenedor.add(acceder);
		 
		 contenedor.repaint();
		 contenedor.revalidate();
		 
		 //Contenedor registro
		 JPanel register_container = new JPanel();
		 register_container.setSize(500,500);
		 register_container.setLocation(650, 50);
		 register_container.setOpaque(true);
		 register_container.setBackground(Color.decode("#FFFFFF"));
		 register_container.setLayout(null);
		 this.add(register_container);
		 
		 JLabel bio_tag = new JLabel("Biografía");
		 bio_tag.setBounds(120,100,250,40);
		 bio_tag.setBackground(Color.black);
		 bio_tag.setOpaque(true);
		 bio_tag.setHorizontalAlignment(JLabel.CENTER);
		 bio_tag.setFont(new Font("Arial",Font.BOLD,22));
		 bio_tag.setForeground(Color.white);
		 register_container.add(bio_tag);
		 
		 JTextArea bio_text = new JTextArea();
		 bio_text.setBounds(120,160,250,120);
		 bio_text.setBackground(Color.gray);
		 register_container.add(bio_text);
		 
		 JCheckBox sweet_option = new JCheckBox("Dulce");
		 sweet_option.setBounds(120,330,100,50);
		 register_container.add(sweet_option);
		
		 
		 JCheckBox salty_option = new JCheckBox("Salado");
		 salty_option.setBounds(220,330,100,50);
		 register_container.add(salty_option);
		 
		 JCheckBox healthy_option = new JCheckBox("Saludable");
		 healthy_option.setBounds(320,330,100,50);
		 healthy_option.setBorder(BorderFactory.createLineBorder(Color.BLACK,1,true));
		 healthy_option.setBorderPainted(true);
		 register_container.add(healthy_option);
		 
		 JRadioButton acceptance_terms = new JRadioButton("Acepto los terminos");
		 acceptance_terms.setBounds(120, 400, 150, 50);
		 register_container.add(acceptance_terms);
		 
		 JRadioButton reject_terms = new JRadioButton("Rechazo los terminos");
		 reject_terms.setBounds(290, 400, 150, 50);
		 register_container.add(reject_terms);
		 
		 ButtonGroup terms = new ButtonGroup();
		 terms.add(reject_terms);
		 terms.add(acceptance_terms);
		 
		 String[] colonias = {"Camino York", "La fuente", "villas del encanto"};
		 JComboBox list = new JComboBox(colonias);
		 list.setBounds(50, 20, 200, 60);
		 register_container.add(list);
		 
		 register_container.repaint();
	}
}
