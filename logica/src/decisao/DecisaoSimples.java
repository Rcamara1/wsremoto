package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Aluno").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
		float media = (nota1+nota2)/2;
		
		// Operadores 
		// !=  (n�o igual)
		// == (igual)
		
		if (media>=6 ) {
			System.out.println("Parabens " + nome + " voc� est� aprovado!");
		}
		
		if (media<4) {
			System.out.println("Nao foi desta vez " + nome + " voc� foi  reprovado!");
		}
		// Operadores logicos
		// && => and => e
		// || => or => ou
		
		if (media>4 && media<6 ) {
			System.out.println(nome + " voc� ainda tem umc chance no exame!");
		
		}
			System.out.println("Sua m�dia foi: " + media);
		
			

		
		
		
		
		
		
		
		
		
		
		

	}

}
