package br.com.fiap.health.track;

/**
 * Classe que fara o calculo do Indice de Massa Corporal
 * @author Vitor Mizael Angeli da Silva
 * @version 1.0
 */

public class Imc{
	
	public double peso;
	public double altura;
	public String biotipo;
	public String tipoTreino;
	
	/**
	 * Informa o IMC do ususario
	 * @return Calculado dividindo o peso (em kg) pela altura ao quadrado (em metros)
	 */
	public double calcularIMC(double result) {
		return result ;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getBiotipo() {
		return biotipo;
	}
	public void setBiotipo(String biotipo) {
		this.biotipo = biotipo;
	}
	
	
}