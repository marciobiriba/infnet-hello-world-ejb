package br.edu.infnet.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.infnet.business.AlunoDTO;
import br.edu.infnet.domain.Aluno;

/**
 * Servlet implementation class ServeletCadastrarAluno
 */
@WebServlet("/ServeletCadastrarAluno")
public class ServeletCadastrarAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @EJB
	private AlunoDTO alunoDto;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletCadastrarAluno() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processa(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	public void processa(HttpServletRequest request, HttpServletResponse response){
		Aluno alunoCadastro = new Aluno();
		alunoCadastro.setNome("Andre");
		alunoCadastro.setTurma("POS");
		alunoDto.cadastrar(alunoCadastro);
		
	}
}
