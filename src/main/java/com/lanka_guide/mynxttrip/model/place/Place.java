package com.lanka_guide.mynxttrip.model.place;

import java.time.ZoneId;

public class Place {
    String name;
    Location location;
    ZoneId timeZone;

    public Place(String name) {
        this.name = name;
    }

    public Place(String name, ZoneId timeZone) {
        this.name = name;
        this.timeZone = timeZone;
    }

    public ZoneId getTimeZone() {
        return timeZone;
    }
}
