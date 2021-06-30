package com.calvertjadon.ajpcodeexamples.builder;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Builder {
    public static void main(String[] args) {
        Contact tom = new Contact("Tom", "Delonge");
        Contact mark = new Contact("Mark", "Hoppus");

        Location newYork = new Location("New York");
        Location dallas = new Location("Dallas");

        Scheduler myScheduler = new Scheduler();

        AppointmentBuilder appointmentBuilder = new AppointmentBuilder();
        MeetingBuilder meetingBuilder = new MeetingBuilder();

        DateFormat format = new SimpleDateFormat("MM-dd-yyyy", Locale.ENGLISH);

        try {
            Appointment artGalleryVisit = myScheduler.createAppointment(appointmentBuilder, format.parse("07-02-2021"),
                    null, "Art Gallery Visit", newYork, new ArrayList<>(List.of(tom)));
            System.out.println(artGalleryVisit);
        } catch (InformationRequiredException | ParseException e) {
            e.printStackTrace();
        }

        System.out.println();

        try {
            Appointment javaOneConferenceAppointment = myScheduler.createAppointment(meetingBuilder,
                    format.parse("07-05-2021"), format.parse("07-07-2021"), "The JavaOne Developer Conference", dallas,
                    new ArrayList<>(List.of(tom, mark)));
            System.out.println(javaOneConferenceAppointment);
        } catch (InformationRequiredException | ParseException e) {
            e.printStackTrace();
        }
    }
}
