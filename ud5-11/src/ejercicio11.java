import javax.swing.JOptionPane;

public class ejercicio11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = JOptionPane.showInputDialog("Introduce el d�a: ");

		
		switch(s) {
		case "Lunes":
			System.out.println(s+" es un d�a laboral");
			break;
		case "Martes":
			System.out.println(s+" es un d�a laboral");
			break;
		case "Mi�rcoles":
			System.out.println(s+" es un d�a laboral");
			break;
		case "Jueves":
			System.out.println(s+" es un d�a laboral");
			break;
		case "Viernes":
			System.out.println(s+" es un d�a laboral");
			break;
		case "S�bado":
			System.out.println(s+" no es un d�a laboral");
			break;
		case "Domingo":
			System.out.println(s+" no es un d�a laboral");
			break;
		default:
			System.out.println("Introduce un d�a de la semana v�lido. Ej: Lunes, S�bado");
			
		}
		
		
	}
}
