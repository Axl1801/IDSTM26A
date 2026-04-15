package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class VentanaTres extends JFrame{
	public VentanaTres() {
		 this.setSize(200,300);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setLocationRelativeTo(null);
		 this.setTitle("Gato");
		 this.setMinimumSize(new Dimension(300,400));
		 this.setMaximumSize(new Dimension(500,600));
		 this.getContentPane().setBackground(Color.decode("#00FFC4"));
		 this.setLayout(new BorderLayout());
		 
		 this.tablero();
		 this.score();
		 this.reiniciar();
		 this.setVisible(true);
	}
	
	public void tablero() {
		JPanel tablero = new JPanel();
		tablero.setLayout(new GridLayout(3,3,10,10));
		//tablero.setPreferredSize(new Dimension(400,500));
		//tablero.setLocation(50,50);
		tablero.setBackground(Color.white);
		JButton boton1 = new JButton();
		boton1.setFocusPainted(false);
		boton1.setBackground(Color.BLACK);
		tablero.add(boton1);
		JButton boton2 = new JButton();
		boton2.setFocusPainted(false);
		boton2.setBackground(Color.BLACK);
		tablero.add(boton2);
		JButton boton3 = new JButton();
		boton3.setBackground(Color.BLACK);
		boton3.setFocusPainted(false);
		tablero.add(boton3);
		JButton boton4 = new JButton();
		boton4.setFocusPainted(false);
		boton4.setBackground(Color.BLACK);
		tablero.add(boton4);
		JButton boton5 = new JButton();
		boton5.setFocusPainted(false);
		boton5.setBackground(Color.BLACK);
		tablero.add(boton5);
		JButton boton6 = new JButton();
		boton6.setFocusPainted(false);
		boton6.setBackground(Color.BLACK);
		tablero.add(boton6);
		JButton boton7 = new JButton();
		boton7.setFocusPainted(false);
		boton7.setBackground(Color.BLACK);
		tablero.add(boton7);
		JButton boton8 = new JButton();
		boton8.setFocusPainted(false);
		boton8.setBackground(Color.BLACK);
		tablero.add(boton8);
		JButton boton9 = new JButton();
		boton9.setFocusPainted(false);
		boton9.setBackground(Color.BLACK);
		tablero.add(boton9);
		tablero.setVisible(true);
		this.add(tablero, BorderLayout.CENTER);
	}
	
	public void score() {
		JPanel score = new JPanel();
		score.setLayout(new BorderLayout());
		
		JLabel time = new JLabel("00:00");
		time.setBackground(Color.BLACK);
		time.setForeground(Color.white);
		time.setOpaque(true);
		time.setHorizontalAlignment(SwingConstants.CENTER);
		score.add(time, BorderLayout.NORTH);
		
		JPanel x = new JPanel();
		x.setLayout(new GridLayout(0,2,0,0));
		
		JLabel scoreX = new JLabel("X : 0");
		scoreX.setBackground(Color.BLACK);
		scoreX.setForeground(Color.white);
		scoreX.setOpaque(true);
		scoreX.setHorizontalAlignment(SwingConstants.CENTER);
		x.add(scoreX);
		JLabel scoreO = new JLabel("O : 0");
		scoreO.setBackground(Color.BLACK);
		scoreO.setForeground(Color.white);
		scoreO.setOpaque(true);
		scoreO.setHorizontalAlignment(SwingConstants.CENTER);
		x.add(scoreO);
	
		score.add(x, BorderLayout.SOUTH);
		
		score.setVisible(true);
		this.add(score, BorderLayout.NORTH);
	}
	
	public void reiniciar() {
		JPanel reinicio = new JPanel();
		
		JButton reinicio_boton = new JButton("Reiniciar");
		reinicio_boton.setFocusPainted(false);
		reinicio_boton.setBackground(Color.BLACK);
		reinicio_boton.setForeground(Color.white);
		
		reinicio.add(reinicio_boton);
		
		this.add(reinicio_boton,BorderLayout.SOUTH);
		
	}
}	
