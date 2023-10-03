package com.tmbs.ta05_13;

import javax.swing.JOptionPane;

/*13) Crea una aplicaci�n llamada Calculadoralnversa, nos pedir� 2 operandos (int) y un signo
aritm�tico (String), seg�n este �ltimo se realizara la operaci�n correspondiente. Al finalmostrara el resultado en un cuadro de dialogo.
Los signos aritm�ticos disponibles son:
+: suma los dos operandos.
-: resta los operandos.
*: multiplica los operandos.
/: divide los operandos, este debe dar un resultado con decimales (double)
^: 1e operando como base y 2� como exponente.
%: m�dulo, resto de la divisi�n entre operando1 y operando2.*/

public class Main_EJ13 {

	public static void main(String[] args) {

		Integer num1 = Integer.valueOf(inputValue("Introduzca el 1� valor:"));
		Integer num2 = Integer.valueOf(inputValue("Introduzca el 2� valor:"));
		String signo = inputValue("Elije un signo de operaci�n" + "\n[+] [-] [*] [/] [%] [^]");

		String operationText = num1 + " " + signo + " " + num2 + " = ";
		String resultText = "";
		
		  switch (signo) {
	
			case "+":resultText = String.valueOf(num1 + num2);break;
			case "-":resultText = String.valueOf(num1 - num2);break;
			case "*":resultText = String.valueOf(num1 * num2);break;
			case "/":resultText = String.valueOf(num1 / num2);break;
			case "%":resultText = String.valueOf(num1 % num2);break;
			case "^":resultText = String.valueOf(Math.pow(num1, num2));break;
			default:operationText="El signo elegido no es un operador valido";
		 };

		JOptionPane.showMessageDialog(null,operationText + resultText);
	}

	private static String inputValue(String text) {
		return JOptionPane.showInputDialog(text);
	}

}
