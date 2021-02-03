import javax.swing.JOptionPane;
public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n = Double.parseDouble(JOptionPane.showInputDialog("Introduce un número: "));
		if(n%2==0) {
			System.out.println("El número "+n+" es divisible entre dos.");
		}else {
			System.out.println("El número "+n+" no es divisible entre dos.");
		}
		
	}

}
