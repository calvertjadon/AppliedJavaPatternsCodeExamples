package com.calvertjadon.ajpcodeexamples.builder;

public class Contact {
    private String firstName;
    private String lastName;

    public Contact(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public void setFirstName(String firstName) {
        String upperCase = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        this.firstName = upperCase;
    }

    public void setLastName(String lastName) {
        String upperCase = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        this.lastName = upperCase;
    }

    @Override
    public String toString() {
        return getName();
    }
}
