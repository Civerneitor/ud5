import javax.swing.JOptionPane;

public class ejercicio12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pass = "hola";
		
		
		for(int i=0; i<3;i++) {
			String s = JOptionPane.showInputDialog("Introduce la contrase�a: ");
			if(s.equals(pass)) {
				System.out.println("Enhorabuena");
				break;
			}
			//System.out.println(s+pass);
		}
		//System.out.println("Has alcanzado el m�ximo n�mero de intentos");
		
	}
}
