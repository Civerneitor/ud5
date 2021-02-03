import javax.swing.JOptionPane;
public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio: "));
		System.out.println("El área del circulo es: "+Math.PI*Math.pow(r, 2));
	}

}
