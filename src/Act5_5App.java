import javax.swing.JOptionPane;

public class Act5_5App {
	
	public static void main (String args []) {
		
		// Lectura del número por teclado:
		
		String texto_num = JOptionPane.showInputDialog(null, "¿Cuál es el numero?");
		
		// Conversión de String a int
		
		int num = Integer.parseInt(texto_num);
		
		// Ver si es divisible entre 2 o no
		
		if (num % 2 == 0) {
			
			JOptionPane.showMessageDialog(null, "El número es divisible entre 2");
			
		}
		
		else {
			
			JOptionPane.showMessageDialog(null, "El número no es divisible entre 2");
		}

	}
}