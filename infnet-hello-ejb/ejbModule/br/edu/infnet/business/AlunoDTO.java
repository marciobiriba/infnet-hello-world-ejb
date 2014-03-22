package br.edu.infnet.business;

import javax.ejb.Local;


import br.edu.infnet.domain.Aluno;
@Local
public interface AlunoDTO {
	void cadastrar(Aluno aluno);
	void alterar(Aluno aluno);
	void excluir(Aluno aluno);
}
