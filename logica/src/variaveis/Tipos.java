package variaveis;

public class Tipos {

	public static void main(String[] args) {
		// <tipo do dado>  <nome da variavel/objeto>;
		// String (alfamuerico)
		// int[numeros interiros] e double [numeros reais] (numerico)
		
		String nome = "Ronaldo Camara";
		int idade = 48;
		double altura = 1.68;
		double peso = 68.200;
		System.out.println("Nome...: " + nome);
		System.out.println("Idade..: " + idade + " anos.");
		System.out.println("Altura.: " + altura + " metros.");
	    System.out.println("Peso...: " + peso + " kilos");
	
	    double imc = peso / (altura * altura);
	    
	    //No prinft() usamos:
	    // %s =>> para String
	    // %f =>> para numeros reais
	    // %d =>> para numeros inteiros
	    
	    System.out.printf("IMC....: %.2f\n", imc);
	    System.out.printf("%s seu imc é: %.2f\n",nome,imc);
	
	    
	   /*
	    * 
	    *          >> >>>>>>>>>>>  Regras  <<<<<<<<<<<<<<<<<<<<<<
	    *           
	    * Identificador (nome de classe / hone de variavel / nome de metodo
	    * Regras:
	    * 
	    * 1º Não começaras com numeros. Exemplo errado: 1berto >>  h1berto
	    * 2º Não utilizaras palavras reservadas da linguagem. Exemplo: public, int, double
	    * 3º Não faras uso de caracteres especiais. Exemplo: @, !, , . &´ ~ %
	    * 
	    * 
	    * Padrões
	    * 
	    * 1º Nomes significativos
	    * 2º Utilizar o padrão CamelCase
	    * Correto: dataDeNascimento
	    * Errado : datadenascimento
	    * Correto: data_de_nascimento
	    * 
	    * 3º Respeite as caixas e os padrões dos recursos:
	    * Classe  : SEMPRE começa com a letra maiscula
	    * Variavel: sempre começa com minuscula (substantivo)
	    * Metodo: senpre comela com a mincuscula e é seguiodo de parenteses (verbo)
	    * 
	    *  
	    * xpt >>> variavel   xptp()   Xpto   Xpto( ) :>> Não pode
	    * 4º
	    * 
	    * 
	    * 
	    */
	    
	    
	    
	    
	}
	

}
