package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Toolkit;
public class VentanaDos {

	private JFrame frmVentana;
	private JTextField nombreField;
	private JTextField FechaField;
	private JTextField APField;
	private JTextField AMField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaDos window = new VentanaDos();
					window.frmVentana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaDos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVentana = new JFrame();
		frmVentana.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\soyre\\OneDrive\\Escritorio\\P3 JAVA\\IDSTM26A\\IconoVentana2.png"));
		frmVentana.setFont(new Font("Arial", Font.PLAIN, 12));
		frmVentana.setForeground(new Color(0, 0, 0));
		frmVentana.setTitle("Ventana Dos");
		frmVentana.setSize(575, 511);
		frmVentana.getContentPane().setLayout(new BorderLayout(0, 0));
		
		
		//Ventana principal
		JLabel lblNewLabel = new JLabel("REGISTRO DE USUARIOS");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		frmVentana.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		//Panel Principal
		JPanel panel = new JPanel();
		panel.setBackground(new Color(248, 249, 250));
		frmVentana.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		
		//Primer panel de datos generales, mas sus componentes JLabel, BorderLayout, Panel, etc.
		JPanel datosGenerales = new JPanel();
		panel.add(datosGenerales);
		datosGenerales.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("DATOS GENERALES");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(33, 37, 41));
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		datosGenerales.add(lblNewLabel_1, BorderLayout.NORTH);
		
		//Panel para las etiquetas de los datos a rellenar y las etiquetas
		JPanel NomCamGenerales = new JPanel();
		datosGenerales.add(NomCamGenerales, BorderLayout.WEST);
		NomCamGenerales.setLayout(new GridLayout(6, 1, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("NOMBRES:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(new Color(108, 117, 125));
		NomCamGenerales.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("APELLIDO PATERNO:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBackground(new Color(108, 117, 125));
		lblNewLabel_3.setOpaque(true);
		NomCamGenerales.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("APELLIDO MATERNO:");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4.setBackground(new Color(108, 117, 125));
		lblNewLabel_4.setOpaque(true);
		NomCamGenerales.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("FECHA DE NACIMIENTO:");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5.setBackground(new Color(108, 117, 125));
		lblNewLabel_5.setOpaque(true);
		NomCamGenerales.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("SEXO:");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6.setBackground(new Color(108, 117, 125));
		lblNewLabel_6.setOpaque(true);
		NomCamGenerales.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("NACIONALIDAD:");
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7.setBackground(new Color(108, 117, 125));
		lblNewLabel_7.setOpaque(true);
		NomCamGenerales.add(lblNewLabel_7);
		
		//Panel para almacenar los JTextFields y los JComboBox
		JPanel CamposGenerales = new JPanel();
		datosGenerales.add(CamposGenerales, BorderLayout.CENTER);
		CamposGenerales.setLayout(new GridLayout(6, 1, 0, 0));
		
		nombreField = new JTextField("---");
		nombreField.setFont(new Font("Arial", Font.PLAIN, 12));
		nombreField.setBackground(new Color(206, 212, 218));
		CamposGenerales.add(nombreField);
		nombreField.setColumns(10);
		
		APField = new JTextField("---");
		APField.setFont(new Font("Arial", Font.PLAIN, 12));
		APField.setBackground(new Color(206, 212, 218));
		CamposGenerales.add(APField);
		APField.setColumns(10);
		
		AMField = new JTextField("---");
		AMField.setFont(new Font("Arial", Font.PLAIN, 12));
		AMField.setBackground(new Color(206, 212, 218));
		CamposGenerales.add(AMField);
		AMField.setColumns(10);
		
		FechaField = new JTextField("MM/DD/YYYY");
		FechaField.setFont(new Font("Arial", Font.PLAIN, 12));
		FechaField.setBackground(new Color(206, 212, 218));
		CamposGenerales.add(FechaField);
		FechaField.setColumns(10);
		
		//Arreglo para la opcion de lugar de nacimiento con 32 paises de todo el continente Americano
		String[] paises = {"Origen","Canadá","Estados Unidos","México","Belice","Costa Rica","El Salvador","Guatemala","Honduras","Nicaragua","Panamá",
				"Antigua y Barbuda","Bahamas","Barbados","Cuba","Dominica","Granada","Haití","Jamaica","República Dominicana","San Vicente y las Granadinas",
				"Santa Lucía","Trinidad y Tobago","Mierdantina","Bolivia","Brasil","Chile","Cocalombia","Ecuador","Guyana","Paraguay","Perú Es clave",
				"Surinam","Uruguay","Venezuela"};
		
		//ComboBox para los paises
		JComboBox GeneroBox = new JComboBox(paises);
		GeneroBox.setFont(new Font("Arial", Font.PLAIN, 12));
		GeneroBox.setForeground(new Color(0, 0, 0));
		GeneroBox.setOpaque(true);
		GeneroBox.setBackground(new Color(206, 212, 218));
		CamposGenerales.add(GeneroBox);
		
		//Arreglo para las opciones de genero
		String[] genero = {"Genero","Hombre", "Mujer", "Otro", "Prefiero no contestar (Tengo problemas)", "Therian"};
		
		//ComboBox para las opciones de genero
		JComboBox OrigenBox = new JComboBox(genero);
		OrigenBox.setFont(new Font("Arial", Font.PLAIN, 12));
		OrigenBox.setOpaque(true);
		OrigenBox.setBackground(new Color(206, 212, 218));
		CamposGenerales.add(OrigenBox);
		
		//Panel para el perfil de usuario con sus componentes JLabel, CheckBox, BorderLayout, GridLayout, Panel y sus parametros
		JPanel PerfilUsuarios = new JPanel();
		panel.add(PerfilUsuarios);
		PerfilUsuarios.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_8 = new JLabel("PERFIL DE USUARIO");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setBackground(new Color(33, 37, 41));
		lblNewLabel_8.setOpaque(true);
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 12));
		PerfilUsuarios.add(lblNewLabel_8, BorderLayout.NORTH);
		
		//Sub Panel para mostrar los botones de visibilidad CheckBox
		JPanel OpcionesMostrar = new JPanel();
		OpcionesMostrar.setBackground(new Color(108, 117, 125));
		PerfilUsuarios.add(OpcionesMostrar, BorderLayout.SOUTH);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Foto de Perfil Visible");
		chckbxNewCheckBox.setFont(new Font("Arial", Font.PLAIN, 12));
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBackground(new Color(0, 0, 0));
		OpcionesMostrar.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Fecha de nacimiento Visible");
		chckbxNewCheckBox_1.setFont(new Font("Arial", Font.PLAIN, 12));
		chckbxNewCheckBox_1.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox_1.setBackground(new Color(0, 0, 0));
		OpcionesMostrar.add(chckbxNewCheckBox_1);		
		
		//Sub Panel para la foto de perfil demostrativa
		JPanel FotoPerfil = new JPanel();
		FotoPerfil.setBackground(new Color(206, 212, 218));
		PerfilUsuarios.add(FotoPerfil, BorderLayout.CENTER);
		
		//Etiqueta en la cual se va a cargar la imagen y la direccion de la imagen a cargar
		JLabel IconoPerfil = new JLabel();
		IconoPerfil.setIcon(new ImageIcon("C:\\Users\\soyre\\OneDrive\\Escritorio\\P3 JAVA\\IDSTM26A\\IconoPerfil.png"));
		IconoPerfil.setHorizontalAlignment(SwingConstants.CENTER);
		FotoPerfil.add(IconoPerfil);
		
		//Panel para datos opcionales del usuario como intereses y descripción ademas de los componentes necesarios
		JPanel DatosOpcionales = new JPanel();
		panel.add(DatosOpcionales);
		DatosOpcionales.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_9 = new JLabel("DATOS OPCIONALES");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 10));
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setOpaque(true);
		lblNewLabel_9.setBackground(new Color(33, 37, 41));
		DatosOpcionales.add(lblNewLabel_9, BorderLayout.NORTH);
		
		JPanel PreferenciasPanel = new JPanel();
		DatosOpcionales.add(PreferenciasPanel, BorderLayout.SOUTH);
		PreferenciasPanel.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel lblNewLabel_10 = new JLabel("Preferencias");
		lblNewLabel_10.setForeground(new Color(0, 0, 0));
		lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_10.setOpaque(true);
		lblNewLabel_10.setBackground(new Color(108, 117, 125));
		PreferenciasPanel.add(lblNewLabel_10);
		
		//Sub panel para la seleccion de preferencias
		JPanel SeleccionPreferencias = new JPanel();
		PreferenciasPanel.add(SeleccionPreferencias);
		
		//Arreglo para el ComboBox de preferencias y su correspondiente asignacion
		String[] prefs = {"Musica","Literatura", "Videojuegos", "Peliculas y series", "Idiomas", "Otros"};
		JComboBox usuarioPrefs = new JComboBox(prefs);
		usuarioPrefs.setFont(new Font("Arial", Font.PLAIN, 12));
		
		SeleccionPreferencias.add(usuarioPrefs);
		
		//Sub Panel para un JTextArea donde el usuario ingresara su descripcion
		JPanel Descripcion = new JPanel();
		DatosOpcionales.add(Descripcion, BorderLayout.CENTER);
		Descripcion.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_11 = new JLabel("Tu Descripcíon:");
		lblNewLabel_11.setFont(new Font("Arial", Font.PLAIN, 10));
		lblNewLabel_11.setOpaque(true);
		lblNewLabel_11.setBackground(new Color(108, 117, 125));
		Descripcion.add(lblNewLabel_11, BorderLayout.NORTH);
		
		JTextArea DescUsuario = new JTextArea();
		DescUsuario.setBackground(new Color(206, 212, 218));
		Descripcion.add(DescUsuario, BorderLayout.CENTER);
		
		//Panel de botones para Guardar, Nuevo Perfil y Salir con un GridLayout Asignado
		JPanel PBotones = new JPanel();
		panel.add(PBotones);
		PBotones.setLayout(new BorderLayout(0, 0));
		
		//Sub Panel donde almacenar los botones en un GridLayout
		JPanel Botones = new JPanel();
		PBotones.add(Botones, BorderLayout.CENTER);
		Botones.setLayout(new GridLayout(3, 1, 0, 0));
		
		//Botones y sus respectivas configuraciones ademas de sus iconos (No jalo cambiarles el color)
		JButton BotonNuevo = new JButton("Nuevo");
		BotonNuevo.setBackground(new Color(255, 255, 255));
		BotonNuevo.setFocusPainted(false);
		BotonNuevo.setIcon(new ImageIcon("C:\\Users\\soyre\\OneDrive\\Escritorio\\P3 JAVA\\IDSTM26A\\IconoNuevo.png"));
		BotonNuevo.setFont(new Font("Arial", Font.PLAIN, 18));
		Botones.add(BotonNuevo);
		
		JButton BotonGuardar = new JButton("Guardar");
		BotonGuardar.setFocusPainted(false);
		BotonGuardar.setBackground(new Color(255, 255, 255));
		BotonGuardar.setIcon(new ImageIcon("C:\\Users\\soyre\\OneDrive\\Escritorio\\P3 JAVA\\IDSTM26A\\IconoGuardar.png"));
		BotonGuardar.setFont(new Font("Arial", Font.PLAIN, 18));
		Botones.add(BotonGuardar);
		
		JButton BotonSalir = new JButton("Salir");
		BotonSalir.setFocusPainted(false);
		BotonSalir.setBackground(new Color(255, 255, 255));
		BotonSalir.setFont(new Font("Arial", Font.PLAIN, 18));
		BotonSalir.setIcon(new ImageIcon("C:\\Users\\soyre\\OneDrive\\Escritorio\\P3 JAVA\\IDSTM26A\\IconoSalir.png"));
		Botones.add(BotonSalir);
	}

}
