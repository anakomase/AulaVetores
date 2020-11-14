package aulaVetores;
/* Faça um programa que preenche um vetor com cinquenta elementos inteiros e altera todo valor
negativo para seu oposto positivo, ao final o programa deve exibir o vetor já modificado.
*/
import javax.swing.JOptionPane;
public class exercicioC {
	public static void main(String[] args) {
		int n = 5;
		int valores [] = new int [50];
		
		for (int i = 0; i < n; i++) {
			
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores"));
			
			if (valores [i] <0) {
				
				valores [i] = valores[i]*-1;
			}
			
			System.out.println("Final: " +valores[i]);
			
		}
		
		
	}
	
	
}
