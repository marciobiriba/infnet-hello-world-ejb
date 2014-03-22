package br.edu.infnet.simples;

import javax.ejb.Stateless;

@Stateless
public class HelloImpl implements Hello{

	@Override
	public String escrever() {
		// TODO Auto-generated method stub
		return "Hello World!";
	}

}
