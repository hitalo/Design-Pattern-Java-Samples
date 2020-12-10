package br.main;

public class Main {

	public static void main(String[] args) {
		

		Email email1 = new EmailBuilder()
						.setTitulo("Solicita��o")
						.setCorpo("Solicito que o ....")
						.addDestinatario("fulano@email.com")
						.addDestinatario("sicrano@emil.com")
						.addDestinatario("beltrano@email.com")
						.build();
		
		enviarEmail(email1);
		
		Email email2 = new EmailBuilder()
				.setTitulo("Corre��o")
				.setCorpo("Corrigindo o que foi ...")
				.addDestinatario("fulano@email.com")
				.addSaudacao()
				.build();

		enviarEmail(email2);
		
	}
	
	public static void enviarEmail(Email email) {
		System.out.println(email);
	}

}
