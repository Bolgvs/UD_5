import javax.swing.JOptionPane;

public class Act5_11App {
	
	public static void main (String args []) {
		
		// Petición día de la semana
		
		String dia = JOptionPane.showInputDialog(null, "¿Qué día de la semana es?");
		
		// Condiciones:
		
		switch (dia) {
		
		case "Lunes":
			
			System.out.println("Hoy es día laborable");
			
			break;
			
		case "Mares":
			
			System.out.println("Hoy es día laborable");
			
			break;
			
		case "Miercoles":
	
			System.out.println("Hoy es día laborable");
	
			break;
	
		case "Jueves":
	
			System.out.println("Hoy es día laborable");
	
			break;
	
		case "Viernes":
	
			System.out.println("Hoy es día laborable");
	
			break;
	
		case "Sábado":
	
			System.out.println("Hoy es día no laborable");
	
			break;
	
		case "Domingo":
	
			System.out.println("Hoy es día no laborable");
	
			break;
		
		}
		
	}

}
