package decisao;

import javax.swing.JOptionPane;

public class DesafioEncadeado {

	public static void main(String[] args) {
		/*
		 * Acrescente uma captura de dado, perguntando ao usuario
		 * se é alfabetizzado (1) ou nao (0)
		 * se ele nao for alfabetizado não vota
		 * Altere o codigo abaixo para a melhor estrutura de decisão
		 */
		
		boolean alfabetizadoboolean = Boolean.parseBoolean
				(JOptionPane.showInputDialog("Digite true se for alfabetizado"));
		
		byte alfabetizado = Byte.parseByte(JOptionPane.showInputDialog("Digite <1> para alfabetizado"));
		if (alfabetizado==1) {
			String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
			short idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
			if (idade<16) {
				System.out.println(nome + " você ainda não pode votar.");
			}else if (idade>=18 && idade<=70) {
				System.out.println(nome + " você é obrigado(a) a votar.");
			}else {
				System.out.println(nome + " o seu voto é facultativo");
			}
		}else {
			System.out.println("Não vota");
		}
		
		
		
	}

}
