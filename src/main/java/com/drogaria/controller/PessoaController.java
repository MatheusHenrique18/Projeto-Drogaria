package com.drogaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drogaria.modelo.Pessoa;
import com.drogaria.negocio.GerenciarPessoa;

@RestController
public class PessoaController {
	
	@Autowired
	private GerenciarPessoa gerenciarPessoa;

	@GetMapping(value = "/pessoa/consultar")
	public Pessoa consultarPessoa() {
		return gerenciarPessoa.buscarPessoa(1);
	}
}
