package br.com.fiap.health.track;

/**
 * Classe que abstrai o Usuario que esta cadastrado
 * @author Vitor Mizael Angeli da Silva
 * @version 1.0
 */

public abstract class Usuario {
	
	private String nome;
	private int telefone;
	private String email;
	
	/**
	 * Informa o nome do Usuario do sistema
	 * @return O nome do Usuario
	 */
	public String informarNome() {
		return nome;
	}
	/**
	 * Informa o telefone do Usuario do sistema
	 * @return O nome do Usuario
	 */
	public int informarTelefone() {
		return telefone;
	}
	/**
	 * Informa o e-mail do Usuario do sistema
	 * @return O e-mail do Usuario
	 */
	public String informarEmail() {
		return email;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getTelefone() {
		return telefone;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
