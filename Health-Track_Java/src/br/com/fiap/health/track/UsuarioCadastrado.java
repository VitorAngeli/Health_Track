package br.com.fiap.health.track;

/**
 * Classe que informa os dados do Usuario que ja esta cadastrado
 * @author Vitor Mizael Angeli da Silva
 * @version 1.0
 */

public class UsuarioCadastrado extends Usuario{
	
	private int numeroIdentificacao;
	private byte idade;
	private String login;
	private String formulario;
	
	/**
	 * Informa que o Usuario quer fazer o Login
	 * @return O login do usuario 
	 */
	public String fazerLogin() {
		return login;
	}
	/**
	 * Informa que o Usuario ainda nao fez o Login e sera direcionado para o formulario
	 * @return O formulario
	 */
	public String fazerFormulario() {
		return formulario;
	}
	
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(byte idade) {
		this.idade = idade;
	}
	
	public int getNumeroIdentificacao() {
		return numeroIdentificacao;
	}
	
	public void setNumeroIdentificacao(int numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getFormulario() {
		return formulario;
	}
	
	public void setFormulario(String formulario) {
		this.formulario = formulario;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}

}
