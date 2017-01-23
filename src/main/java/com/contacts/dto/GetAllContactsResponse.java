package com.contacts.dto;

import com.contacts.domain.Contact;
import java.util.ArrayList;
import java.util.List;

public class GetAllContactsResponse {
    
    private List<ContactDTO> contacts;
    
    public GetAllContactsResponse() {}
    
    public GetAllContactsResponse(List<Contact> contactsList) {
        contacts = new ArrayList<>();
        contactsList.stream().forEach(c -> {
            contacts.add(new ContactDTO(c));
        });
    }    
    
    public List<ContactDTO> getContacts() {
        return contacts;
    }

    public void setContacts(List<ContactDTO> contacts) {
        this.contacts = contacts;
    }    
    
}
