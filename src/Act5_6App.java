import javax.swing.JOptionPane;

public class Act5_6App {
	
	public static void main (String args []) {
		
		// Constante IVA
		
		final double IVA = 0.21;
		
		// Petición del precio:
		
		String texto_precio = JOptionPane.showInputDialog(null, "¿Cuál es el precio?");
		
		// 	Conversión de String - Double
		
		double precio = Double.parseDouble(texto_precio);
		
		// Cálculo precio final:
		
		double PF = precio + ( precio * IVA );
		
		JOptionPane.showMessageDialog(null, "El precio final es de: " + PF);
		
	}
}