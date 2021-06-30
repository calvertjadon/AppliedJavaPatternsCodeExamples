package com.calvertjadon.ajpcodeexamples.builder;

import java.util.Date;
import java.util.ArrayList;

public class Appointment {
    private Date startDate;
    private Date endDate;
    private String description;
    private ArrayList attendees = new ArrayList();
    private Location location;

    public static final String EOL_STRING = System.getProperty("line.separator");

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList getAttendees() {
        return attendees;
    }

    public Location getLocation() {
        return location;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setAttendees(ArrayList attendees) {
        if (attendees != null) {
            this.attendees = attendees;
        }
    }

    public void addAttendee(Contact attendee) {
        if (!attendees.contains(attendee)) {
            attendees.add(attendee);
        }
    }

    public void removeAttendee(Contact attendee) {
        attendees.remove(attendee);
    }

    @Override
    public String toString() {
        return "  Description: " + description + EOL_STRING + "  Start Date: " + startDate + EOL_STRING + "  End Date: "
                + endDate + EOL_STRING + "  Location: " + location + EOL_STRING + "  Attendees: " + attendees;
    }
}
