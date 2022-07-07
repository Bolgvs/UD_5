import javax.swing.JOptionPane;

public class Act5_12App {
	
	public static void main (String args []) {
		
		String contraseña = "Bolgvs", peticion;
		
		boolean mensaje = false;
		
		for (int intentos = 3; intentos != 0 && !mensaje; intentos--) {
			
			peticion = JOptionPane.showInputDialog("Escribe la contraseña:");
			
			if (peticion.equals(contraseña)) {
				
				mensaje = true;
				
			}
			
		}
		
	}

}
