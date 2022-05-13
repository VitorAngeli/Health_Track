package br.com.fiap.health.track;

/**
 * Classe que cadastra o novo Usuario no sistema 
 * @author Vitor Mizael Angeli da Silva
 * @version 1.0
 */

public class Formulario extends Usuario{
	
	private String registro;
	
	/**
	 * Informa se Usuario do sistema ja fez o registro
	 * @return Verdadeiro se acaso o usuario fez o rigistro do formulario 
	 */
	public Boolean fezRegistro() {
		return true;
	}
	/**
	 * Informa se Usuario do sistema ainda nao fez o registro
	 * @return falso se o ususario nao fez o registro no formulario
	 */
	public Boolean naoFezRegitro() {
		return false;
	}
	/**
	 * Informa que sera enviado o formulario de registro
	 * @return envia o registro do formulario
	 */
	public String enviarRegistro() {
		return registro;
	}
	
	public String getRegistro() {
		return registro;
	}
	
	public void setRegistro(String registro) {
		this.registro = registro;
	}
}
