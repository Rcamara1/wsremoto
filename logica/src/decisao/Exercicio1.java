package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
		/*
		 * 1. Elabore uma aplicação que leia o valor de dois números inteiros e a operação aritmética desejada (+, -, * ou /); 
		 *    calcule, então, a resposta adequada.  
			  Se optar por uma divisão, leve em consideração que não podemos ter um número dividido por zero.
 		   2. Escreva um código que leia três valores inteiros e diferentes e mostre-os em ordem decrescente. 
		 */
		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor1"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor2"));
		String operador = JOptionPane.showInputDialog("Digite o operador");
		if (operador.equals("+")) {
			System.out.println("O resultado é: " + (valor1+valor2));
		}else if (operador.equals("-")) {
			System.out.println("O resultado é: " + (valor1-valor2));
		}else if (operador.equals("*")) {
			System.out.println("O resultado é: " + (valor1*valor2));
		}else if (operador.equals("/")) {
			if (valor2!=0) {
				System.out.println("O resultado é: " + (valor1/valor2));
			}else {
				System.out.println("O segundo valor não pode ser zero");
			}
		}else {
			System.out.println("Digite um operador válido");
		}
	}

}
