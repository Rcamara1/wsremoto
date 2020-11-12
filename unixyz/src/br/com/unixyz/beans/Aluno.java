package br.com.unixyz.beans;
/*
 * Design Patter >>  coleção de boas  práticas para Orientação e Objeto (OO)
 * DTO (Data Transfer Objetc)  >> ensina a melhor forma de criar uma classe modelo
 * 1 - Todos os atributos dever ser privados
 * 2 - Cada atributo dever possuir um Getter (output) e em Setter (input)
 * 3 - Toda classe modelo, deve possuir no minimo UM construtor vazio
 *     mais UM construtor para todos os atributos (cheio)
 * 
 * Modelo = Beans = JavaBeans = TO = DTO = Model
 *  
 * 
 * 
 */





public class Aluno {

	public Aluno(int rm, String nome, String email) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.email = email;
	}

	private int rm;
	private String nome;
	private String email;
	
	public String getAll() {
		return 
				"RM: " + rm + "\n" +
				"Nome: " + nome + /
				
	
	public void SetAll(int rm, String none, String email) {
		this.rm=rm;
		this.nome=nome;
		this.email.email;
		
	}
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
	
	

		
		
		
		
		
		
		
		
		

	}

}
