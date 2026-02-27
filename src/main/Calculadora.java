package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculadora extends JFrame{
	public Calculadora() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setTitle("Calculadora");
		 this.getContentPane().setBackground(Color.BLACK);
		 this.setLayout(null);
		 this.setSize(400,500);
		 this.setLocationRelativeTo(null);

		 this.interfaz();
		 
		 this.setVisible(true);
	}
	
	public void interfaz() {
		JPanel contenedor = new JPanel();
		 contenedor.setSize(400,500);
		 contenedor.setLocation(0,0);
		 contenedor.setLayout(null);
		 contenedor.setBackground(Color.BLACK);
		 contenedor.setOpaque(true);
		 contenedor.setLayout(null);
		 contenedor.setVisible(true);
		 this.add(contenedor);
		 
		 JLabel console = new JLabel();
		 console.setText(" 180105");
		 console.setSize(300,50);
		 console.setLocation(50,20);
		 console.setOpaque(true);
		 console.setBackground(Color.BLACK);
		 console.setFont(new Font("Arial",Font.BOLD,15));
		 console.setForeground(Color.WHITE);
		 console.setHorizontalAlignment(JLabel.CENTER);
		 console.setBorder(BorderFactory.createLineBorder(Color.white,1,true));
		 contenedor.add(console);
		 
		JButton boton7 = new JButton("7");
		boton7.setBounds(50,80,60,60);
		boton7.setBackground(Color.BLACK);
		boton7.setForeground(Color.white);
		boton7.setFocusPainted(false);
		boton7.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton7);
		
		JButton boton8 = new JButton("8");
		boton8.setBounds(120,80,60,60);
		boton8.setBackground(Color.BLACK);
		boton8.setForeground(Color.white);
		boton8.setFocusPainted(false);
		boton8.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton8);
		
		JButton boton9 = new JButton("9");
		boton9.setBounds(190,80,60,60);
		boton9.setBackground(Color.BLACK);
		boton9.setForeground(Color.white);
		boton9.setFocusPainted(false);
		boton9.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton9);
		
		JButton botonDiv = new JButton("/");
		botonDiv.setBounds(260,80,90,60);
		botonDiv.setBackground(Color.decode("#008A39"));
		botonDiv.setForeground(Color.white);
		botonDiv.setFocusPainted(false);
		botonDiv.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(botonDiv);
		
		JButton boton4 = new JButton("4");
		boton4.setBounds(50,150,60,60);
		boton4.setBackground(Color.BLACK);
		boton4.setForeground(Color.white);
		boton4.setFocusPainted(false);
		boton4.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton4);
		
		JButton boton5 = new JButton("5");
		boton5.setBounds(120,150,60,60);
		boton5.setBackground(Color.BLACK);
		boton5.setForeground(Color.white);
		boton5.setFocusPainted(false);
		boton5.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton5);
		
		JButton boton6 = new JButton("6");
		boton6.setBounds(190,150,60,60);
		boton6.setBackground(Color.BLACK);
		boton6.setForeground(Color.white);
		boton6.setFocusPainted(false);
		boton6.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton6);
		
		JButton botonMult = new JButton("x");
		botonMult.setBounds(260,150,90,60);
		botonMult.setBackground(Color.decode("#008A39"));
		botonMult.setForeground(Color.white);
		botonMult.setFocusPainted(false);
		botonMult.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(botonMult);
		
		JButton boton1 = new JButton("1");
		boton1.setBounds(50,220,60,60);
		boton1.setBackground(Color.BLACK);
		boton1.setForeground(Color.white);
		boton1.setFocusPainted(false);
		boton1.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton1);
		
		JButton boton2 = new JButton("2");
		boton2.setBounds(120,220,60,60);
		boton2.setBackground(Color.BLACK);
		boton2.setForeground(Color.white);
		boton2.setFocusPainted(false);
		boton2.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton2);
		
		JButton boton3 = new JButton("3");
		boton3.setBounds(190,220,60,60);
		boton3.setBackground(Color.BLACK);
		boton3.setForeground(Color.white);
		boton3.setFocusPainted(false);
		boton3.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton3);
		
		JButton botonRes = new JButton("-");
		botonRes.setBounds(260,220,90,60);
		botonRes.setBackground(Color.decode("#008A39"));
		botonRes.setForeground(Color.white);
		botonRes.setFocusPainted(false);
		botonRes.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(botonRes);
		
		JButton boton0 = new JButton("0");
		boton0.setBounds(50,290,60,60);
		boton0.setBackground(Color.BLACK);
		boton0.setForeground(Color.white);
		boton0.setFocusPainted(false);
		boton0.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton0);
		
		JButton botonPunto = new JButton(".");
		botonPunto.setBounds(120,290,60,60);
		botonPunto.setBackground(Color.BLACK);
		botonPunto.setForeground(Color.white);
		botonPunto.setFocusPainted(false);
		botonPunto.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(botonPunto);
		
		JButton botonParentesis = new JButton("( )");
		botonParentesis.setBounds(190,290,60,60);
		botonParentesis.setBackground(Color.BLACK);
		botonParentesis.setForeground(Color.white);
		botonParentesis.setFocusPainted(false);
		botonParentesis.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(botonParentesis);

		JButton botonSuma = new JButton("+");
		botonSuma.setBounds(260,290,90,60);
		botonSuma.setBackground(Color.decode("#008A39"));
		botonSuma.setForeground(Color.white);
		botonSuma.setFocusPainted(false);
		botonSuma.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(botonSuma);
		
		JButton botonANS2 = new JButton("ANS");
		botonANS2.setBounds(50,360,60,60);
		botonANS2.setBackground(Color.decode("#000CAB"));
		botonANS2.setForeground(Color.white);
		botonANS2.setFocusPainted(false);
		botonANS2.setFont(new Font("Arial",Font.BOLD,10));
		contenedor.add(botonANS2);
		
		JButton botonDEL = new JButton("DEL");
		botonDEL.setBounds(120,360,60,60);
		botonDEL.setBackground(Color.decode("#000CAB"));
		botonDEL.setForeground(Color.white);
		botonDEL.setFocusPainted(false);
		botonDEL.setFont(new Font("Arial",Font.BOLD,10));
		contenedor.add(botonDEL);
		
		JButton botonAC2 = new JButton("AC");
		botonAC2.setBounds(190,360,60,60);
		botonAC2.setBackground(Color.decode("#000CAB"));
		botonAC2.setForeground(Color.white);
		botonAC2.setFocusPainted(false);
		botonAC2.setFont(new Font("Arial",Font.BOLD,10));
		contenedor.add(botonAC2);
		
		JButton botonIgual = new JButton("=");
		botonIgual.setBounds(260,360,90,60);
		botonIgual.setBackground(Color.decode("#AB0000"));
		botonIgual.setForeground(Color.white);
		botonIgual.setFocusPainted(false);
		botonIgual.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(botonIgual);
	}
	
	
}
