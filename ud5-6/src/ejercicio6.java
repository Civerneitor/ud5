import javax.swing.JOptionPane;
public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n = Double.parseDouble(JOptionPane.showInputDialog("Introduce un número: "));
		
		System.out.println("El precio "+n+"€ se le aplica el IVA y queda en: "+(n+n*0.21));
		
		
	}

}