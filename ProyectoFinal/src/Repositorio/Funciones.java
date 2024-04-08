package Repositorio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Funciones {

	// comprobar el usuario y contraseña introducidos.
	public static boolean login(String usuario, String contraseña, ConexionMySQL conexion)  {
			System.out.println("consultando a la base de datos. usuario: " + usuario + " contraseña: " + contraseña);
			
			// comprobar si el usuario y la contraseña existen en la base de datos
			String sentenciaNombre = "SELECT nombre	 FROM Usuarios	 WHERE usuario = '" + usuario + "'";
			String sentenciaContraseña = "SELECT contraseña	 FROM Usuarios	 WHERE contraseña = '" + contraseña + "'";

			
			
			
			ResultSet datos;
			ConexionMySQL datos = conexion.ejecutarSelect(sentenciaNombre);

			
			while (datos.next()) {
				String nombre = datos.getString("Nombre");
				int edad = datos.getInt("Edad");
				String dni = datos.getString("DNI");

				System.out.println(nombre + ", " + edad + ", " + dni);
			}
			if (sentenciaNombre.equals(usuario) && (sentenciaContraseña.equals(contraseña) ) )
				
				return true;//devuelve true si el usuario es correcto , es decir que exista en la bd
			
			else 
				return false;
			
	}
	
}
	
	
	
	
