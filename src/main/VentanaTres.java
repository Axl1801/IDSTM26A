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
	//Creacion de Variables globales
	private BotonGato[][] tableroBotones; //Matriz de botones.
	private JLabel scoreX; //Label para el score jugador X.
	private JLabel scoreO; //Label para el score jugador O.
	private char turno = 'X'; //Turno inicial para el jugador X.
	private int winsX = 0; //Score para el jugador X
	private int winsO = 0;//Score para el jugador O.
	private int cont = 0; //Contador para encontrar el empate al usar todos los botones sin una victoria.
	
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
	
	public void tablero() {
		//Creacion de tablero como gridlayout de 3x3 para el acomodo de los botones dentro de la matriz.
		JPanel tablero = new JPanel();
		tablero.setLayout(new GridLayout(3,3,10,10));
		tablero.setBackground(Color.white);
		//Creacion de la matriz en la variable global.
		tableroBotones = new BotonGato[3][3];
		
		//Ciclo que agrega los botones de la clase BotoGato a la matriz.
		for(int i = 0; i<3;i++) {
			for(int j = 0; j<3;j++) {
				BotonGato boton = new BotonGato();
	            
	            tableroBotones[i][j] = boton;
	            //Action listener para realizar las comprobaciones y procesos.
	            boton.addActionListener(e ->{
	            	//Verificacion de que el boton no este ya ocupado por algun jugador.
	            	if(!boton.getText().equals("")) {
	            		return;
	            	}
	            	//Cambio del simbolo del boton al correspondiente turno y validacion de victoria en las 3 posibilidades.
	            	boton.setText(String.valueOf(turno));
		            if(this.win_horizontal(turno) || this.win_vertical(turno) || this.win_diagonal(turno)) {
		            	//Asignacion del ganador, del punto al ganador y del JOptionPane para seleccionar una opcion.
		            	char ganador = turno;
		            	this.wins_player(turno);
		            	this.victoria(ganador);
		            	//Reinicio del contador de empate.
		            	cont = 0;
		            	
		            	return;
		            }
	            	//Cambio de turno de jugador y suma al contador de empate en caso de no haber ganado aun.
	            	if(turno == 'X') {
	            		turno = 'O';
	            		cont++;
	            	}else {
	            		turno = 'X';
	            		cont++;
	            	}
	            	//Verificacion del empate de los jugadores mediante un contador.
	            	if(cont == 9) {
	            		this.empate();
	            		cont = 0;
	            	}	            	
	            });
	            
	            tablero.add(boton);
			}
		}
		this.add(tablero, BorderLayout.CENTER);
	}
	
	public void wins_player(char punto) {
		//Asignacion de punto a la variable de victorias de cada jugador.
	    if (punto == 'X') {
	        winsX++;
	        scoreX.setText("X : " + winsX);
	    } else if (punto == 'O') {
	        winsO++;
	        scoreO.setText("O : " + winsO);
	    }
	}
		
 	public void score() {
 		//Crea panel para el score
		JPanel score = new JPanel();
		score.setLayout(new BorderLayout());
		//GridLayout para acomodo de las etiquteas.
		JPanel x = new JPanel();
		x.setLayout(new GridLayout(0,2,0,0));
		//asignacion de label para el score del jugador X.
		scoreX = new JLabel("X : 0");
		scoreX.setBackground(Color.BLACK);
		scoreX.setForeground(Color.white);
		scoreX.setOpaque(true);
		scoreX.setHorizontalAlignment(SwingConstants.CENTER);
		x.add(scoreX);
		//asignacion de label para el score del jugador O.
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
		//Creacion de bton para reiniciar
		JButton reinicio_boton = new JButton("Reiniciar");
		reinicio_boton.setFocusPainted(false);
		reinicio_boton.setBorderPainted(false);
		reinicio_boton.setBackground(Color.BLACK);
		reinicio_boton.setForeground(Color.white);
		//Reinicia el tablero a texto Vacio.
	    reinicio_boton.addActionListener(e -> {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                tableroBotones[i][j].setText("");
	            }
	        }
	        turno = 'X'; // reinicia turno.
	    });
		
		reinicio.add(reinicio_boton);
		
		this.add(reinicio_boton,BorderLayout.SOUTH);
		
	}

	public boolean win_horizontal(char turno) {
		//busca la coincidencia de datos en la diagonal de izq a der y regresa true en caso de encontrarla.
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
		//busca la coincidencia de datos en horizontal de arriba a abajo y regresa true en caso de encontrarla.
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
			//busca la coincidencia de datos en la diagonal de izq a der y regresa true en caso de encontrarla.
	        if (tableroBotones[0][0].getText().equals(String.valueOf(turno)) &&
	            tableroBotones[1][1].getText().equals(String.valueOf(turno)) &&
	            tableroBotones[2][2].getText().equals(String.valueOf(turno))) {

	            return true;
	        }
	      //busca la coincidencia de datos en la diagonal de der a izq y regresa true en caso de encontrarla.
	        if (tableroBotones[0][2].getText().equals(String.valueOf(turno)) &&
		        tableroBotones[1][1].getText().equals(String.valueOf(turno)) &&
		        tableroBotones[2][0].getText().equals(String.valueOf(turno))) {

		        return true;
		    }

	    return false;
	}

	public void victoria(char ganador) {
		// Devuelven un int:
        //  0 - Volver a jugar -- empezar otra ronda.
        //  1 - Reiniciar Partida -- Empezar con puntos en .
        //  2 - //Salir -- Cerrar el juego.

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
        	//Volver a jugar -- empezar otra ronda.
        	for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                tableroBotones[i][j].setText("");
	            }
	        }
	        turno = 'X'; // reinicia turno.
        }
        	
            
            break;
        case 1:{
        	//Reiniciar Partida -- Empezar con puntos en 0.
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
    	   //Salir -- Cerrar el juego.
    	   mensaje = "Has pulsado Cancelar";
    	   System.exit(0);
        }   
	}
	
	public void empate() {
        //  0 - Volver a jugar -- empezar otra ronda.
        //  1 - Reiniciar Partida -- Empezar con puntos en 0.
        //  2 - //Salir -- Cerrar el juego.

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
        	//Volver a jugar -- empezar otra ronda.
        	for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                tableroBotones[i][j].setText("");
	            }
	        }
	        turno = 'X'; // reinicia turno.
        }
        	
            
            break;
        case 1:{
        	//Reiniciar Partida -- Empezar con puntos en 0.
        	winsX = 0;
        	winsO = 0;
        	scoreX.setText("X : 0");
        	scoreO.setText("O : 0");
        	for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                tableroBotones[i][j].setText("");
	            }
	        }
	        turno = 'X'; // reinicia turno.
        	
        	break;
        	
        }
       case 2:
    	   //Salir -- Cerrar el juego.
    	   System.exit(0);
        }   
	}
}	
