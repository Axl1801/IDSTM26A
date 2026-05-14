package Views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Models.User;

public class UserView {
	public UserView(){
		
	}
	
	public void userCont(ArrayList<User> data_users) {
		JFrame ventana = new JFrame();
		
		ventana.setSize(1000, 640);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setMinimumSize(new Dimension(200,200));
		ventana.setMaximumSize(new Dimension(1200,800));
		ventana.setTitle("Hola"); 
		ventana.getContentPane().setBackground(Color.decode("#C8DEBD"));
		ventana.setLayout(null); 
		
		
		//Creacion del Panel de usuraios
		JPanel users = new JPanel();
		users.setSize(1000,500);
		users.setLocation(0, 50);
		users.setBackground(Color.white);
		users.setLayout(null);
		ventana.add(users);
		
		//Etiquetas y botones para la pantalla de users
		JLabel user_title = new JLabel("Consulta");
		user_title.setBounds(400, 50, 200,40);
		user_title.setHorizontalAlignment(JLabel.CENTER);
		user_title.setFont(new Font("Arial",Font.BOLD,22));
		user_title.setOpaque(true);
		user_title.setBackground(Color.cyan);
		users.add(user_title);
		
		JButton export = new JButton("Exportar");
		export.setBounds(30,120,100,40);
		users.add(export);
		
		JButton add = new JButton("Añadir");
		add.setBounds(130,120,100,40);
		users.add(add);
		
		//Creacion de un arreglo de opciones  para los apartados de una tabla
		Object [] table_head = {"ID","Nombre","Apellidos","Correo","Telefono","Acciones"};
		//Creacion de una matriz para los datos de una tablaw
		DefaultTableModel model = new DefaultTableModel(table_head,0);
		
		for(User user : data_users) {
		     Object[] row = { user.getId(), user.getName(), user.getLastname(), user.getEmail(), user.getPhone() };
		     model.addRow(row); 
		}
		
		//Creacion de la tabla para usuario con datos, campos y una scrollBar para navegacion
		JTable users_table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(users_table);
		scrollPane.setLocation(30, 180);
		scrollPane.setSize(800,200);
		users_table.setBorder(BorderFactory.createLineBorder(Color.black));
		users.add(scrollPane);
		
		add.addActionListener(e->{
			RegisterView();
		});
		
		CargarTabla(model,data_users);
		
		ventana.setVisible(true);
	}
	
	public void RegisterView() {
		JFrame ventana = new JFrame();
		
		ventana.setSize(1000, 640);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setMinimumSize(new Dimension(200,200));
		ventana.setMaximumSize(new Dimension(1200,800));
		ventana.setTitle("Registro de Usuario"); 
		ventana.getContentPane().setBackground(Color.decode("#C8DEBD"));
		ventana.setLayout(null); 
		
		JPanel users = new JPanel();
		users.setSize(1000,640);
		users.setLocation(0, 00);
		users.setBackground(Color.white);
		users.setLayout(null);
		ventana.add(users);
		
		JLabel titulo = new JLabel("Rellene los datos correctamente");
		titulo.setBounds(450, 50, 100, 30);
		users.add(titulo);
		
		JLabel nombre = new JLabel("Nombre: ");
		nombre.setBounds(100, 120, 100, 30);
		users.add(nombre);
		
		JTextField campo_Nombre = new JTextField();
		campo_Nombre.setBounds(100, 160, 150, 30);
		users.add(campo_Nombre);
		
		JLabel email = new JLabel("Email: ");
		email.setBounds(100, 200, 100, 30);
		users.add(email);
		
		JTextField campo_Email = new JTextField();
		campo_Email.setBounds(100, 240, 150, 30);
		users.add(campo_Email);
		
		JLabel password = new JLabel("password: ");
		password.setBounds(100, 280, 100, 30);
		users.add(password);
		
		JTextField campo_password = new JTextField();
		campo_password.setBounds(100, 320, 150, 30);
		users.add(campo_password);
		
		JLabel lastname = new JLabel("Apellido: ");
		lastname.setBounds(350, 120, 100, 30);
		users.add(lastname);
		
		JTextField campo_lastname = new JTextField();
		campo_lastname.setBounds(350, 160, 150, 30);
		users.add(campo_lastname);
		
		JLabel phone = new JLabel("Telefono: ");
		phone.setBounds(350, 200, 100, 30);
		users.add(phone);
		
		JTextField campo_phone = new JTextField();
		campo_phone.setBounds(350, 200, 150, 30);
		users.add(campo_phone);
		
		JButton volver = new JButton("Volver");
		volver.setBounds(150, 400, 100, 30);
		users.add(volver);
		
		JButton guardar = new JButton("Guardar");
		guardar.setBounds(250, 400, 100, 30);
		users.add(guardar);
		
		volver.addActionListener(e->{
			ventana.dispose();
		});
		
		guardar.addActionListener(e->{
			User newUser = new User(02,campo_Nombre.getText(),campo_Email.getText(),campo_password.getText(),campo_lastname.getText(),campo_phone.getText());
			newUser.create(newUser);
			
			ventana.dispose();
		});
		
		
		ventana.setVisible(true);
		

	}

	public void CargarTabla(DefaultTableModel users,ArrayList<User> data_users) {
		users.setRowCount(0);
		for(User user : data_users) {
		     Object[] row = { user.getId(), user.getName(), user.getLastname(), user.getEmail(), user.getPhone() };
		     users.addRow(row); 
		}
	}
}
