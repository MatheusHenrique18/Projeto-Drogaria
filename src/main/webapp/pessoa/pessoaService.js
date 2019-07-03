app.service("pessoaService", function($http){
	
	this.salvar = function(pessoa){
		return $http.post("pessoa/cadastrar", pessoa);
	};
	
	this.buscar = function(idPessoa){
		return $http.get("pessoa/consultar/" + idPessoa);
	};
	
	this.buscarTodos = function(){
		return $http.get("pessoa/consultar");
	};
});