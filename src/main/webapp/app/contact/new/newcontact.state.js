(function() {
    'use strict';

    angular
        .module('ContactsApp')
        .config(stateConfig);

    stateConfig.$inject = ['$stateProvider'];

    function stateConfig($stateProvider) {

        $stateProvider.state('newcontact', {
            parent: 'app',
            url: '/newcontact',
            views: {
                'content@': {
                    templateUrl: 'app/contact/new/newcontact.html',
                    controller: 'NewContactController',
                    controllerAs: 'vm'
                }
            }
        });
        
    }
})();

