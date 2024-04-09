package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import javax.swing.BoxLayout;

public class VentanaPrincipal extends JFrame {
	public VentanaPrincipal() {
		
		JFrame frame = new JFrame("Inicio de Sesión");
		frame.setBackground(new Color(240, 240, 240));
		frame.getContentPane().setBackground(new Color(0, 64, 64));
		frame.setSize(500, 500);

		
		
		JLabel lblNewLabel = new JLabel("Ventana Principal");
		getContentPane().add(lblNewLabel, BorderLayout.WEST);
		
		JButton btnNewButton = new JButton("New button");
		getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		
		frame.setVisible(true);
	}


}