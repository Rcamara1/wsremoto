package variaveis;

import javax.swing.JOptionPane;

public class Notas {
	
	/*
	 * Solicitar um home de aluno e duas notas, calcular a media
	 * e exibir uma mensagem para o aluno da seguinte forma:
	 * "Aluno xxxx , sua emdia obtida foi xxxxx
	 */

	public static void main(String[] args) {
		String aluno = JOptionPane.showInputDialog("Digite seu nome");
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
		double media = (n1 + n2)/2;
		System.out.println("Aluno " + aluno + ", sua media obtida foi " + media +  " para 10 faltaram: " + (10-media) + " pontos");
			
		
		
		
		/*Tipos primitivos  - Wrappers
		 * boolean  - Boolean  >>   true ou false 
		 * char    -  Charactec
		 * 
		 * 
		 * São os inteiros
		 * short   - Short (-32...... /  +32.....)
		 * byte   - Byte 
		 * int  -  Intereger
		 * long  - Long
		 * 
		 * São os reais
		 * float - 
		 * double  - Double 
          


		 */
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
