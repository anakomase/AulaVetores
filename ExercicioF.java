package aulaVetores;
import javax.swing.JOptionPane;

public class ExercicioF {
public static void main (String [] args) {
		
		float n = 5;
		float temp;
		float maior = 0;
		float menor = Integer.MAX_VALUE;
		float valores [] = new float [31];
		
		for (int i = 0; i < n; i++) {
			
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a Temperatura"));
			
			temp = valores[i];
			if(temp < menor) {
				menor = temp;
			}
			
			if(temp > maior) {
				maior = temp;
			}
		}
		
		System.out.println("A menor temperatura é: " +menor);
		System.out.println("A maior temperatura é: " +maior);
		
		float acum = 0;
		
		for(int i = 0; i < n; i++) {
			acum = acum + valores[i];
			
		}
		
		float media = acum / n;
		System.out.println("A média mensal é: " +media);
		
		String saida = "Temperatura máxima menor que a média mensal: ";
		for (int i = 0; i < n; i++) {
			
			if(valores[i] < media) {
				
				saida = saida + valores[i] + "";
			}
			
			System.out.println(saida);
		}
	}
}
