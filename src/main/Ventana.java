package main;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Ventana extends JFrame{
	public Ventana() {
		 JFrame ventana = new JFrame();
		 ventana.setVisible(true);
		 ventana.setSize(500, 500);
		 ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 ventana.setLocationRelativeTo(null);
		 ventana.setTitle("Sup Bro");
		 ventana.setMinimumSize(new Dimension(200,200));
		 ventana.setMaximumSize(new Dimension(800,800));
		 ventana.setBackground(Color.black);
	}
}
