(function () {
    'use strict';

    angular
        .module('ContactsApp')
        .factory('Contacts', Contacts);

    Contacts.$inject = ['$resource'];

    function Contacts($resource) {
        
        var service = $resource('/api/contacts', {}, {
            query: {
                method: 'GET',
                isArray: true,
                transformResponse: function(data) {
                    return angular.fromJson(data).contacts;
                }
            }    
        });
        
        return service;
    }
})();

