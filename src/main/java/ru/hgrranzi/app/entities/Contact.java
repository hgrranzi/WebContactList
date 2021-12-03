package ru.hgrranzi.app.entities;

import java.util.Objects;

public class Contact {
    private String nickname; // letters, digits, _
    private String firstName; // letters, - in the middle, first uppercase
    private String lastName;
    private int age; // digits max 3
    private String phoneNumber; // digits 10
    private String email; // email format

    public Contact(String nickname, String firstName, String lastName, String age, String phoneNumber, String email) throws IllegalArgumentException {
        setNickname(nickname);
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setPhoneNumber(phoneNumber);
        setEmail(email);
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

    public void setAge(String age) {
        if (!age.matches("^[0-9]+$")) {
            throw new IllegalArgumentException("Invalid age format");
        }
        this.age = Integer.parseInt(age);
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
        return nickname.equals(contact.nickname) && phoneNumber.equals(contact.phoneNumber) && email.equals(contact.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, phoneNumber, email);
    }
}
