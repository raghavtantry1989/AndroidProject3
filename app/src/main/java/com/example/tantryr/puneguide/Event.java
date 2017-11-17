package com.example.tantryr.puneguide;

/**
 * Created by tantryr on 11/17/17.
 */

public class Event {
    private String eventName;
    private String eventDate;
    private String eventTime;

    public Event(String eventName, String eventDate, String imageTime) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventTime = imageTime;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public String getEventTime() {
        return eventTime;
    }
}
