package Views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Controllers.UserController;

public class HomeView {
	public HomeView() {
		
	}
	
	public void home() {
		JFrame ventana = new JFrame();
		
		ventana.setSize(1000, 640);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setMinimumSize(new Dimension(200,200));
		ventana.setMaximumSize(new Dimension(1200,800));
		ventana.setTitle("Hola"); 
		ventana.getContentPane().setBackground(Color.decode("#C8DEBD"));
		ventana.setLayout(null); 
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255)); 
		panel.setLocation(0, 0);
		panel.setLayout(null);
		panel.setSize(1000, 600);  
		ventana.add(panel);
		
		
		JButton users = new JButton();
		users.setText("ir a Usuarios");
		users.setBackground(Color.black);
		users.setForeground(Color.white);
		users.setLocation(400, 280);
		users.setSize(200,50);
		users.setFont(new Font("Arial",Font.BOLD,18));
		users.setFocusPainted(false);
		users.addActionListener(e->{
			UserController uc = new UserController();
			uc.showUser();
			ventana.dispose();
		});
		panel.add(users);
		
		ventana.setVisible(true);
	}
}
