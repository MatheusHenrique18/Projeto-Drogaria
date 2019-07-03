app.config(function($routeProvider){
    $routeProvider.
    when("/cadastrar-pessoa",{
        templateUrl : "pessoa/pessoaView.html",
        controller: "pessoaController"
    }).
    otherwise ({
        redirectTo: '/cadastrar-pessoa'
    });
});