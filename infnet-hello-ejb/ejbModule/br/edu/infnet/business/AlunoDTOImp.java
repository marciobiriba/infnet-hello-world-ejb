package br.edu.infnet.business;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.edu.infnet.dao.AlunoDAO;
import br.edu.infnet.domain.Aluno;

@Stateless
public class AlunoDTOImp implements AlunoDTO {
	@EJB
	private AlunoDAO alunoDao;
	
	@Override
	public void cadastrar(Aluno aluno) {
		// TODO Auto-generated method stub
		alunoDao.cadastrar(aluno);
	}

	@Override
	public void alterar(Aluno aluno) {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluir(Aluno aluno) {
		// TODO Auto-generated method stub

	}

}
