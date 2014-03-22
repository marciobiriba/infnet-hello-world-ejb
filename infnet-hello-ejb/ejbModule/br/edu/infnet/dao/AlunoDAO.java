package br.edu.infnet.dao;

import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.infnet.domain.Aluno;

/**
 * Session Bean implementation class AlunoDAO
 */
@Stateless
@Local
public interface AlunoDAO {
	
	void cadastrar(Aluno aluno);
	void alterar(Aluno aluno);
	void excluir(Aluno aluno);

}
