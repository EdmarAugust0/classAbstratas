package br.com.edmar;

public class App {
	public static void main(String args[]) {
		Pjuridica juridica = new Pjuridica();
		juridica.setName("Edmar");
		juridica.setLastName("Vieira");
		juridica.setGender("M");
		juridica.setCnpj("741 852 963");
		System.out.println("\nNome do candidato: " + juridica.getName() + " " + juridica.getLastName() + " com o CNPJ: " + juridica.getCnpj());
		
		Pfisica fisica = new Pfisica();
		fisica.setName("Ruan");
		fisica.setLastName("Honorato");
		fisica.setGender("M");
		fisica.setCpf("147 258 369");
		System.out.println("\nNome do candidato: " + fisica.getName() + " " + fisica.getLastName() + " com o CPF: " + fisica.getCpf());
	}
}
