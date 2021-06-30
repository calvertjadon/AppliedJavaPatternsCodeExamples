package com.calvertjadon.ajpcodeexamples.builder;

public class Location {
    private String location;

    public Location(String location) {
        setLocation(location);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return location;
    }
}
