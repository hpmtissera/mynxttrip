package com.lanka_guide.mynxttrip.model.activity;

import com.lanka_guide.mynxttrip.model.place.Place;

import java.time.LocalDate;

public class Activity extends AbstractActivity {
    Place place;
    String description;

    public Activity(LocalDate date, Place place, String description) {
        super(date, place.getTimeZone());
        this.place = place;
        this.description = description;
    }

}
