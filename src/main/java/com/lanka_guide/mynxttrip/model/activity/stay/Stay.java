package com.lanka_guide.mynxttrip.model.activity.stay;

import com.lanka_guide.mynxttrip.model.activity.AbstractActivity;
import com.lanka_guide.mynxttrip.model.place.Place;

import java.time.LocalDate;

public abstract class Stay extends AbstractActivity {
    Place place;

    public Stay(Place place, LocalDate checkin, LocalDate checkout) {
        super(checkin, checkout, place.getTimeZone());
        this.place = place;
    }
}