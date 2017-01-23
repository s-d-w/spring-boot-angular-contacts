package com.contacts.dto;

import com.contacts.domain.Contact;

public class ContactDTO {
    
    private String firstName;
    
    private String lastName;
    
    private String streetAddress;
    
    private String city;
    
    private String state;
    
    private String zip;
    
    private String phoneNumber;    
    
    public ContactDTO() {}
    
    public ContactDTO(Contact contact) {
        this.firstName = contact.getFirstName();
        this.lastName = contact.getLastName();
        this.streetAddress = contact.getStreetAddress();
        this.city = contact.getCity();
        this.state = contact.getState();
        this.zip = contact.getZip();
        this.phoneNumber = contact.getPhoneNumber();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }    

}
