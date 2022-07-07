import javax.swing.JOptionPane;

public class Act5_10App {
	
	public static void main (String args []) {
		
		// IVA
		
		final double IVA = 0.21;
		
		// Pedimos el número de ventas:
		
		String texto_ventas = JOptionPane.showInputDialog("¿Número de ventas?");
		
		// Cambio de String - Int
		
		int numventas, ventas = Integer.parseInt(texto_ventas);
		
		// Precio final
		
		double PF = 0, precio;
		
		// Bucle for
		
		for (numventas = 0; numventas < ventas; numventas++) {
		
			texto_ventas = JOptionPane.showInputDialog("¿Cuál es el precio?");
			
			precio = Integer.parseInt(texto_ventas);
			
			PF += precio + (precio * IVA);
		}
		
		// Mensaje final
		
		JOptionPane.showMessageDialog(null, "El precio final es: " + PF);
	}

}