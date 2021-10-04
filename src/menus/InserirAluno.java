package menus;

import modelos.Aluno;

public class InserirAluno extends ItemDeMenu {

	@Override
	public String getDescricao() {
		return "Inserir aluno";
	}

	@Override
	public boolean executar() {
		String matricula = leitor.lerString("Matrícula: ");
		String nome = leitor.lerString("Nome: ");
		double p1 = leitor.lerDouble("Certicação1: ");
		double p2 = leitor.lerDouble("Certicaçã2: ");

		Aluno aluno = new Aluno(matricula, nome);
		aluno.setP1(p1);
		aluno.setP2(p2);

		dao.inserir(aluno);

		System.out.println("Aluno cadastrado com sucesso!");

		return false;
	}

}
