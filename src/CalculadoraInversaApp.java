import javax.swing.JOptionPane;

public class CalculadoraInversaApp {
	
	public static void main (String args []) {
		
		// Petición de datos
		
		String texto_num1 = JOptionPane.showInputDialog(null, "Dame el primer número");
		
		String texto_num2= JOptionPane.showInputDialog(null, "Dame el segundo número");
		
		String operador = JOptionPane.showInputDialog(null, "Dime el operador matemático");
		
		// Conversión de String - Int
		
		int num1 = Integer.parseInt(texto_num1);
		
		int num2 = Integer.parseInt(texto_num2);
		
		// Resultado
		
		double resultado= 0;
		
		switch (operador) {
			
		case ("+"):
			
			resultado = num1 + num2;
		
			break;
		
		case ("-"):
			
			resultado = num1 - num2;
		
			break;
		
		case ("*"):
	
			resultado = num1 * num2;

			break;
			
		case ("/"):
	
			resultado = num1 / num2;

			break;
			
		case ("^"):
	
			resultado = Math.pow(num1, num2);

			break;
			
		case ("%"):
	
			resultado = num1 + num2;

			break;
			
		default:
			
			JOptionPane.showMessageDialog(null, "Signo aritmético incorrecto");
		
		}
		
		JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
		
	}

}
