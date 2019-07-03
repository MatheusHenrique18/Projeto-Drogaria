package com.drogaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.drogaria.modelo.Pessoa;
import com.drogaria.negocio.GerenciarPessoa;

@Controller
public class PessoaController {
	
	@Autowired
	private GerenciarPessoa gerenciarPessoa;

	@GetMapping(value = "/pessoa/consultar/{idPessoa}")
	public ResponseEntity<Pessoa> consultarPessoa(@PathVariable("idPessoa") Integer idPessoa) {
		return new ResponseEntity<>(gerenciarPessoa.buscarPessoa(idPessoa), HttpStatus.OK);
	}
	
	@GetMapping(value = "/pessoa/consultar")
	@ResponseBody
	public ResponseEntity<List<Pessoa> >consultarTodos() {
		return new ResponseEntity<>(gerenciarPessoa.buscarTodos(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/pessoa/cadastrar", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Pessoa> cadastrarPessoa(@RequestBody Pessoa pessoa){
		return new ResponseEntity<>(gerenciarPessoa.cadastrarPessoa(pessoa), HttpStatus.OK);
	}
}
