import javax.swing.JOptionPane;

public class ejercicio10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el n�mero de ventas: "));
		double res = 0;
		for(int i=0; i<n;i++) {
			double p = Double.parseDouble(JOptionPane.showInputDialog("Introduce la venta n�mero "+(i+1)+":"));
			res+=p;
		}
		System.out.println("La suma de todas las ventas da: "+res);
		
	}
}
