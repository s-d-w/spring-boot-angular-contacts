package com.contacts.controller;

import com.contacts.domain.Contact;
import com.contacts.dto.ContactDTO;
import com.contacts.dto.CreateContactResponse;
import com.contacts.dto.GetAllContactsResponse;
import com.contacts.service.ContactService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ContactController {
    
    private final ContactService contactService;
    
    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }
    
    @RequestMapping(value = "/contacts",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GetAllContactsResponse> getAllContacts() {
        List<Contact> contacts = contactService.getAllContacts();
        return contacts != null ? new ResponseEntity<>(new GetAllContactsResponse(contacts), HttpStatus.OK) 
                : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);        
    }   
    
    @RequestMapping(value = "/contacts",
        method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CreateContactResponse> createContact(@RequestBody ContactDTO contactDTO) {
        Contact contact = contactService.createContact(contactDTO);
        return contact != null ? new ResponseEntity<>(new CreateContactResponse(contact), HttpStatus.OK) 
                : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);  
    }    
    
}
