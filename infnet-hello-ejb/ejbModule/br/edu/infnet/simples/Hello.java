package br.edu.infnet.simples;

import javax.ejb.Local;

@Local
public interface Hello {
	String escrever();
}
