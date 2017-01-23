(function() {
    'use strict';

    angular
        .module('ContactsApp')
        .controller('HomeController', HomeController);

    HomeController.$inject = ['$state', 'contactsList', '$log'];

    function HomeController($state, contactsList, $log) {
        var vm = this;

        vm.contacts = contactsList;
        vm.createNewContact = createNewContact;
        
        function createNewContact() {
            $state.go('newcontact');
        }         
        
    }
})();

