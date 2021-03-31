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
public class AddressBook {
    
    private String name;
    private Type type;
    ArrayList<Contact> contacts;

    public AddressBook(String name, Type type) {
        this.name = name;
        this.type = type;
        this.contacts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addContact(Contact c) {
        this.contacts.add(c);
    }
    
    public static enum Type {
        Private, Professionnal, Students
    }
}
