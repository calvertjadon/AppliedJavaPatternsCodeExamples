package com.calvertjadon.ajpcodeexamples.abstractfactory;

public class FrenchAddress extends Address {
    private static final String COUNTRY = "FRANCE";

    public static String getCountry() {
        return COUNTRY;
    }

    @Override
    public String getFullAddress() {
        return getStreet() + EOL_STRING +
                getPostalCode() + SPACE + getCity() + EOL_STRING +
                COUNTRY + EOL_STRING;
    }
}
