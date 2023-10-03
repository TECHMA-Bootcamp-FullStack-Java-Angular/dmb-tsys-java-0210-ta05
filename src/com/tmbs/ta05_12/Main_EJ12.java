package com.tmbs.ta05_12;

import javax.swing.JOptionPane;

//12) Escribe una aplicaci�n con un String que contenga una contrase�a cualquiera. Despu�s
//se te pedir� que introduzcas la contrase�a, con 3 intentos. Cuando aciertes ya no pedir� mas
//la contrase�a y mostrara un mensaje diciendo �Enhorabuena�. Piensa bien en la condici�n
//de salida (3 intentos y si acierta sale, aunque le queden intentos).
public class Main_EJ12 {
	
	public static void main(String[] args) {
		
		
		String password = "P4$$w0rd";
		String inputPass = "";
		int intentos = 3;

		while (!inputPass.equals(password) && intentos > 0 ) {
			
			inputPass= JOptionPane.showInputDialog("\nIntentos "+intentos+"\nIntroduce tu contrase�a: ");
			intentos--;
		}

		String resultText = password.equals(inputPass)
				? "Contrase�a correcta\nIniciando sesion..." 
				: "Agotados los intentos\nTu cuenta ha sido bloqueada.";
		
		JOptionPane.showMessageDialog(null, resultText);

	}

	

}
