package variaveis;

import javax.swing.JOptionPane;

public class Entrada {

	public static void main(String[] args) {
		// Tipo de referencia: quando o tipo se refere a uma Classe
		
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		// Tipo primitivo: quando o tipo ja pertence a linguagem (come�a com a letra minuscula)
		// Tipo primitivo: precisa de um apoio. Esse apoio vem das classes "Wrappers"
		// int =>> Intereger
		// dougle =>> Dougle
		// boolean
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Didite a altura"));
		double peso =  Double.parseDouble(JOptionPane.showInputDialog("Didite o peso"));
		System.out.println("Nome...: " + nome);
		System.out.println("Idade..: " + idade + " anos.");
		System.out.println("Altura.: " + altura + " metros.");
	    System.out.println("Peso...: " + peso + " kilos");
	
	    double imc = peso / (altura * altura);
	    System.out.printf("IMC....: %.2f\n", imc);
	    System.out.printf("%s seu imc �: %.2f\n",nome,imc);
	
	}
	

}
