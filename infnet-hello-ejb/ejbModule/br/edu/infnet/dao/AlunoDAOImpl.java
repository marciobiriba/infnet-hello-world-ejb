package br.edu.infnet.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.infnet.domain.Aluno;

public class AlunoDAOImpl implements AlunoDAO{
	@PersistenceContext(unitName="infnet-hello-ejb")
	private EntityManager em;
	
	@Override
	public void cadastrar(Aluno aluno) {
		// TODO Auto-generated method stub
		em.persist(aluno);
	}

	@Override
	public void alterar(Aluno aluno) {
		em.merge(aluno);
		
	}

	@Override
	public void excluir(Aluno aluno) {
		em.remove(em.merge(aluno));
		
	}

}
