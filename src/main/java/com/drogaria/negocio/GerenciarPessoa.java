package com.drogaria.negocio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drogaria.modelo.Pessoa;
import com.drogaria.modelo.PessoaRepository;

@Service
public class GerenciarPessoa {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa buscarPessoa(Integer idPessoa) {
		Pessoa pessoa = new Pessoa();
		pessoa.setId(1);
		pessoa.setNome("João");
		pessoa.setCpf("123456");
		pessoaRepository.save(pessoa);
		Optional<Pessoa> pessoa2 = pessoaRepository.findById(idPessoa);
		return pessoa2.get();
	}
}
