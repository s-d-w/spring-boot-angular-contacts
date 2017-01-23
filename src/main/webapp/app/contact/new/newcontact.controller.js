(function() {
    'use strict';

    angular
        .module('ContactsApp')
        .controller('NewContactController', NewContactController);

    NewContactController.$inject = ['$state', '$log', 'Contacts'];

    function NewContactController($state, $log, Contacts) {
        var vm = this;
        vm.createContact = createContact;
        
        function createContact(newContact) {
            $log.log(newContact);
            Contacts.save(newContact, function() {
                $state.go('home');
            });
            //$state.go('home', {}, { reload: true });
        }        
        
    }
})();


