package com.drogaria.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drogaria.modelo.Pessoa;
import com.drogaria.modelo.PessoaRepository;

@Service
public class GerenciarPessoa {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa buscarPessoa(Integer idPessoa) {
		return pessoaRepository.findById(idPessoa).get();
	}
}
