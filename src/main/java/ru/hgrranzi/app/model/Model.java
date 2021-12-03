package ru.hgrranzi.app.model;

import ru.hgrranzi.app.entities.Contact;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private static Model INSTANCE;

    private List<Contact> contactList;

    private Model() {
        this.contactList = new ArrayList<>();
    };

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public static Model getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Model();
        }
        return INSTANCE;
    }

    public void addContact(Contact contact) {
        this.contactList.add(contact);
    }

    public List<String> listContacts() {
        List<String> namesList = new ArrayList<>(this.contactList.size());

        for (Contact contact : this.contactList) {
            namesList.add(contact.getNickname());
        }
        return namesList;
    }
}
