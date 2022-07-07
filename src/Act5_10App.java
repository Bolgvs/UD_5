import javax.swing.JOptionPane;

public class Act5_10App {
	
	public static void main (String args []) {
		
		// Pedimos el número de ventas:
		
		String texto_ventas = JOptionPane.showInputDialog(null, "¿Número de ventas?");
		
		// Cambio de String - Int
		
		int ventas = Integer.parseInt(texto_ventas);
		
		// Precio final
		
		double PF = 0, precio;
		
		// Bucle for
		
		for (int numventas = 0; numventas < ventas; numventas++); {
		
			texto_ventas = JOptionPane.showInputDialog("Di el precio");
			
			precio = Integer.parseInt(texto_ventas);
			
			PF += precio;
		}
		
		JOptionPane.showMessageDialog(null, "El precio final es: " + PF);
	}

}