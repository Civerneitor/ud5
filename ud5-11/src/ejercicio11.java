import javax.swing.JOptionPane;

public class ejercicio11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = JOptionPane.showInputDialog("Introduce el día: ");

		
		switch(s) {
		case "Lunes":
			System.out.println(s+" es un día laboral");
			break;
		case "Martes":
			System.out.println(s+" es un día laboral");
			break;
		case "Miércoles":
			System.out.println(s+" es un día laboral");
			break;
		case "Jueves":
			System.out.println(s+" es un día laboral");
			break;
		case "Viernes":
			System.out.println(s+" es un día laboral");
			break;
		case "Sábado":
			System.out.println(s+" no es un día laboral");
			break;
		case "Domingo":
			System.out.println(s+" no es un día laboral");
			break;
		default:
			System.out.println("Introduce un día de la semana válido. Ej: Lunes, Sábado");
			
		}
		
		
	}
}
