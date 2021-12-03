package ru.hgrranzi.app.entities;

import java.util.Objects;

public class Contact {
    private String nickname;
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;
    private String email;

    public Contact(String nickname, String firstName, String lastName, int age, String phoneNumber, String email) {
        this.nickname = nickname;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return age == contact.age && firstName.equals(contact.firstName) && lastName.equals(contact.lastName) && Objects.equals(phoneNumber, contact.phoneNumber) && Objects.equals(email, contact.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, phoneNumber, email);
    }
}
