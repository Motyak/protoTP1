/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.model;

import java.util.ArrayList;

/**
 *
 * @author Tom
 */
public class Contact {
    private Address address;
    private Email email;
    private ArrayList<PhoneNumber> phoneNumbers;
    
    private String firstName;
    private String lastName;
    private Integer age;
    private boolean genre;
    
    public Contact(String firstName, String lastName, Integer age, boolean genre) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.genre = genre;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGenre(boolean genre) {
        this.genre = genre;
    }
    
    public Address getAddress() {
        return address;
    }

    public Email getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }
    
    public boolean getGenre() {
        return genre;
    }
    
    public void setAddress(Address addr) {
        this.address = addr;
    }
    
    public void setEmail(Email email) {
        this.email = email;
    }
    
    public void addPhoneNumber(PhoneNumber nb) {
        this.phoneNumbers.add(nb);
    }
}
