package com.drogaria.negocio;

import java.util.ArrayList;
import java.util.List;
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
		Optional<Pessoa> pessoa2 = pessoaRepository.findById(idPessoa);
		return pessoa2.get();
	}
	
	public List<Pessoa> buscarTodos() {
		List<Pessoa> pessoas = new ArrayList<>();
		Iterable<Pessoa> resultado = pessoaRepository.findAll();
		resultado.forEach(pessoas::add);
		return pessoas;
	}
	
	
	public Pessoa cadastrarPessoa(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	public Pessoa deletarPessoa(Integer idPessoa) {
		Optional<Pessoa> pessoa = pessoaRepository.findById(idPessoa);
		if (pessoa != null) {
			pessoaRepository.deleteById(idPessoa);
		}
		return pessoa.get();
	}
}
