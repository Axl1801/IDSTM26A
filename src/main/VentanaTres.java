package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class VentanaTres extends JFrame{
	public VentanaTres() {
		 this.setSize(300,300);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setLocationRelativeTo(null);
		 this.setTitle("Gato");
		 this.setMinimumSize(new Dimension(300,400));
		 this.setMaximumSize(new Dimension(500,600));
		 this.getContentPane().setBackground(Color.black);
		 this.setLayout(new BorderLayout());
		 
		 this.tablero();
		 this.score();
		 this.reiniciar();
		 this.setVisible(true);
	}
	
	private BotonGato[][] tableroBotones;
	private JLabel scoreX;
	private JLabel scoreO;
	private boolean victoria = false;
	private char turno = 'X';
	private int winsX = 0;
	private int winsO = 0;
	private int cont = 0;
	
	public void tablero() {
		JPanel tablero = new JPanel();
		tablero.setLayout(new GridLayout(3,3,10,10));
		tablero.setBackground(Color.white);
		 tableroBotones = new BotonGato[3][3];
		
		for(int i = 0; i<3;i++) {
			for(int j = 0; j<3;j++) {
				BotonGato boton = new BotonGato();
	            
	            tableroBotones[i][j] = boton;
	            
	            boton.addActionListener(e ->{
	            	if(!boton.getText().equals("")) {
	            		return;
	            	}
	            	
	            	boton.setText(String.valueOf(turno));
		            if(this.win_horizontal(turno) || this.win_vertical(turno) || this.win_diagonal(turno)) {
		            	char ganador = turno;
		            	this.wins_player(turno);
		            	this.victoria(ganador);
		            	cont = 0;
		            	
		            	return;
		            }
	            	
	            	if(turno == 'X') {
	            		turno = 'O';
	            		cont++;
	            	}else {
	            		turno = 'X';
	            		cont++;
	            	}
	            	
	            	if(cont == 9) {
	            		this.empate();
	            		cont = 0;
	            	}
	            	System.out.println(cont);
	            	
	            });
	            

	            tablero.add(boton);
			}
		}
		this.add(tablero, BorderLayout.CENTER);
	}
	
	public void wins_player(char punto) {
	    if (punto == 'X') {
	        winsX++;
	        scoreX.setText("X : " + winsX);
	    } else if (punto == 'O') {
	        winsO++;
	        scoreO.setText("O : " + winsO);
	    }
	}
		
 	public void score() {
		JPanel score = new JPanel();
		score.setLayout(new BorderLayout());
		
		JPanel x = new JPanel();
		x.setLayout(new GridLayout(0,2,0,0));
		
		scoreX = new JLabel("X : 0");
		scoreX.setBackground(Color.BLACK);
		scoreX.setForeground(Color.white);
		scoreX.setOpaque(true);
		scoreX.setHorizontalAlignment(SwingConstants.CENTER);
		x.add(scoreX);
		scoreO = new JLabel("O : 0");
		scoreO.setBackground(Color.BLACK);
		scoreO.setForeground(Color.white);
		scoreO.setOpaque(true);
		scoreO.setHorizontalAlignment(SwingConstants.CENTER);
		x.add(scoreO);
		
		score.repaint();
		score.revalidate();
		score.add(x, BorderLayout.SOUTH);
		
		score.setVisible(true);
		this.add(score, BorderLayout.NORTH);
	}
	
	public void reiniciar() {
		JPanel reinicio = new JPanel();
		
		JButton reinicio_boton = new JButton("Reiniciar");
		reinicio_boton.setFocusPainted(false);
		reinicio_boton.setBorderPainted(false);
		reinicio_boton.setBackground(Color.BLACK);
		reinicio_boton.setForeground(Color.white);
		
	    reinicio_boton.addActionListener(e -> {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                tableroBotones[i][j].setText("");
	            }
	        }
	        turno = 'X'; // reinicia turno
	    });
		
		reinicio.add(reinicio_boton);
		
		this.add(reinicio_boton,BorderLayout.SOUTH);
		
	}

	public boolean win_horizontal(char turno) {
	    for (int i = 0; i < 3; i++) {

	        if (tableroBotones[i][0].getText().equals(String.valueOf(turno)) &&
	            tableroBotones[i][1].getText().equals(String.valueOf(turno)) &&
	            tableroBotones[i][2].getText().equals(String.valueOf(turno))) {

	            return true;
	        }
	    }

	    return false;
	}

	public boolean win_vertical(char turno) {
	    for (int j = 0; j < 3; j++) {

	        if (tableroBotones[0][j].getText().equals(String.valueOf(turno)) &&
	            tableroBotones[1][j].getText().equals(String.valueOf(turno)) &&
	            tableroBotones[2][j].getText().equals(String.valueOf(turno))) {

	            return true;
	        }
	    }

	    return false;
	}

	public boolean win_diagonal(char turno) {

	        if (tableroBotones[0][0].getText().equals(String.valueOf(turno)) &&
	            tableroBotones[1][1].getText().equals(String.valueOf(turno)) &&
	            tableroBotones[2][2].getText().equals(String.valueOf(turno))) {

	            return true;
	        }

	        if (tableroBotones[0][2].getText().equals(String.valueOf(turno)) &&
		        tableroBotones[1][1].getText().equals(String.valueOf(turno)) &&
		        tableroBotones[2][0].getText().equals(String.valueOf(turno))) {

		        return true;
		    }

	    return false;
	}

	public void victoria(char ganador) {
		// Devuelven un int:
        //  0 - Volver a jugar -- empezar otra ronda
        //  1 - Reiniciar Partida -- Empezar con puntos en 
        //  2 - //Salir -- Cerrar el juego

    	String[] opciones = {"Volver a jugar", "Reiniciar Partida", "Salir"};
    	int opcion = JOptionPane.showOptionDialog(
    			null,
    			"Felicidades!!!! al Jugador " + ganador + " Ha ganado!!!",
    			"Tic Tac Toe",
    			JOptionPane.DEFAULT_OPTION,
    			JOptionPane.QUESTION_MESSAGE,
    			null,
    			opciones,
    			opciones[0]
    			);
    	String mensaje =  " "; 
        switch (opcion) {
        case 0:{
        	//Volver a jugar -- empezar otra ronda
        	for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                tableroBotones[i][j].setText("");
	            }
	        }
	        turno = 'X'; // reinicia turno
        }
        	
            
            break;
        case 1:{
        	//Reiniciar Partida -- Empezar con puntos en 0
        	winsX = 0;
        	winsO = 0;
        	scoreX.setText("X : 0");
        	scoreO.setText("O : 0");
        	for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                tableroBotones[i][j].setText("");
	            }
	        }
	        turno = 'X'; // reinicia turno
        	mensaje = "El ganador es: " + ganador;
        	
        	break;
        	
        }
       case 2:
    	   //Salir -- Cerrar el juego
    	   mensaje = "Has pulsado Cancelar";
    	   System.exit(0);
        }   
	}
	
	public void empate() {
        //  0 - Volver a jugar -- empezar otra ronda
        //  1 - Reiniciar Partida -- Empezar con puntos en 
        //  2 - //Salir -- Cerrar el juego

    	String[] opciones = {"Volver a jugar", "Reiniciar Partida", "Salir"};
    	int opcion = JOptionPane.showOptionDialog(
    			null,
    			"El juego ha sido Empatado!!!",
    			"Tic Tac Toe",
    			JOptionPane.DEFAULT_OPTION,
    			JOptionPane.QUESTION_MESSAGE,
    			null,
    			opciones,
    			opciones[0]
    			);
        switch (opcion) {
        case 0:{
        	//Volver a jugar -- empezar otra ronda
        	for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                tableroBotones[i][j].setText("");
	            }
	        }
	        turno = 'X'; // reinicia turno
        }
        	
            
            break;
        case 1:{
        	//Reiniciar Partida -- Empezar con puntos en 0
        	winsX = 0;
        	winsO = 0;
        	scoreX.setText("X : 0");
        	scoreO.setText("O : 0");
        	for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                tableroBotones[i][j].setText("");
	            }
	        }
	        turno = 'X'; // reinicia turno
        	
        	break;
        	
        }
       case 2:
    	   //Salir -- Cerrar el juego
    	   System.exit(0);
        }   
	}
}	
