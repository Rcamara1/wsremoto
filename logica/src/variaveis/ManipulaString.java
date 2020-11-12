package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		String email = "xpto@itau-uniBanco.Com.bR";
		System.out.println("Original :  "  + email);
		System.out.println("Minuscula:  "  + email.toLowerCase());
		System.out.println("Maiuscula:  "  + email.toUpperCase());
		System.out.println("Qtde de caracteres:  "  + email.length());
		System.out.println("Tem arroba?  "  + email.contains("@"));
		System.out.println("Posi��o do @ "  + email.indexOf("@"));
		System.out.println("Do 2� ate 4�:"  + email.substring(1,5));
		// quero que exibam a primeira metade do email
		
		System.out.println("Primeira metade:"  + email.substring(0, email.length()/2));
		
		// quero que exibam a primeira metade do email
		System.out.println("Usu�rio:"  + email.substring(0, email.indexOf("@")));
		
		// quero que exibam o servidor
		System.out.println("Servidor:"  + email.substring(email.indexOf("@")+1).toLowerCase());
		System.out.println("Compara��o com case: "  + email.equals("xpto@itau-unibanco.com.br"));
		System.out.println("Compara��o sem case: "  + email.equalsIgnoreCase("xpto@itau-unibanco.com.br"));
		
		
		// TODO Auto-generated method stub

	}

}
