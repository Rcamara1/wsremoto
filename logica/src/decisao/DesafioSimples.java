package decisao;

import javax.swing.JOptionPane;

public class DesafioSimples {

	public static void main(String[] args) {
		/*
		 * Capturar: o nome e a idade
		 * Idade maior que 70, 16 ou 17 ele � facultativo
		 * Idade estiver entre 18 e 70 � obrigatorio
		 * Idade for menor que 16 nao pode votar
		 */

		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
		if (idade<16) {
			System.out.println(nome + " voc� ainda n�o pode votar.");
		}
		
		if (idade>=18 && idade<=70) {
			System.out.println(nome + " voc� � obrigado(a) a votar.");
		}
		
		if (idade>70 || idade==16 || idade==17) {
			System.out.println(nome + " o seu voto � facultativo");
		}
		
		
	}

}
