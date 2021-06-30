package com.calvertjadon.ajpcodeexamples.abstractfactory;

public class AbstractFactory {
    public static void main(String[] args) {
        Address[] addresses = new Address[2];

        addresses[0] = new USAddressFactory().createAddress();
        addresses[0].setCity("Lexington");
        addresses[0].setRegion("Kentucky");
        addresses[0].setPostalCode("12345");
        addresses[0].setStreet("1234 Cool Street");

        addresses[1] = new FrenchAddressFactory().createAddress();
        addresses[1].setCity("Paris");
        addresses[1].setRegion("Paris");
        addresses[1].setPostalCode("54321");
        addresses[1].setStreet("4321 Awesome Road");

        for (var address : addresses) {
            System.out.println(address.getFullAddress());
        }

        PhoneNumber[] phoneNumbers = new PhoneNumber[2];
        phoneNumbers[0] = new USAddressFactory().createPhoneNumber();
        phoneNumbers[0].setPhoneNumber("1234567890");

        phoneNumbers[1] = new FrenchAddressFactory().createPhoneNumber();
        phoneNumbers[1].setPhoneNumber("987654321");

        for (var number : phoneNumbers) {
            System.out.printf("+%s%s%n", number.getCountryCode(), number.getPhoneNumber());
        }
    }
}
