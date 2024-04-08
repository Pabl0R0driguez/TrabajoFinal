package Vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Repositorio.ConexionMySQL;
import Repositorio.Funciones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class InicioSesion implements ActionListener{
	//Las creamos fuera para poder utilizarlas en todos los metodos
	JTextField userText;
	JPasswordField passwordText;

	
	public InicioSesion() {
			
		//Creación de ventana de inicio de sesión
		JFrame frame = new JFrame("Inicio de Sesión");
		frame.setBackground(new Color(240, 240, 240));
		frame.getContentPane().setBackground(new Color(0, 64, 64));
		//Tamaño del marco de la ventana
		frame.setSize(348, 166);
		//.setDefaultCloseOperation--> Se utiliza para cerrar la ventana de trabajo  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		ComponentesLogin(panel);

		frame.setVisible(true);
	}

	private void ComponentesLogin(JPanel panel) {

		panel.setLayout(null);

		JLabel Usuario = new JLabel("Usuario");
		Usuario.setBounds(10, 10, 80, 25);
		panel.add(Usuario);

		userText = new JTextField(20);
		userText.setToolTipText("");
		userText.setBackground(new Color(255, 255, 255));
		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);

		JLabel Contraseña = new JLabel("Contraseña");
		Contraseña.setBounds(10, 40, 80, 25);
		panel.add(Contraseña);

		passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 160, 25);
		panel.add(passwordText);

		JButton loginButton = new JButton("login");
		loginButton.setBounds(128, 75, 80, 25);
		panel.add(loginButton);
		
		//Capturar futuros eventos sobre el boton : login
		loginButton.addActionListener(this);
			
		}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String usuario = userText.getText();
		String contraseña = passwordText.getText();//Pendiente		
		// System.out.println(usuario + contraseña);
		ConexionMySQL conexion=new ConexionMySQL("proyectofinal", "proyectofinal", "proyectofinal");
		
		//consulta a la base de datos
		boolean autenticacion = Funciones.login(usuario, contraseña);
		if(autenticacion) {
			System.out.println("El usuario existe");
		}
		else {
			System.out.println("No existe");
		}
	}
}