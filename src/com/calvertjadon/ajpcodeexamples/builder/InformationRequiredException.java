package com.calvertjadon.ajpcodeexamples.builder;

public class InformationRequiredException extends Exception {
    public InformationRequiredException(int requiredElements) {
        super(String.format("Missing: %s", requiredElements));
    }
}
