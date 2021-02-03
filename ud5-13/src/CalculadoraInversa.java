import javax.swing.JOptionPane;
public class CalculadoraInversa {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer operando: "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo operando: "));
		String o = JOptionPane.showInputDialog("Introduce un signo aritmético: ");
		
		
		switch(o) {
			case "+":
				System.out.println(n1+" "+o+" "+n2+" = "+(n1+n2));
				break;
			case "-":
				System.out.println(n1+" "+o+" "+n2+" = "+(n1-n2));
				break;
			case "*":
				System.out.println(n1+" "+o+" "+n2+" = "+(n1*n2));
				break;
			case "/":
				System.out.println(n1+" "+o+" "+n2+" = "+(n1/n2));
				break;
			case "^":
				System.out.println(n1+" "+o+" "+n2+" = "+(Math.pow(n1, n2)));
				break;
			case "%":
				System.out.println(n1+" "+o+" "+n2+" = "+(n1%n2));
				break;
			default:
				System.out.println("Introduce un signo aritmético válido");
		}
		
		
	}
}

