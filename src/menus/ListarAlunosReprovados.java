package menus;

import modelos.Aluno;

public class ListarAlunosReprovados extends ListarAlunos {

	@Override
	public String getDescricao() {
		return "Listar alunos reprovados";
	}

	@Override
	public boolean deveImprimir(Aluno aluno) {
		return !aluno.passou();
	}

}
