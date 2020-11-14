package aulaVetores;
import javax.swing.JOptionPane;
public class ExercicioH {
public static void main (String [] args) {
		
		int n = 5;
		int valores [] = new int[15];
		
		for (int i = 0; i < n; i++) {
			
			valores [i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores:"));
			
			if (valores[i] >= 0 && valores[i]%2 == 0) {
				
				System.out.println("Os números pares são: "+ valores[i]);
				
			}
			
		}
		
	}
	
}
