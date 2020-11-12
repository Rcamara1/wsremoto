package br.com.unixyz.implementacao;

public class ImplementarProfessor2 {

	public static void main(String[] args) {
		Professor professor = new Professor();
		Endereço endereco = new Endereco();
		professor.setAll (
				1,
				"PASCOALLI",
				"DOUTOR",
				"1234-5678",
				endereco);
		endereco.setAll(
				"AVENIDA PAULISTA",
				"3500",
				false,
				"CENTRO",
				"SAO PAULO",
				"SP",
				"1234-000"
				);
		System.out.println(professor.get.All());
		
					

	}

}
