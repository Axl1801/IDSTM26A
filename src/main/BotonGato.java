package main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class BotonGato extends JButton{
	
	public BotonGato() {
		
		this.setBorderPainted(false);
        this.setFocusPainted(false);
        this.setForeground(Color.WHITE);
        this.setBackground(Color.BLACK);
        this.setFont(new Font("Arial", Font.BOLD, 60));
        this.setFocusPainted(false);
        this.setBorderPainted(false);
	}

	
}
