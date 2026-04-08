package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Examen {

	private JFrame frame;
	private JTextField textFieldDoc;
	private JTextField textFieldDirr;
	private JTextField textFieldNom;
	private JTextField textFieldTel;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen window = new Examen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Examen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 656, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel norte = new JPanel();
		norte.setBackground(Color.decode("#006699"));
		frame.getContentPane().add(norte, BorderLayout.NORTH);
		
		JLabel TituloAzul = new JLabel("Factura JAVA - Eclipse - ArrayList y POO\r\n(Sin Base de Datos)");
		TituloAzul.setForeground(new Color(255, 255, 255));
		TituloAzul.setFont(new Font("Arial Black", Font.BOLD, 10));
		norte.add(TituloAzul);
		
		JPanel Centro = new JPanel();
		frame.getContentPane().add(Centro, BorderLayout.CENTER);
		Centro.setLayout(null);
		
		JPanel DatosdelCliente = new JPanel();
		DatosdelCliente.setBackground(new Color(255, 255, 255));
		DatosdelCliente.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		DatosdelCliente.setBounds(0, 0, 651, 70);
		Centro.add(DatosdelCliente);
		DatosdelCliente.setLayout(new GridLayout(2, 4, 0, 0));
		
		JLabel Documento = new JLabel("Documento:");
		Documento.setFont(new Font("Arial", Font.BOLD, 10));
		DatosdelCliente.add(Documento);
		
		textFieldDoc = new JTextField();
		DatosdelCliente.add(textFieldDoc);
		textFieldDoc.setColumns(10);
		
		JLabel Nombre = new JLabel("Nombres:");
		Nombre.setFont(new Font("Arial", Font.BOLD, 10));
		DatosdelCliente.add(Nombre);
		
		textFieldNom = new JTextField();
		DatosdelCliente.add(textFieldNom);
		textFieldNom.setColumns(10);
		
		JLabel Direccion = new JLabel("Direccion:");
		Direccion.setFont(new Font("Arial", Font.BOLD, 10));
		DatosdelCliente.add(Direccion);
		
		textFieldDirr = new JTextField();
		DatosdelCliente.add(textFieldDirr);
		textFieldDirr.setColumns(10);
		
		JLabel Telefono = new JLabel("Télefono:");
		Telefono.setFont(new Font("Arial", Font.BOLD, 10));
		DatosdelCliente.add(Telefono);
		
		textFieldTel = new JTextField();
		DatosdelCliente.add(textFieldTel);
		textFieldTel.setColumns(10);
		
		JPanel DatosFactura = new JPanel();
		DatosFactura.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		DatosFactura.setBounds(0, 71, 651, 517);
		Centro.add(DatosFactura);
		DatosFactura.setLayout(new BorderLayout(0, 0));
		
		JLabel DatosFact = new JLabel("Datose de factura");
		DatosFact.setFont(new Font("Arial", Font.BOLD, 10));
		DatosFact.setOpaque(true);
		DatosFact.setBackground(new Color(255, 255, 255));
		DatosFactura.add(DatosFact, BorderLayout.NORTH);
		
		JPanel DatosFac = new JPanel();
		DatosFactura.add(DatosFac, BorderLayout.CENTER);
		DatosFac.setLayout(new GridLayout(1, 4, 0, 0));
		
		JLabel NumeroFacts = new JLabel("Numero de facturas:");
		NumeroFacts.setFont(new Font("Arial", Font.BOLD, 10));
		NumeroFacts.setOpaque(true);
		NumeroFacts.setBackground(new Color(255, 255, 255));
		DatosFac.add(NumeroFacts);
		
		JLabel ImpNumFact = new JLabel("01");
		ImpNumFact.setFont(new Font("Arial Black", Font.BOLD, 10));
		ImpNumFact.setOpaque(true);
		ImpNumFact.setBackground(new Color(255, 255, 255));
		DatosFac.add(ImpNumFact);
		
		JLabel Fecha = new JLabel("Fecha:");
		Fecha.setFont(new Font("Arial", Font.BOLD, 10));
		Fecha.setOpaque(true);
		Fecha.setBackground(new Color(255, 255, 255));
		DatosFac.add(Fecha);
		
		JLabel lblNewLabel = new JLabel("18/01/05");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 10));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		DatosFac.add(lblNewLabel);
		
		JPanel ListFacturas = new JPanel();
		DatosFactura.add(ListFacturas, BorderLayout.SOUTH);
		ListFacturas.setLayout(new BorderLayout(0, 0));
		
		JPanel BarraSup = new JPanel();
		ListFacturas.add(BarraSup, BorderLayout.NORTH);
		BarraSup.setLayout(new GridLayout(1, 3, 0, 0));
		
		JLabel TituloVerFacts = new JLabel("Ver Listado de Facturas");
		TituloVerFacts.setFont(new Font("Arial", Font.BOLD, 10));
		TituloVerFacts.setOpaque(true);
		TituloVerFacts.setBackground(new Color(255, 255, 255));
		TituloVerFacts.setIcon(new ImageIcon("C:\\Users\\soyre\\OneDrive\\Escritorio\\P3 JAVA\\IDSTM26A\\src\\recursos\\Lista.png"));
		BarraSup.add(TituloVerFacts);
		
		JButton BotonAñadir = new JButton("Añadir");
		BotonAñadir.setFont(new Font("Arial", Font.BOLD, 10));
		BotonAñadir.setOpaque(true);
		BotonAñadir.setBackground(new Color(255, 255, 255));
		BotonAñadir.setIcon(new ImageIcon("C:\\Users\\soyre\\OneDrive\\Escritorio\\P3 JAVA\\IDSTM26A\\src\\recursos\\Agregar.png"));
		BarraSup.add(BotonAñadir);
		
		JButton BotonEliminar = new JButton("Eliminar");
		BotonEliminar.setFont(new Font("Arial", Font.BOLD, 10));
		BotonEliminar.setOpaque(true);
		BotonEliminar.setBackground(new Color(255, 255, 255));
		BotonEliminar.setIcon(new ImageIcon("C:\\Users\\soyre\\OneDrive\\Escritorio\\P3 JAVA\\IDSTM26A\\src\\recursos\\Eliminar.png"));
		BarraSup.add(BotonEliminar);
		
		table = new JTable();
		table.setFont(new Font("Arial", Font.PLAIN, 10));
		table.setBackground(new Color(255, 255, 255));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Agua", "2", "500", "1000.00"},
				{"Cereal", "5", "1000", "5000.00"},
				{"Leche", "2", "300", "600.00"},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Producto", "Cantidad", "Valor", "SubTotal"
			}
		));
		table.setSurrendersFocusOnKeystroke(true);
		JScrollPane Tabla = new JScrollPane(table);
		Tabla.setPreferredSize(null);
		Tabla.setBackground(Color.white);
		ListFacturas.add(Tabla, BorderLayout.CENTER);
		
		JPanel Sur = new JPanel();
		Sur.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(Sur, BorderLayout.SOUTH);
		Sur.setLayout(new BorderLayout(0, 0));
		
		JPanel Datos = new JPanel();
		Datos.setBackground(new Color(255, 255, 255));
		Sur.add(Datos);
		Datos.setLayout(new BorderLayout(0, 0));
		
		JPanel Etiquetas = new JPanel();
		Datos.add(Etiquetas, BorderLayout.WEST);
		Etiquetas.setLayout(new GridLayout(4, 1, 0, 0));
		
		JLabel SubTot = new JLabel("Sub Total:");
		SubTot.setFont(new Font("Arial", Font.BOLD, 10));
		SubTot.setOpaque(true);
		SubTot.setBackground(new Color(255, 255, 255));
		Etiquetas.add(SubTot);
		
		JLabel Descuento = new JLabel("% de Descuento: ");
		Descuento.setFont(new Font("Arial", Font.BOLD, 10));
		Descuento.setBackground(new Color(255, 255, 255));
		Descuento.setOpaque(true);
		Etiquetas.add(Descuento);
		
		JLabel IVA = new JLabel("IVA 19%:");
		IVA.setFont(new Font("Arial", Font.BOLD, 10));
		IVA.setBackground(new Color(255, 255, 255));
		IVA.setOpaque(true);
		Etiquetas.add(IVA);
		
		JLabel TotFact = new JLabel("Total Factura");
		TotFact.setFont(new Font("Arial", Font.BOLD, 10));
		TotFact.setBackground(new Color(255, 255, 255));
		TotFact.setOpaque(true);
		Etiquetas.add(TotFact);
		
		JPanel Result = new JPanel();
		Datos.add(Result, BorderLayout.CENTER);
		Result.setLayout(new GridLayout(1, 3, 0, 0));
		
		JPanel panel = new JPanel();
		Result.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel TXT = new JPanel();
		TXT.setOpaque(true);
		panel.add(TXT, BorderLayout.CENTER);
		TXT.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel cantidadSubtotal = new JLabel("6600.0");
		cantidadSubtotal.setFont(new Font("Arial Black", Font.BOLD, 10));
		cantidadSubtotal.setOpaque(true);
		cantidadSubtotal.setBackground(new Color(255, 255, 255));
		TXT.add(cantidadSubtotal);

		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.BOLD, 10));
		TXT.add(textField);
		textField.setColumns(10);
		
		JLabel IVAtxt = new JLabel("1254.0");
		IVAtxt.setFont(new Font("Arial Black", Font.BOLD, 10));
		IVAtxt.setOpaque(true);
		IVAtxt.setBackground(new Color(255, 255, 255));
		TXT.add(IVAtxt);
		
		JLabel TotFactTxt = new JLabel("7524.0");
		TotFactTxt.setFont(new Font("Arial Black", Font.BOLD, 10));
		TotFactTxt.setOpaque(true);
		TotFactTxt.setBackground(new Color(255, 255, 255));
		TXT.add(TotFactTxt);
		
		
		JPanel Boton = new JPanel();
		Boton.setBackground(new Color(255, 255, 255));
		Boton.setPreferredSize(new Dimension(50,50));
		panel.add(Boton, BorderLayout.EAST);
		Boton.setLayout(null);
		
		JCheckBox CheckPorcentaje = new JCheckBox("");
		CheckPorcentaje.setBounds(6, 19, 21, 21);
		CheckPorcentaje.setVerticalAlignment(SwingConstants.TOP);
		CheckPorcentaje.setBackground(new Color(255, 255, 255));
		CheckPorcentaje.setHorizontalAlignment(SwingConstants.CENTER);
		Boton.add(CheckPorcentaje);
		
		JPanel ultimoPanel = new JPanel();
		Result.add(ultimoPanel);
		ultimoPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel ValDesc = new JPanel();
		ultimoPanel.add(ValDesc, BorderLayout.CENTER);
		ValDesc.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel ValorDescontado = new JLabel("Valor Descontado:");
		ValorDescontado.setFont(new Font("Arial", Font.BOLD, 10));
		ValorDescontado.setOpaque(true);
		ValorDescontado.setBackground(new Color(255, 255, 255));
		ValDesc.add(ValorDescontado);
		
		JLabel VDTXT = new JLabel("330.0");
		VDTXT.setFont(new Font("Arial Black", Font.BOLD, 10));
		VDTXT.setOpaque(true);
		VDTXT.setBackground(new Color(255, 255, 255));
		ValDesc.add(VDTXT);
		
		JPanel Botones = new JPanel();
		Botones.setBackground(new Color(255, 255, 255));
		ultimoPanel.add(Botones, BorderLayout.SOUTH);
		
		JButton FinFact = new JButton("Finalizar Factura");
		FinFact.setFont(new Font("Arial", Font.BOLD, 10));
		FinFact.setBackground(new Color(255, 255, 255));
		FinFact.setOpaque(true);
		Botones.add(FinFact);
		
		JButton Limpiar = new JButton("Limpiar");
		Limpiar.setFont(new Font("Arial", Font.BOLD, 10));
		Limpiar.setBackground(new Color(255, 255, 255));
		Limpiar.setOpaque(true);
		Botones.add(Limpiar);
		
		
	}
}
