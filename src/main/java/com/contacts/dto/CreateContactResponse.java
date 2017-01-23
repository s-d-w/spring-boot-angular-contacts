package com.contacts.dto;

import com.contacts.domain.Contact;

public class CreateContactResponse {
    
    private ContactDTO contact;
    
    public CreateContactResponse() {}
    
    public CreateContactResponse(Contact contact) {
        this.contact = new ContactDTO(contact);
    }
    
    public ContactDTO getContact() {
        return contact;
    }

    public void setContact(ContactDTO contact) {
        this.contact = contact;
    }    
}
