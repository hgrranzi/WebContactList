package ru.hgrranzi.app.model;

import ru.hgrranzi.app.entities.Contact;

import java.util.*;

public class Model {
    private static Model INSTANCE;

    private final Map<String, Contact> contactMap;

    private Model() {
        this.contactMap = new HashMap<>();
    };

    public Map<String, Contact> getContactMap() {
        return contactMap;
    }

    public static Model getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Model();
        }
        return INSTANCE;
    }

    public void addContact(String key, Contact contact) {
        if (contactMap.containsKey(key)) {
            throw new IllegalArgumentException("Contact with that nickname already exists.");
        }
        this.contactMap.put(key, contact);
    }

    public List<String> listContacts() {
        List<String> namesList = new ArrayList<>(this.contactMap.size());

        for (Map.Entry<String, Contact> entry : contactMap.entrySet()) {
            namesList.add(entry.getValue().getNickname());
        }
        return namesList;
    }
}
