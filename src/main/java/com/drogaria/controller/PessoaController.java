package com.drogaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.drogaria.modelo.Pessoa;
import com.drogaria.negocio.GerenciarPessoa;

@Controller
public class PessoaController {
	
	@Autowired
	private GerenciarPessoa gerenciarPessoa;

	@GetMapping(value = "/pessoa/consultar")
	public ResponseEntity<Pessoa> consultarPessoa() {
		return new ResponseEntity<>(gerenciarPessoa.buscarPessoa(1), HttpStatus.OK);
	}
}
