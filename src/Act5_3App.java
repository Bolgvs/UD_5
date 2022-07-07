import javax.swing.JOptionPane;

public class Act5_3App {
	
	public static void main (String args []) {
		
		// Petición de nombre
		
		String nombre = JOptionPane.showInputDialog(null, "¿Cuál es tu nombre?");
		
		// Texto en JOptionPane
		
		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
		
	}

}
