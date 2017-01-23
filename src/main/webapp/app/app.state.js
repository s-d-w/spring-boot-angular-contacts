(function() {
    'use strict';

    angular
        .module('ContactsApp')
        .config(stateConfig);

    stateConfig.$inject = ['$stateProvider', '$urlRouterProvider'];

    function stateConfig($stateProvider, $urlRouterProvider) {
        
        $stateProvider.state('app', {
            abstract: true,
            views: {}
        });
        
        $urlRouterProvider.otherwise('/')           
    }
})();

