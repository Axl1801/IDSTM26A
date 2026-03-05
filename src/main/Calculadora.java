package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame{
	public Calculadora() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setTitle("Calculadora");
		 this.getContentPane().setBackground(Color.BLACK);
		 this.setLayout(null);
		 this.setSize(500,600);
		 this.setLocationRelativeTo(null);
		 
		 //Invocar la ventana de la calculadora
		 //this.calculadoraUno();
		 this.calculadoraIntereses();

		 this.setVisible(true);
	}
	
	public void calculadoraUno() {
		//Genera el contenedor para los elementos
		JPanel contenedor = new JPanel();
		 contenedor.setSize(400,500);
		 contenedor.setLocation(0,0);
		 contenedor.setLayout(null);
		 contenedor.setBackground(Color.BLACK);
		 contenedor.setOpaque(true);
		 contenedor.setLayout(null);
		 contenedor.setVisible(true);
		 this.add(contenedor);
		 
		 //Etiqueta de la consola para simular la pantalla
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
		 
		 //Botones
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
	
	public void calculadoraDos()
	{
		//Pantalla de la calculadora, JLabel asignado en NORTH
		JPanel test_panel = new JPanel();
		test_panel.setSize(485, 565);
		test_panel.setLocation(0, 0);
		test_panel.setBackground(Color.decode("#1E293B"));
		test_panel.setLayout(new BorderLayout(0,0));
		test_panel.setVisible(true);
		this.add(test_panel);
		
		JLabel users_title = new JLabel("1728.00"); 
		users_title.setFont(new Font("Arial",Font.BOLD,30));
		users_title.setForeground(Color.decode("#45BA63"));
		users_title.setHorizontalAlignment(JLabel.CENTER);
		users_title.setPreferredSize(new Dimension(100, 80));
		test_panel.add(users_title,BorderLayout.NORTH);
		
		//Panel de operaciones de la calculadora ubicado en EAST
		JPanel east_panel = new JPanel();
		east_panel.setBackground(Color.black);
		east_panel.setPreferredSize(new Dimension(100, 80));
		east_panel.setLayout(new GridLayout(5,1));
		
		JButton botonDiv = new JButton("/");
		botonDiv.setBackground(Color.decode("#22D3EE"));
		botonDiv.setForeground(Color.white);
		botonDiv.setFocusPainted(false);
		botonDiv.setFont(new Font("Arial",Font.BOLD,20));
		east_panel.add(botonDiv);
		
		JButton botonMult = new JButton("x");
		botonMult.setBackground(Color.decode("#22D3EE"));
		botonMult.setForeground(Color.white);
		botonMult.setFocusPainted(false);
		botonMult.setFont(new Font("Arial",Font.BOLD,20));
		east_panel.add(botonMult);
		
		JButton botonRes = new JButton("-");
		botonRes.setBackground(Color.decode("#22D3EE"));
		botonRes.setForeground(Color.white);
		botonRes.setFocusPainted(false);
		botonRes.setFont(new Font("Arial",Font.BOLD,20));
		east_panel.add(botonRes);
	
		JButton botonSuma = new JButton("+");
		botonSuma.setBackground(Color.decode("#22D3EE"));
		botonSuma.setForeground(Color.white);
		botonSuma.setFocusPainted(false);
		botonSuma.setFont(new Font("Arial",Font.BOLD,20));
		east_panel.add(botonSuma);
		
		JButton botonIgual = new JButton("=");
		botonIgual.setBackground(Color.decode("#4ADE80"));
		botonIgual.setForeground(Color.white);
		botonIgual.setFocusPainted(false);
		botonIgual.setFont(new Font("Arial",Font.BOLD,20));
		east_panel.add(botonIgual);
	
		test_panel.add(east_panel, BorderLayout.EAST);
		
		//Se agrega un conjunto de botones al panel central y el mismo se agrega al center del BorderLayout
		
		JPanel center_panel = new JPanel(); 
		center_panel.setBackground(Color.black);
		center_panel.setLayout(new GridLayout(4,4));
		
		JButton boton7 = new JButton("7");
		boton7.setBackground(Color.decode("#334155"));
		boton7.setForeground(Color.white);
		boton7.setFocusPainted(false);
		boton7.setFont(new Font("Arial",Font.BOLD,20));
		boton7.setPreferredSize(new Dimension(100, 80));
		center_panel.add(boton7);
		
		JButton boton8 = new JButton("8");
		boton8.setBackground(Color.decode("#334155"));
		boton8.setForeground(Color.white);
		boton8.setFocusPainted(false);
		boton8.setFont(new Font("Arial",Font.BOLD,20));
		center_panel.add(boton8);
		
		JButton boton9 = new JButton("9");
		boton9.setBackground(Color.decode("#334155"));
		boton9.setForeground(Color.white);
		boton9.setFocusPainted(false);
		boton9.setFont(new Font("Arial",Font.BOLD,20));
		center_panel.add(boton9);		
		
		JButton boton4 = new JButton("4");
		boton4.setBackground(Color.decode("#334155"));
		boton4.setForeground(Color.white);
		boton4.setFocusPainted(false);
		boton4.setFont(new Font("Arial",Font.BOLD,20));
		center_panel.add(boton4);
		
		JButton boton5 = new JButton("5");
		boton5.setBackground(Color.decode("#334155"));
		boton5.setForeground(Color.white);
		boton5.setFocusPainted(false);
		boton5.setFont(new Font("Arial",Font.BOLD,20));
		center_panel.add(boton5);
		
		JButton boton6 = new JButton("6");
		boton6.setBackground(Color.decode("#334155"));
		boton6.setForeground(Color.white);
		boton6.setFocusPainted(false);
		boton6.setFont(new Font("Arial",Font.BOLD,20));
		center_panel.add(boton6);
		
		JButton boton1 = new JButton("1");
		boton1.setBackground(Color.decode("#334155"));
		boton1.setForeground(Color.white);
		boton1.setFocusPainted(false);
		boton1.setFont(new Font("Arial",Font.BOLD,20));
		center_panel.add(boton1);
		
		JButton boton2 = new JButton("2");
		boton2.setBackground(Color.decode("#334155"));
		boton2.setForeground(Color.white);
		boton2.setFocusPainted(false);
		boton2.setFont(new Font("Arial",Font.BOLD,20));
		center_panel.add(boton2);
		
		JButton boton3 = new JButton("3");
		boton3.setBackground(Color.decode("#334155"));
		boton3.setForeground(Color.white);
		boton3.setFocusPainted(false);
		boton3.setFont(new Font("Arial",Font.BOLD,20));
		center_panel.add(boton3);
		
		JButton boton0 = new JButton("0");
		boton0.setBackground(Color.decode("#334155"));
		boton0.setForeground(Color.white);
		boton0.setFocusPainted(false);
		boton0.setFont(new Font("Arial",Font.BOLD,20));
		center_panel.add(boton0);
		
		JButton botonPunto = new JButton(".");
		botonPunto.setBackground(Color.decode("#334155"));
		botonPunto.setForeground(Color.white);
		botonPunto.setFocusPainted(false);
		botonPunto.setFont(new Font("Arial",Font.BOLD,20));
		center_panel.add(botonPunto);
		
		JButton botonParentesis = new JButton("( )");
		botonParentesis.setBackground(Color.decode("#334155"));
		botonParentesis.setForeground(Color.white);
		botonParentesis.setFocusPainted(false);
		botonParentesis.setFont(new Font("Arial",Font.BOLD,20));
		center_panel.add(botonParentesis);
		
		test_panel.add(center_panel,BorderLayout.CENTER);
			
		//Panel south con tres botones, se ajusta el tamaño de la region con un preferred size
		
		JPanel south_panel = new JPanel();  
		south_panel.setBackground(Color.decode("#0F172A"));
		south_panel.setLayout(new FlowLayout(1,10,10));
		south_panel.setPreferredSize(new Dimension(100, 50));
		south_panel.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		JButton botonANS2 = new JButton("ANS");
		botonANS2.setPreferredSize(new Dimension(100,30));
		botonANS2.setBackground(Color.decode("#22D3EE"));
		botonANS2.setForeground(Color.white);
		botonANS2.setFocusPainted(false);
		botonANS2.setFont(new Font("Arial",Font.BOLD,15));
		south_panel.add(botonANS2);
		
		JButton botonDEL = new JButton("DEL");
		botonDEL.setPreferredSize(new Dimension(100,30));
		botonDEL.setBackground(Color.decode("#22D3EE"));
		botonDEL.setForeground(Color.white);
		botonDEL.setFocusPainted(false);
		botonDEL.setFont(new Font("Arial",Font.BOLD,15));
		south_panel.add(botonDEL);
		
		JButton botonAC2 = new JButton("AC");
		botonAC2.setPreferredSize(new Dimension(100,30));
		botonAC2.setBackground(Color.decode("#22D3EE"));
		botonAC2.setForeground(Color.white);
		botonAC2.setFocusPainted(false);
		botonAC2.setFont(new Font("Arial",Font.BOLD,15));
		south_panel.add(botonAC2);
		
		test_panel.add(south_panel,BorderLayout.SOUTH);
	}
	
	public void calculadoraIntereses() {
		//Panel Principal
		JPanel panel = new JPanel();
		panel.setSize(400, 600);
		panel.setLocation(0, 0);
		panel.setBackground(Color.white);
		panel.setLayout(new BorderLayout(0,0));
		panel.setVisible(true);
		this.add(panel);
		
		//Etiqueta de interes al NORTH
		JLabel users_title = new JLabel("Interés"); 
		users_title.setFont(new Font("Arial",Font.BOLD,30));
		users_title.setForeground(Color.red);
		users_title.setHorizontalAlignment(JLabel.LEFT);
		users_title.setPreferredSize(new Dimension(100, 30));
		panel.add(users_title,BorderLayout.NORTH);
		
		//Panel central para el calculo de intereses
		JPanel calInteres = new JPanel();
		calInteres.setSize(100,100);
		calInteres.setLocation(0,0);
		calInteres.setBackground(Color.green);
		calInteres.setLayout(new GridLayout(4,2));
		calInteres.setVisible(true);
		
		JLabel capital = new JLabel("Capital");
		capital.setSize(30,5);
		capital.setBackground(Color.white);
		capital.setForeground(Color.black);
		calInteres.add(capital);
		
		JTextField txtCap = new JTextField();
		txtCap.setSize(30,5);
		txtCap.setBackground(Color.white);
		txtCap.setForeground(Color.black);
		calInteres.add(txtCap);
		
		JLabel tiempo = new JLabel("Tiempo");
		capital.setSize(30,5);
		capital.setBackground(Color.white);
		capital.setForeground(Color.black);
		calInteres.add(tiempo);
		
		JTextField txtTiempo = new JTextField();
		txtCap.setSize(30,5);
		txtCap.setBackground(Color.white);
		txtCap.setForeground(Color.black);
		calInteres.add(txtTiempo);
		
		JLabel TasaInteres = new JLabel("Capital");
		capital.setSize(30,5);
		capital.setBackground(Color.white);
		capital.setForeground(Color.black);
		calInteres.add(TasaInteres);
		
		JTextField txtTI = new JTextField();
		txtCap.setSize(30,5);
		txtCap.setBackground(Color.white);
		txtCap.setForeground(Color.black);
		calInteres.add(txtTI);
		
		JButton calcular = new JButton("Calcular");
		calcular.setSize(20,10);
		calcular.setBackground(Color.black);
		calcular.setForeground(Color.white);
		calcular.setHorizontalAlignment(JLabel.CENTER);
		calInteres.add(calcular);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setSize(20,10);
		cancelar.setBackground(Color.black);
		cancelar.setForeground(Color.white);
		cancelar.setHorizontalAlignment(JLabel.CENTER);
		calInteres.add(cancelar);
		calInteres.setPreferredSize(new Dimension(100,100));
		
		panel.add(calInteres,BorderLayout.CENTER);
		
		//Panel South Donde se muestran los resultados
		
		JPanel result = new JPanel();
		result.setSize(400,200);
		result.setLocation(0, 0);
		result.setBackground(Color.white);
		result.setLayout(new BorderLayout(2,2));
		result.setVisible(true);
		panel.add(result,BorderLayout.SOUTH);
		
		JLabel resInt = new JLabel("Intereses: ");
		resInt.setSize(30,5);
		resInt.setBackground(Color.white);
		resInt.setForeground(Color.black);
		result.add(resInt);
		
		JTextField txtResInt = new JTextField();
		txtResInt.setSize(30,20);
		txtResInt.setBackground(Color.white);
		txtResInt.setForeground(Color.black);
		result.add(txtResInt);
		
		JLabel resMonto = new JLabel("Monto: ");
		resMonto.setSize(30,5);
		resMonto.setBackground(Color.white);
		resMonto.setForeground(Color.black);
		result.add(resMonto);
		
		JTextField txtResMont = new JTextField();
		txtCap.setSize(30,20);
		txtCap.setBackground(Color.white);
		txtCap.setForeground(Color.black);
		result.add(txtResMont);
		
		
		
		
	}
	
}
