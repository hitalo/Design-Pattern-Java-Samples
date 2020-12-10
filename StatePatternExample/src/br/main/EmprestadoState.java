package br.main;

public class EmprestadoState extends LivroState {
	
	private static EmprestadoState instancia;
	
	@Override
	public void solicitar(Livro livro) {
		System.out.println("Livro n�o dispon�vel!");
	}

	@Override
	public void devolver(Livro livro) {
		System.out.println("Livro sendo devolvido!");
		livro.setState(DisponivelState.instacia());
	}

	
	public static EmprestadoState instacia() {
		if(instancia == null)
			instancia = new EmprestadoState();
		
		return instancia;
	}
}
