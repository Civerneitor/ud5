import javax.swing.JOptionPane;
public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n = Double.parseDouble(JOptionPane.showInputDialog("Introduce un n�mero: "));
		if(n%2==0) {
			System.out.println("El n�mero "+n+" es divisible entre dos.");
		}else {
			System.out.println("El n�mero "+n+" no es divisible entre dos.");
		}
		
	}

}
