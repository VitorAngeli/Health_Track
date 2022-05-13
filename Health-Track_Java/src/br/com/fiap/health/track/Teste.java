package br.com.fiap.health.track;

public class Teste {
	
	public static void main(String[] args) {
		UsuarioCadastrado uc = new UsuarioCadastrado();
		Formulario f = new Formulario();
		
		if (uc.equals(f.fezRegistro()) ) {
			uc.setLogin(uc.fazerLogin());
			uc.getNumeroIdentificacao();
			System.out.println("Login efetuado com sucesso!");
		}else {
			uc.setFormulario(uc.fazerFormulario());
			System.out.println("Usuario nao cadastrado!");
		}
		
		Imc result = new Imc();
		result.altura = 1.70;
		result.peso = 70.0; 
		
		
		if (result.calcularIMC(result.peso / (result.altura * result.altura)) < 18.5) {
			
			System.out.println(result.calcularIMC(result.peso / (result.altura * result.altura)));
			System.out.println("Abaixo do peso");
		
		}else if (result.calcularIMC(result.peso / (result.altura * result.altura)) <= 25) {
			
			System.out.println(result.calcularIMC(result.peso / (result.altura * result.altura)));
			System.out.println("Peso Ideal");
		
		}else if (result.calcularIMC(result.peso / (result.altura * result.altura)) <= 30) {
			
			System.out.println(result.calcularIMC(result.peso / (result.altura * result.altura)));
			System.out.println("Sobrepeso");
		
		}else if (result.calcularIMC(result.peso / (result.altura * result.altura)) <= 40) {
			
			System.out.println(result.calcularIMC(result.peso / (result.altura * result.altura)));
			System.out.println("Obesidade");
		
		}else {
			System.out.println(result.calcularIMC(result.peso / (result.altura * result.altura)));
			System.out.println("CUIDADO! Obesidade morbida");
		}
		
		
		
		
		
		
	}
}
