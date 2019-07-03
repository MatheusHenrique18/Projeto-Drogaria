app.controller("pessoaController", function($scope, pessoaService){
	
	function init(){
		//	Isso é um array
		$scope.pessoas = [];
		buscarTodos();
	}
	
	$scope.salvar = function(){
		//isso é um json
		//esse json foi montado com os parametros do teu formulário
		var pessoa = {
			id: $scope.id,
			nome: $scope.nome,
			cpf: $scope.cpf
		}
		pessoaService.salvar(pessoa).then(function(response){
			buscarTodos();
		}, function(erro){
			console.log("deu erro");
		});
		
	};
	
	$scope.alterar = function(pessoa){
		$scope.id = pessoa.id
		$scope.nome = pessoa.nome;
		$scope.cpf = pessoa.cpf;
	}
	
	$scope.excluir = function(pessoa){
		
	}
	
	buscarTodos = function(){
		pessoaService.buscarTodos().then(function(response){
			$scope.pessoas = response.data	
		});
	};
	
	$scope.buscarPessoas = function(){
		pessoaService.buscar()
	}
	
	init();
});