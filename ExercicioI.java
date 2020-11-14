package aulaVetores;
import javax.swing.JOptionPane;
public class ExercicioI {
	public static void main (String [] args) {
		
		int [] entrada = new int [50];
		String saida = null;
		String saidaFinal = null;
		
		for(int i = 0; i < entrada.length; i++) {
		entrada [i] = Integer.parseInt(JOptionPane.showInputDialog("Digite as letras"));
		}		
		
		for (int i = entrada.length-1; i >= 0; i--) {
			
			saida = saida + "entrada["+i+"] = "+ entrada[i];
			saidaFinal = saida.replaceAll("\s+", "");
		}
		
		JOptionPane.showMessageDialog(null,saidaFinal);
		
		
	}
}
