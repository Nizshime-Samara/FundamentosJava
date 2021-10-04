package menus;

import modelos.Aluno;

public class ListarAlunosAprovados extends ListarAlunos {

	@Override
	public String getDescricao() {
		return "Listar alunos aprovados";
	}

	@Override
	public boolean deveImprimir(Aluno aluno) {
		return aluno.passou();
	}

}
