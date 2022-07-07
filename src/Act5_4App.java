import javax.swing.JOptionPane;

public class Act5_4App {
	
	public static void main (String args []) {
		
		// Petición de radio
		
		
		String radio = JOptionPane.showInputDialog(null, "¿Cuál es el radio?");
		
		// Conversión de String a Double
		
		double r = Double.parseDouble(radio);
				
		// Cálculo de área con Math.pow
		
		Number area = Math.PI * Math.pow(r, 2);
		
		// Mostrar Area en un JOptionPane
		
		JOptionPane.showMessageDialog (null, "El area es: " + area);
		
	}

}
