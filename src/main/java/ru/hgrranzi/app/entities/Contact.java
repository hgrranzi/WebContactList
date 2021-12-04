package ru.hgrranzi.app.entities;

import java.util.Objects;

public class Contact {
    private String nickname;
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;
    private String email;

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
        if (!nickname.matches("\\w+\\s*")) {
            throw new IllegalArgumentException("Invalid nickname format.");
        }
        this.nickname = nickname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (!firstName.matches("[a-zA-Z]+\\s*")) {
            throw new IllegalArgumentException("Invalid first name format.");
        }
        StringBuilder name = new StringBuilder(firstName);
        name.setCharAt(0, Character.toUpperCase(name.charAt(0)));
        this.firstName = name.toString();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (!lastName.matches("[a-zA-Z]+\\s*")) {
            throw new IllegalArgumentException("Invalid last name format.");
        }
        StringBuilder name = new StringBuilder(lastName);
        name.setCharAt(0, Character.toUpperCase(name.charAt(0)));
        this.lastName = name.toString();
    }

    public int getAge() {
        return age;
    }

    public void setAge(String age) {
        if (!age.matches("\\d{1,4}\\s*")) {
            throw new IllegalArgumentException("Invalid age format.");
        }
        this.age = Integer.parseInt(age);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (!phoneNumber.matches("\\d{5,11}\\s*")) {
            throw new IllegalArgumentException("Invalid phone number format.");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.matches("^(.+)@\\S+$")) {
            throw new IllegalArgumentException("Invalid email format.");
        }
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
