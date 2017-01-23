package com.contacts.bootstrap;

import com.contacts.domain.Contact;
import com.contacts.repository.ContactRepository;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class ContactsBootstrap implements Bootstrap {
    
    private static final Logger LOG = Logger.getLogger(ContactsBootstrap.class.getName());    
    
    final private ContactRepository contactRepository;
    
    @Autowired
    public ContactsBootstrap(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }
    
    @Override
    public void bootstrap() {
        LOG.log(Level.INFO, "Loading bootstrap data for contacts..");
        
        Contact a = new Contact();
        a.setFirstName("Lebron");
        a.setLastName("James");
        a.setStreetAddress("East 1999");
        a.setCity("Cleaveland");
        a.setState("Ohio");
        a.setZip("00000");
        a.setPhoneNumber("123-123-1234");
        contactRepository.save(a);
        
        Contact b = new Contact();
        b.setFirstName("Kobe");
        b.setLastName("Bryant");
        b.setStreetAddress("Sunset");
        b.setCity("Los Angeles");
        b.setState("California");
        b.setZip("00000");
        b.setPhoneNumber("123-123-1234");
        contactRepository.save(b);
        
        Contact c = new Contact();
        c.setFirstName("Stephen");
        c.setLastName("Curry");
        c.setStreetAddress("Twin Peaks");
        c.setCity("San Francisco");
        c.setState("California");
        c.setZip("00000");
        c.setPhoneNumber("123-123-1234");
        contactRepository.save(c);        
        
    }

    @Override
    public int getOrder() {
        return 100;
    }

}
