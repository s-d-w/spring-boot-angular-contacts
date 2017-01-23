package com.contacts.domain;

import com.contacts.ContactsApp;
import com.contacts.repository.ContactRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ContactsApp.class)
@Transactional
public class ContactTest {
    
    @Autowired
    private ContactRepository contactRepository;
    
    @Before
    public void init() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void contactPersistence() {
        
        Contact contact = new Contact();
        contact.setFirstName("Foo");
        contact.setLastName("bar");
        contact.setStreetAddress("123 Some St.");
        contact.setCity("San Francisco");
        contact.setState("California");
        contact.setZip("94100");
        contact.setPhoneNumber("415-555-5555");
        contact = contactRepository.saveAndFlush(contact);
        
        Contact c = contactRepository.findOne(contact.getId());
        assertEquals("Foo", c.getFirstName());
        assertEquals("123 Some St.", c.getStreetAddress());
        assertEquals("415-555-5555", c.getPhoneNumber());
        
    }
    
}

