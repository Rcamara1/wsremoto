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
	    System.out.printf("%s seu imc �: %.2f\n",nome,imc);
	
	    
	   /*
	    * 
	    *          >> >>>>>>>>>>>  Regras  <<<<<<<<<<<<<<<<<<<<<<
	    *           
	    * Identificador (nome de classe / hone de variavel / nome de metodo
	    * Regras:
	    * 
	    * 1� N�o come�aras com numeros. Exemplo errado: 1berto >>  h1berto
	    * 2� N�o utilizaras palavras reservadas da linguagem. Exemplo: public, int, double
	    * 3� N�o faras uso de caracteres especiais. Exemplo: @, !, , . &� ~ %
	    * 
	    * 
	    * Padr�es
	    * 
	    * 1� Nomes significativos
	    * 2� Utilizar o padr�o CamelCase
	    * Correto: dataDeNascimento
	    * Errado : datadenascimento
	    * Correto: data_de_nascimento
	    * 
	    * 3� Respeite as caixas e os padr�es dos recursos:
	    * Classe  : SEMPRE come�a com a letra maiscula
	    * Variavel: sempre come�a com minuscula (substantivo)
	    * Metodo: senpre comela com a mincuscula e � seguiodo de parenteses (verbo)
	    * 
	    *  
	    * xpt >>> variavel   xptp()   Xpto   Xpto( ) :>> N�o pode
	    * 4�
	    * 
	    * 
	    * 
	    */
	    
	    
	    
	    
	}
	

}
