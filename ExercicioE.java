package aulaVetores;
import javax.swing.JOptionPane;

public class ExercicioE {
	public static void main (String [] args) {

		double n = 5;
		double valores [] = new double [15];
		
		for (int i = 0; i < n; i++) {
			
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores"));
			
			if (valores [i] <0) {
				
				valores [i] = 0;
			}
			
			System.out.println("Final: " +valores[i]);
			
		}
		
	}	
}		

