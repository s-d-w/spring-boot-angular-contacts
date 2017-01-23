(function() {
    'use strict';

    angular
        .module('ContactsApp')
        .config(stateConfig);

    stateConfig.$inject = ['$stateProvider'];

    function stateConfig($stateProvider) {

        $stateProvider.state('home', {
            parent: 'app',
            url: '/',
            cache: false,
            views: {
                'content@': {
                    templateUrl: 'app/home/home.html',
                    controller: 'HomeController',
                    controllerAs: 'vm'
                }
            },
            resolve: {
                contactsList: ['Contacts',
                    function (Contacts) {
                        return Contacts.get();
                    }
                ]
            }
            
        });
    }
})();

